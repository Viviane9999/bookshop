/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.bookTypes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.bookshop.db.last.DBMain;

/**
 * @author XuKanglei
 *
 */
public class BookTypesDAO extends DBMain<BookTypes>{

	@Override
	public ArrayList<BookTypes> getAll() throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM bookTypes";
		pst = getPrepareStatement(sql);
		rst = pst.executeQuery();
		ArrayList<BookTypes> bookTypes = new ArrayList<BookTypes>();
		while(rst.next()) {
			bookTypes.add(assemble(rst));
		}
		release();
		return bookTypes;
	}

	@Override
	public BookTypes getById(int id) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM bookTypes WHERE bookTypes_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		BookTypes bookTypes = null;
		while(rst.next()) {
			bookTypes = assemble(rst);
		}
		release();
		return bookTypes;
	}

	@Override
	public void add(BookTypes dataObj) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO bookTypes(bookTypes_name, bookTypes_note)VALUES(?,?)";
		pst = getPrepareStatement(sql);
		pst.setString(1, dataObj.getBookTypes_name());
		pst.setString(2, dataObj.getBookTypes_note());
		
		pst.executeUpdate();
		release();
	}

	@Override
	public void modify(BookTypes newDataObj) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE bookTypes SET bookTypes_name = ?, bookTypes_note = ? WHERE bookTypes_id = ?";
		pst = getPrepareStatement(sql);
		pst.setString(1, newDataObj.getBookTypes_name());
		pst.setString(2, newDataObj.getBookTypes_note());
		pst.setInt(3, newDataObj.getBookTypes_id());
		pst.executeUpdate();
		release();
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM bookTypes WHERE bookTypes_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();
		release();
	}

	@Override
	public BookTypes assemble(ResultSet rst) throws SQLException {
		BookTypes bookTypes = new BookTypes();
		bookTypes.setBookTypes_id(rst.getInt("bookTypes_id"));
		bookTypes.setBookTypes_name(rst.getString("bookTypes_name"));
		bookTypes.setBookTypes_note(rst.getString("bookTypes_note"));
		return bookTypes;
	}
	
}
