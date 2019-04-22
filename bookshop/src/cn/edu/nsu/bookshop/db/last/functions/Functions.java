/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.functions;

/**
 * @author XuKanglei
 *
 */
public class Functions {
	private int functions_id;
	private String functions_name;
	private String functions_URI;
	private String Functions_note;
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(functions_id+"\t").append(functions_name+"\t").append(functions_URI+"\t").append(Functions_note+"\n");
		return sb.toString();
	}
	/**
	 * @return the functions_id
	 */
	public int getFunctions_id() {
		return functions_id;
	}
	/**
	 * @param functions_id the functions_id to set
	 */
	public void setFunctions_id(int functions_id) {
		this.functions_id = functions_id;
	}
	/**
	 * @return the functions_name
	 */
	public String getFunctions_name() {
		return functions_name;
	}
	/**
	 * @param functions_name the functions_name to set
	 */
	public void setFunctions_name(String functions_name) {
		this.functions_name = functions_name;
	}
	/**
	 * @return the functions_URI
	 */
	public String getFunctions_URI() {
		return functions_URI;
	}
	/**
	 * @param functions_URI the functions_URI to set
	 */
	public void setFunctions_URI(String functions_URI) {
		this.functions_URI = functions_URI;
	}
	/**
	 * @return the Functions_note
	 */
	public String getFunctions_note() {
		return Functions_note;
	}
	/**
	 * @param Functions_note the Functions_note to set
	 */
	public void setFunctions_note(String Functions_note) {
		this.Functions_note = Functions_note;
	}
	
}
