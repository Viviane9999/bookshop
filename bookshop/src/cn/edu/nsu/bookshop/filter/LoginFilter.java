/**
 * 
 */
package cn.edu.nsu.bookshop.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.User;

import com.sun.org.apache.bcel.internal.generic.NEW;

import cn.edu.nsu.bookshop.db.last.users.Users;

/**
 * @author XuKanglei
 *对后台请求进行登陆验证
 */
public class LoginFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("LoginFilter:doFilter");
		((HttpServletRequest)request).getSession().setAttribute("USER_LOGIN", new Users());
		//从session中取出登陆用户信息
		Object user = ((HttpServletRequest)request).getSession().getAttribute("USER_LOGIN");
		//如果登录用户信息存在, 合法, 放行
		if(user != null) {
			chain.doFilter(request, response);
			System.out.println("LoginFilter:after chain.doFilter");
		}
		//否则, 非法, 导向到登录表单页面
		else {
			request.getRequestDispatcher("/pages/admin/index.html").forward(request, response);
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
}
