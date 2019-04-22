/**
 * 
 */
package cn.edu.nsu.bookshop.db.op1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ZhangXiaohua
 *
 */
public class GetUserById extends DBMain
{
//	private Connection con = null;
//	private PreparedStatement pst = null;
//	private ResultSet rst = null;
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{	
			GetUserById getUserById = new GetUserById();
			getUserById.getUserById();
	}

	private void getUserById()
	{
		try {
//			//加载JDBC驱动
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			//获得DB连接
//			 con = DriverManager.getConnection("jdbc:mysql://172.17.130.84:3306/bookshop_info?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8&useSSL=false", "root", "zxh751106");
//			
			//封装SQL
			String sql = "select * from users where users_id=?";
			 pst = getPrepareStatement(sql);
			//参数绑定
			pst.setInt(1, 1);
			//执行SQL
			 rst = pst.executeQuery();
			//处理结果数据
			while(rst.next())
			{
				System.out.print(rst.getInt("users_id")+"\t");
				System.out.print(rst.getInt("roles_id")+"\t");
				System.out.print(rst.getString("users_name")+"\t");
				System.out.print(rst.getString("users_sex")+"\t");
				System.out.print(rst.getString("users_idNum")+"\t");
				System.out.print(rst.getString("users_mobile")+"\t");
				System.out.print(rst.getString("users_address")+"\t");
				System.out.print(rst.getString("users_postcode")+"\t");
				System.out.print(rst.getString("users_portraitImg")+"\t");
				System.out.println(rst.getString("users_password"));
			}
			//关闭DB连接
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				release();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}
}
