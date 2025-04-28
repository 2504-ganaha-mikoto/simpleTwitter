package chapter6.filter;

import java.io.IOException;

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

//設定とつぶやきの編集画面でフィルターを設定したい
@WebFilter(urlPatterns = {"/setting","/edit"})

//implements Filterって何？
public class LoginFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

//Http型に変換する
		  HttpServletRequest req = (HttpServletRequest)request;
//もしsessionがnullならレスポンス情報をもってリダイレクト
		  HttpSession session = req.getSession();
		  if (session == null) {
			  HttpServletResponse res = (HttpServletResponse)response;
			  res.sendRedirect("/login");
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