package chapter6.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;

import chapter6.beans.Message;
import chapter6.beans.User;
import chapter6.logging.InitApplication;
import chapter6.service.MessageService;

@WebServlet(urlPatterns = { "/edit" })
public class EditServlet extends HttpServlet {

	/**
	* ロガーインスタンスの生成
	*/
	Logger log = Logger.getLogger("twitter");

	/**
	* デフォルトコンストラクタ
	* アプリケーションの初期化を実施する。
	*/
	public EditServlet() {
		InitApplication application = InitApplication.getInstance();
		application.init();

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		log.info(new Object() {
		}.getClass().getEnclosingClass().getName() +
				" : " + new Object() {
				}.getClass().getEnclosingMethod().getName());

		HttpSession session = request.getSession();
		//メッセージを表示させたい
		//JSPのmessage_idからIDを確保       URLのバリデーションはゲットしたパラメータを評価する
		String messageId = request.getParameter("message_id");
		User user = (User) session.getAttribute("loginUser");
		int massageUserId = 0;
		int loginUserId = user.getId();
		//なんでloginUser.idではだめなのか
		//エラー用のリスト
		List<String> errorMessages = new ArrayList<String>();
		//記入したメッセージをサービスに送る箱
		//messageId(URL)に数字以外が入っていたらはじく
		Message messages = null;
		if ((messageId != null) && (messageId.matches("^[0-9]+$"))) {
			//リクエストのパラメーターが整数であることを確認してから
			int intMassageId = Integer.parseInt(messageId);
			messages = new MessageService().select(intMassageId);
			massageUserId = messages.getUserId();
		}
		//上のifを通ってmessagesに変化がなくnullのままであればエラーメッセージをadd
		//また、ログインユーザーと上でもらってきたメッセージの中のユーザーIDが一致しなければエラーメッセージをadd
		if ((messages == null)|| (loginUserId != massageUserId)){
			errorMessages.add("不正なパラメータが入力されました");
			session.setAttribute("errorMessages", errorMessages);
			response.sendRedirect("./");
			return;
		}
		//Daoに渡すためにintへ変換
		Integer id = Integer.parseInt(messageId);
		//いまのメッセージIDのテキストを表示させるためにセレクトで持ってきてもらう
		Message editMessage = new MessageService().select(id);
		// リクエストにメッセージをセット①めmessageの名前で②editMessageを格納
		request.setAttribute("message", editMessage);
		//引数に呼び出したいJSP名指定してRequestDispatcherオブジェクトに渡すことで、画面の指定が出来る
		//forwardメソッドを呼び出すことで、画面の呼び出し（遷移）が行われてJSPに処理が映ります。
		request.getRequestDispatcher("edit.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		log.info(new Object() {
		}.getClass().getEnclosingClass().getName() +
				" : " + new Object() {
				}.getClass().getEnclosingMethod().getName());
		//エラー用のリスト
		List<String> errorMessages = new ArrayList<String>();
		//記入したメッセージをサービスに送る箱
		Message message = new Message();
		//		リクエストからメッセージをゲット
		String text = request.getParameter("text");
		Integer id = Integer.parseInt(request.getParameter("id"));
		//先ほどの箱に詰める
		message.setId(id);
		message.setText(text);
		//セッションにはエラーメッセージをつめて
		//リクエストにはメッセージをつめて送る
		//結果はedit.jspにレスポンスとして返す
		if (!isValid(text, errorMessages)) {
			request.setAttribute("errorMessages", errorMessages);
			request.setAttribute("message", message);
			//リクエストの時点でセットしたのが消えている
			request.getRequestDispatcher("edit.jsp").forward(request, response);
			return;
		}
		new MessageService().update(message);
		response.sendRedirect("./");
	}

	//バリデーションの記述
	private boolean isValid(String text, List<String> errorMessages) {

		log.info(new Object() {
		}.getClass().getEnclosingClass().getName() +
				" : " + new Object() {
				}.getClass().getEnclosingMethod().getName());

		if (StringUtils.isBlank(text)) {
			errorMessages.add("メッセージを入力してください");
		} else if (140 < text.length()) {
			errorMessages.add("140文字以下で入力してください");
		}

		if (errorMessages.size() != 0) {
			return false;
		}
		return true;
	}
}