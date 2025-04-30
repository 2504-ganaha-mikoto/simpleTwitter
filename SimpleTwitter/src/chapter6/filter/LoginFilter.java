package chapter6.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import chapter6.beans.User;

//設定とつぶやきの編集画面でフィルターを設定したい
@WebFilter(urlPatterns = { "/setting", "/edit" })

public class LoginFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		//Http型に変換する
		HttpServletRequest req = (HttpServletRequest) request;
		//もしsessionのなかのログインユーザーの情報がnullならレスポンス情報をもってリダイレクト
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("loginUser");

		if (user == null) {
			HttpServletResponse res = (HttpServletResponse) response;
			res.sendRedirect("./login");
			//エラーメッセージを表示するjspはforEachでリスト型に対応しているから
			//リストに格納して、セッションに格納して渡す
			List<String> errorMessages = new ArrayList<String>();
			errorMessages.add("ログインしてください");
			session.setAttribute("errorMessages", errorMessages);
			return;
		}
		chain.doFilter(request, response); // サーブレットを実行
	}

	@Override
	public void init(FilterConfig config) {
	}

	@Override
	public void destroy() {
	}

}