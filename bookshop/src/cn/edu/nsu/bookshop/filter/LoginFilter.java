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
 *�Ժ�̨������е�½��֤
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
		//��session��ȡ����½�û���Ϣ
		Object user = ((HttpServletRequest)request).getSession().getAttribute("USER_LOGIN");
		//�����¼�û���Ϣ����, �Ϸ�, ����
		if(user != null) {
			chain.doFilter(request, response);
			System.out.println("LoginFilter:after chain.doFilter");
		}
		//����, �Ƿ�, ���򵽵�¼��ҳ��
		else {
			request.getRequestDispatcher("/pages/admin/index.html").forward(request, response);
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
}
