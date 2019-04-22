/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.roles;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.bookshop.db.last.DBMain;

/**
 * @author XuKanglei
 *
 */
public class RolesDAO extends DBMain<Roles> {

	@Override
	public ArrayList<Roles> getAll() throws ClassNotFoundException, SQLException {
		String sql = "select * from roles";
		pst = getPrepareStatement(sql);
		rst = pst.executeQuery();
		ArrayList<Roles> roles = new ArrayList<Roles>();
		while(rst.next()){
			roles.add(assemble(rst));
		}
		return roles;
	}

	@Override
	public Roles getById(int id) throws ClassNotFoundException, SQLException {
		String sql = "select * from roles where roles_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		Roles role = null;
		while(rst.next()){
			role = assemble(rst);
		}
		release();
		return role;
	}

	@Override
	public void add(Roles dataObj) throws ClassNotFoundException, SQLException {
		String sql = "INSERT into roles(roles_name, roles_note) VALUES(?,?)";
		pst = getPrepareStatement(sql);
		pst.setString(1,dataObj.getRoles_name());
		pst.setString(2, dataObj.getRoles_note());
	    pst.executeUpdate();	
	    release();
	}

	@Override
	public void modify(Roles newDataObj) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE roles SET roles_name = ?, roles_note = ? WHERE roles_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(3,newDataObj.getRoles_id());
		pst.setString(1,newDataObj.getRoles_name());
		pst.setString(2, newDataObj.getRoles_note());
	    pst.executeUpdate();
		release();
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM roles WHERE roles_id=?";
		pst = getPrepareStatement(sql);
		pst.setInt(1,id);
	    pst.executeUpdate();
	    release();
		
	}

	@Override
	public Roles assemble(ResultSet rst) throws SQLException {
		Roles role = new Roles();
		role.setRoles_id(rst.getInt("roles_id"));
		role.setRoles_name(rst.getString("roles_name"));
		role.setRoles_note(rst.getString("roles_note"));
		return role;
	}
	
}