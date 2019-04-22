/**
 * 
 */
package cn.edu.nsu.bookshop.db.last;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author ZhangXiaohua
 *
 */
public abstract class DBMain<E> 
{
	public Connection con = null;
	public PreparedStatement pst = null;
	public ResultSet rst = null;
	/**
	 * 封装指定的SQL语句为一个PreparedStatement对象
	 * @param sql 要被封装的SQL语句
	 * @return PreparedStatement对象
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public PreparedStatement getPrepareStatement(String sql) throws ClassNotFoundException, SQLException
	{
		//加载JDBC驱动
		Class.forName("com.mysql.cj.jdbc.Driver");
		//获得DB连接
		 con = DriverManager.getConnection("jdbc:mysql://172.17.130.84:3306/bookshop_info?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8&useSSL=false", "root", "zxh751106");
		//封装SQL
		 pst = con.prepareStatement(sql);
		 
		 return pst;
	}
	/**
	 * 释放数据库连接
	 * @throws SQLException
	 */
	public void release() throws SQLException
	{
		
		//关闭数据库连接
		if(rst != null)
		{
			rst.close();
		}
		if(pst != null)
		{
			pst.close();
		}
		if(con != null)
		{
			con.close();
		}
	}
	
	public abstract ArrayList<E> getAll() throws ClassNotFoundException,SQLException;
	
	public abstract E getById(int id) throws ClassNotFoundException,SQLException;
	
	public abstract void add(E dataObj) throws ClassNotFoundException,SQLException;
	
	public abstract void modify(E newDataObj) throws ClassNotFoundException,SQLException;
	
	public abstract void delete(int id) throws ClassNotFoundException,SQLException;
	
	public abstract  E assemble(ResultSet rst) throws SQLException;
}
