/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.functions;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.bookshop.db.last.DBMain;

/**
 * @author XuKanglei
 *
 */
public class FunctionsDAO extends DBMain<Functions>{

	@Override
	public ArrayList<Functions> getAll() throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM functions";
		pst = getPrepareStatement(sql);
		rst = pst.executeQuery();
		ArrayList<Functions> functions = new ArrayList<Functions>();
		while(rst.next()) {
			functions.add(assemble(rst));
		}
		release();
		return functions;
	}

	@Override
	public Functions getById(int id) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM functions WHERE functions_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		Functions functions = null;
		while(rst.next()) {
			functions = assemble(rst);
		}
		release();
		return functions;
	}

	@Override
	public void add(Functions dataObj) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO functions(functions_name, functions_URI, functions_note)VALUES(?, ?, ?)";
		pst = getPrepareStatement(sql);
		pst.setString(1, dataObj.getFunctions_name());
		pst.setString(2, dataObj.getFunctions_URI());
		pst.setString(3, dataObj.getFunctions_note());
		
		pst.executeUpdate();
		release();
	}

	@Override
	public void modify(Functions newDataObj) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE functions SET functions_name = ?, functions_URI = ?, functions_note = ? WHERE functions_id = ?";
		pst = getPrepareStatement(sql);
		pst.setString(1, newDataObj.getFunctions_name());
		pst.setString(2, newDataObj.getFunctions_URI());
		pst.setString(3, newDataObj.getFunctions_note());
		pst.setInt(4, newDataObj.getFunctions_id());
		
		pst.executeUpdate();
		release();
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM functions WHERE functions_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();
		release();
	}

	@Override
	public Functions assemble(ResultSet rst) throws SQLException {
		Functions functions = new Functions();
		functions.setFunctions_id(rst.getInt("functions_id"));
		functions.setFunctions_name(rst.getString("functions_name"));
		functions.setFunctions_URI(rst.getString("functions_URI"));
		functions.setFunctions_note(rst.getString("functions_note"));
		return functions;
	}
	
}
