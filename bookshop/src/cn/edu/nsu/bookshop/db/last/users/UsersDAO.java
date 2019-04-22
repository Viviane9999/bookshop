/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.users;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.bookshop.db.last.DBMain;
import cn.edu.nsu.bookshop.db.last.users.Users;

/**
 * @author ZhangXiaohua
 *
 */
public class UsersDAO extends DBMain<Users>
{

	@Override
	public ArrayList<Users> getAll() throws ClassNotFoundException, SQLException 
	{

		//封装SQL
		String sql = "select * from users";
		 pst = getPrepareStatement(sql);
		//参数绑定
		//pst.setInt(1, 1);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 ArrayList<Users> users = new ArrayList<Users>();
		 while(rst.next())
		 {
			 users.add(assemble(rst));
		 }
		//关闭DB连接
		 release();
		 return users;
	}

	@Override
	public Users getById(int id) throws ClassNotFoundException, SQLException {
		//封装SQL
		String sql = "select * from users where users_id = ?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1, id);
		//执行SQL
		 rst = pst.executeQuery();
		//转存数据
		 Users user = null;
		 while(rst.next())
		 {
			 user = assemble(rst);
		 }
		//关闭DB连接
		 release();
		 return user;
	}

	@Override
	public void add(Users dataObj) throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "INSERT into users(roles_id,users_name,users_sex,users_idNum,users_mobile,users_address,users_postcode,users_portraitImg,users_password) VALUES(?,?,?,?,?,?,?,?,?)";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,dataObj.getRoles_id());
		pst.setString(2, dataObj.getUsers_name());
		pst.setString(3, dataObj.getUsers_sex());
		pst.setString(4, dataObj.getUsers_idNum());
		pst.setString(5, dataObj.getUsers_mobile());
		pst.setString(6, dataObj.getUsers_address());
		pst.setString(7, dataObj.getUsers_postcode());
		pst.setString(8, dataObj.getUsers_portraitImg());
		pst.setString(9, dataObj.getUsers_password());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	
	}

	@Override
	public void modify(Users newDataObj) throws ClassNotFoundException, SQLException {

		//封装SQL
		String sql = "update users set roles_id=?,users_name=?,users_sex=?,users_idNum=?,users_mobile=?,users_address=?,users_postcode=?,users_portraitImg=?,users_password=? where users_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		 pst.setInt(1,newDataObj.getRoles_id());
			pst.setString(2, newDataObj.getUsers_name());
			pst.setString(3, newDataObj.getUsers_sex());
			pst.setString(4, newDataObj.getUsers_idNum());
			pst.setString(5, newDataObj.getUsers_mobile());
			pst.setString(6, newDataObj.getUsers_address());
			pst.setString(7, newDataObj.getUsers_postcode());
			pst.setString(8, newDataObj.getUsers_portraitImg());
			pst.setString(9, newDataObj.getUsers_password());
		pst.setInt(10, newDataObj.getUsers_id());
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	    release();
	
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException 
	{
		//封装SQL
		String sql = "DELETE FROM users WHERE users_id=?";
		 pst = getPrepareStatement(sql);
		//参数绑定
		pst.setInt(1,id);
		//执行SQL
	    pst.executeUpdate();
		//处理结果数据			
		//关闭DB连接	
	    release();
	}

	@Override
	public Users assemble(ResultSet rst) throws SQLException {

		Users user = new Users();
		user.setUsers_id(rst.getInt("users_id"));
		user.setRoles_id(rst.getInt("roles_id"));
		user.setUsers_name(rst.getString("users_name"));
		user.setUsers_sex(rst.getString("users_sex"));
		user.setUsers_idNum(rst.getString("users_idNum"));
		user.setUsers_mobile(rst.getString("users_mobile"));
		user.setUsers_address(rst.getString("users_address"));
		user.setUsers_postcode(rst.getString("users_postcode"));
		user.setUsers_portraitImg(rst.getString("users_portraitImg"));
		user.setUsers_password(rst.getString("users_password"));
		return user;
	
	}
}
