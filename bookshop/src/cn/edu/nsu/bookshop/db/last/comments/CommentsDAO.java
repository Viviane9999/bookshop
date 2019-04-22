/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.comments;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import cn.edu.nsu.bookshop.db.last.DBMain;

/**
 * @author XuKanglei
 *
 */
public class CommentsDAO extends DBMain<Comments>{

	@Override
	public ArrayList<Comments> getAll() throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM comments";
		pst = getPrepareStatement(sql);
		rst = pst.executeQuery();
		ArrayList<Comments> comments = new ArrayList<Comments>();
		while(rst.next()) {
			comments.add(assemble(rst));
		}
		release();
		return comments;
	}

	@Override
	public Comments getById(int id) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM comments WHERE comments_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		rst = pst.executeQuery();
		Comments comments = null;
		while(rst.next()) {
			comments = assemble(rst);
		}
		release();
		return comments;
	}

	@Override
	public void add(Comments dataObj) throws ClassNotFoundException, SQLException {
		String sql = "INSERT INTO comments(users_id, books_id, comments_content, comments_time)VALUES(?, ?, ?, ?)";
		pst = getPrepareStatement(sql);
		pst.setInt(1, dataObj.getUsers_id());
		pst.setInt(2, dataObj.getBooks_id());
		pst.setString(3, dataObj.getComments_content());
		pst.setString(4, dataObj.getComments_time());
		
		pst.executeUpdate();
		release();
	}

	@Override
	public void modify(Comments newDataObj) throws ClassNotFoundException, SQLException {
		String sql = "UPDATE comments SET users_id = ?, books_id = ?, comments_content = ?, comments_time = ? WHERE comments_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, newDataObj.getUsers_id());
		pst.setInt(2, newDataObj.getBooks_id());
		pst.setString(3, newDataObj.getComments_content());
		pst.setString(4, newDataObj.getComments_time());
		pst.setInt(5, newDataObj.getComments_id());
		
		pst.executeUpdate();
		release();
		
	}

	@Override
	public void delete(int id) throws ClassNotFoundException, SQLException {
		String sql = "DELETE FROM comments WHERE comments_id = ?";
		pst = getPrepareStatement(sql);
		pst.setInt(1, id);
		pst.executeUpdate();
		release();
		
	}

	@Override
	public Comments assemble(ResultSet rst) throws SQLException {
		Comments comments = new Comments();
		comments.setComments_id(rst.getInt("comments_id"));
		comments.setComments_content(rst.getString("comments_content"));
		comments.setComments_time(rst.getString("comments_time"));
		return comments;
	}
	
}
