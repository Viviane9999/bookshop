/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.roles;

/**
 * @author XuKanglei
 *
 */
public class Roles {
	
	private int roles_id;
	private String roles_name;
	private String roles_note;
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(roles_id+"\t").append(roles_name+"\t").append(roles_note+"\n");
		return sb.toString();
	}
	
	/**
	 * @return the roles_id
	 */
	public int getRoles_id() {
		return roles_id;
	}

	/**
	 * @param roles_id the roles_id to set
	 */
	public void setRoles_id(int roles_id) {
		this.roles_id = roles_id;
	}

	/**
	 * @return the roles_name
	 */
	public String getRoles_name() {
		return roles_name;
	}

	/**
	 * @param roles_name the roles_name to set
	 */
	public void setRoles_name(String roles_name) {
		this.roles_name = roles_name;
	}

	/**
	 * @return the roles_note
	 */
	public String getRoles_note() {
		return roles_note;
	}

	/**
	 * @param roles_note the roles_note to set
	 */
	public void setRoles_note(String roles_note) {
		this.roles_note = roles_note;
	}
}
