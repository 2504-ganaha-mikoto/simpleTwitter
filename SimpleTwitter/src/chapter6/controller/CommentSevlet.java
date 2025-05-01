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

import chapter6.beans.Comment;
import chapter6.beans.User;
import chapter6.logging.InitApplication;
import chapter6.service.CommentService;

@WebServlet(urlPatterns = { "/comment" })
public class CommentSevlet extends HttpServlet {

	/**
	* ロガーインスタンスの生成
	*/
	Logger log = Logger.getLogger("twitter");

	/**
	* デフォルトコンストラクタ
	* アプリケーションの初期化を実施する。
	*/
	public CommentSevlet() {
		InitApplication application = InitApplication.getInstance();
		application.init();

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		log.info(new Object() {
		}.getClass().getEnclosingClass().getName() +
				" : " + new Object() {
				}.getClass().getEnclosingMethod().getName());

		//リダイレクトしたいのでセッションもらう
		HttpSession session = request.getSession();
		List<String> errorMessages = new ArrayList<String>();
		//jspから送られてきた値（テキスト、メッセージID）をメッセージ型の箱に入れるために取り出す
		//idは数字でおくりたいのでint型へ
		String text = request.getParameter("text");
		String messageId = request.getParameter("message_id");
		Integer messageIntId = Integer.parseInt(messageId);

		if (!isValid(text, errorMessages)) {
			session.setAttribute("errorMessages", errorMessages);
			response.sendRedirect("./");
			return;
		}

		//コメントしたユーザーも保管したい
		User user = (User) session.getAttribute("loginUser");
		//サービスに運ぶ為の箱
		Comment comment = new Comment();
		comment.setText(text);
		comment.setId(messageIntId);
		comment.setUserId(user.getId());

		new CommentService().insert(comment);
		response.sendRedirect("./");
	}

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
