/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.predoms;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.bookshop.db.last.DBMain;

/**
 * @author XuKanglei
 *
 */
public class PredomsDAO extends DBMain<Predoms>{

	@Override
	public ArrayList<Predoms> getAll() throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM predoms";
		pst = getPrepareStatement(sql);
		rst = pst.executeQuery();
		ArrayList<Predoms> predoms = new ArrayList<Predoms>();
		while(rst.next()) {
			predoms.add(assemble(rst));
		}
		release();
		return predoms;
	}

	@Override
	public Predoms getById(int id) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM predoms WHERE predoms_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		Predoms predoms = null;
		while(rst.next()) {
			predoms = assemble(rst);
		}
		release();
		return predoms;
	}

	@Override
	public void add(Predoms dataObj) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO predoms(functions_id, roles_id)VALUES(?, ?)";
		pst = getPrepareStatement(sql);
		pst.setInt(1, dataObj.getFunctions_id());
		pst.setInt(2, dataObj.getRoles_id());
		
		pst.executeUpdate();
		release();
	}

	@Override
	public void modify(Predoms newDataObj) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE predoms SET functions_id = ?, roles_id = ? WHERE predoms_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, newDataObj.getFunctions_id());
		pst.setInt(2, newDataObj.getRoles_id());
		pst.setInt(3, newDataObj.getPredoms_id());
		pst.executeUpdate();
		release();
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM predoms WHERE predoms_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();
		release();
	}

	@Override
	public Predoms assemble(ResultSet rst) throws SQLException {
		Predoms predoms = new Predoms();
		predoms.setPredoms_id(rst.getInt("predoms_id"));
		predoms.setFunctions_id(rst.getInt("functions_id"));
		predoms.setRoles_id(rst.getInt("roles_id"));
		return predoms;
	}

}
