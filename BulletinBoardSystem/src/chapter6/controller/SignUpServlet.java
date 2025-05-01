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

import org.apache.commons.lang.StringUtils;

import chapter6.logging.InitApplication;
import chapter6.service.UserService;

@WebServlet(urlPatterns = { "/signup" })
public class SignUpServlet extends HttpServlet {


   /**
   * ロガーインスタンスの生成
   */
    Logger log = Logger.getLogger("twitter");

    /**
    * デフォルトコンストラクタ
    * アプリケーションの初期化を実施する。
    */
    public SignUpServlet() {
        InitApplication application = InitApplication.getInstance();
        application.init();

    }

    @Override
//    get呼び出しされると実行され、signup.jspを表示します。
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

	  log.info(new Object(){}.getClass().getEnclosingClass().getName() +
        " : " + new Object(){}.getClass().getEnclosingMethod().getName());

        request.getRequestDispatcher("signup.jsp").forward(request, response);
    }

    @Override
//    post呼び出しされると実行されます。
//    リクエストパラメータを Userオブジェクトにセットし、
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {


	  log.info(new Object(){}.getClass().getEnclosingClass().getName() +
        " : " + new Object(){}.getClass().getEnclosingMethod().getName());

        List<String> errorMessages = new ArrayList<String>();

        User user = getUser(request);
//      入力値が不正な場合には再度、自画面(signup)を表示するようにしています。
        if (!isValid(user, errorMessages)) {
            request.setAttribute("errorMessages", errorMessages);
            request.getRequestDispatcher("signup.jsp").forward(request, response);
            return;
        }
//      Serviceのメソッドを呼び出してDBへユーザーの登録を行います。
        new UserService().insert(user);
//      ユーザーの登録が完了したら再びトップ画面を表示するようになっています。
        response.sendRedirect("./");
    }

//    ユーザー登録画面（signup.jsp ※後述）からの入力値（リクエストパラメータ）を取得します
    private User getUser(HttpServletRequest request) throws IOException, ServletException {


	  log.info(new Object(){}.getClass().getEnclosingClass().getName() +
        " : " + new Object(){}.getClass().getEnclosingMethod().getName());

        User user = new User();
        user.setName(request.getParameter("name"));
        user.setKana(request.getParameter("kana"));
        user.setAccount(request.getParameter("account"));
        user.setBirthday(request.getParameter("birthday"));
        user.setPassword(request.getParameter("password"));
        user.setEmail(request.getParameter("email"));
        user.setDescription(request.getParameter("description"));
        return user;
    }

//    入力値に対するバリデーションを行います。
    private boolean isValid(User user, List<String> errorMessages) {


	  log.info(new Object(){}.getClass().getEnclosingClass().getName() +
        " : " + new Object(){}.getClass().getEnclosingMethod().getName());

        String name = user.getName();
        String kana = user.getName();
        String account = user.getAccount();
        String birthday = user.getBirthday();
        String password = user.getPassword();
        String email = user.getEmail();

        if (!StringUtils.isEmpty(name) && (20 < name.length())) {
            errorMessages.add("名前は20文字以下で入力してください");
        }
        if (!StringUtils.isEmpty(kana) && (20 < kana.length())) {
            errorMessages.add("仮名は20文字以下で入力してください");
        }
        if (StringUtils.isEmpty(account)) {
            errorMessages.add("アカウント名を入力してください");
        } else if (20 < account.length()) {
            errorMessages.add("アカウント名は20文字以下で入力してください");
        }
		if (StringUtils.isEmpty(birthday)) {
            errorMessages.add("生年月日を入力してください");
        }

        if (StringUtils.isEmpty(password)) {
            errorMessages.add("パスワードを入力してください");
        }

        if (!StringUtils.isEmpty(email) && (50 < email.length())) {
            errorMessages.add("メールアドレスは50文字以下で入力してください");
        }

        if (errorMessages.size() != 0) {
            return false;
        }
        return true;
    }
}