package cn.edu.nsu.bookshop.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.nsu.bookshop.db.last.roles.Roles;
import cn.edu.nsu.bookshop.db.last.roles.RolesDAO;
import cn.edu.nsu.bookshop.db.last.users.Users;
import cn.edu.nsu.bookshop.db.last.users.UsersDAO;

/**
 * Servlet implementation class UserServlet
 */
//@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathInfo = request.getPathInfo();
		UsersDAO usersDAO = new UsersDAO();
		RolesDAO rolesDAO = new RolesDAO();
		//System.out.println("pathInfo="+pathInfo);
		try {
			if("/List".equals(pathInfo)) {
				//处理用户列表功能请求的代码
				//从DB的users表中查询出所有记录
				ArrayList<Users> users = usersDAO.getAll();
				//数据共享
				request.setAttribute("users", users);
				//请求派发
				request.getRequestDispatcher("/pages/admin/users/list.jsp").forward(request, response);
				
			}
			else if ("/OpenModify".equals(pathInfo)) {
				//处理用户修改表单功能请求的代码
				
				//处理请求
				// 从user表中查询修改的用户
          		String users_idStr = request.getParameter("users_id");
          		int users_id = Integer.parseInt(users_idStr);
          		Users user = usersDAO.getById(users_id);
          		
				ArrayList<Roles> roles = rolesDAO.getAll();
				//共享数据
				request.setAttribute("user", user);
				request.setAttribute("roles", roles);
				//请求派发
				request.getRequestDispatcher("/pages/admin/users/modify.jsp").forward(request, response);
			}
			else if ("Modify".equals(pathInfo)) {
				//处理用户修改表单功能请求的代码
				
			}
			else if ("/OpenAdd".equals(pathInfo)) {
				
				
			}
			else if ("/Add".equals(pathInfo)) {
				
				
			}
			else if ("/Delete".equals(pathInfo)){
				
				
			}
			else if ("/Detail".equals(pathInfo)) {
				
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				usersDAO.release();
				rolesDAO.release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
