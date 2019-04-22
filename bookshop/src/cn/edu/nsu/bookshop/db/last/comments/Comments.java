/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.comments;

/**
 * @author XuKanglei
 *
 */
public class Comments {
	private int comments_id;
	private int users_id;
	private int books_id;
	private String comments_content;
	private String comments_time;
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(comments_id+"\t").append(users_id+"\t").append(books_id+"\t")
			.append(comments_content+"\t").append(comments_time+"\n");
		return sb.toString();
	}
	
	/**
	 * @return the comments_id
	 */
	public int getComments_id() {
		return comments_id;
	}
	/**
	 * @param comments_id the comments_id to set
	 */
	public void setComments_id(int comments_id) {
		this.comments_id = comments_id;
	}
	/**
	 * @return the users_id
	 */
	public int getUsers_id() {
		return users_id;
	}
	/**
	 * @param users_id the users_id to set
	 */
	public void setUsers_id(int users_id) {
		this.users_id = users_id;
	}
	/**
	 * @return the books_id
	 */
	public int getBooks_id() {
		return books_id;
	}
	/**
	 * @param books_id the books_id to set
	 */
	public void setBooks_id(int books_id) {
		this.books_id = books_id;
	}
	/**
	 * @return the Comments_content
	 */
	public String getComments_content() {
		return comments_content;
	}
	/**
	 * @param comments_content the comments_content to set
	 */
	public void setComments_content(String comments_content) {
		this.comments_content = comments_content;
	}
	/**
	 * @return the comments_time
	 */
	public String getComments_time() {
		return comments_time;
	}
	/**
	 * @param comments_time the comments_time to set
	 */
	public void setComments_time(String comments_time) {
		this.comments_time = comments_time;
	}
}
