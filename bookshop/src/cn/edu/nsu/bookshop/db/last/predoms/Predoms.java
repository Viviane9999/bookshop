/**
 * 
 */
package cn.edu.nsu.bookshop.db.last.predoms;

/**
 * @author XuKanglei
 *
 */
public class Predoms {
	private int predoms_id;
	private int functions_id;
	private int roles_id;
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(predoms_id+"\t").append(functions_id+"\t").append(roles_id+"\n");
		return sb.toString();
	}
	
	/**
	 * @return the predoms_id
	 */
	public int getPredoms_id() {
		return predoms_id;
	}
	/**
	 * @param predoms_id the predoms_id to set
	 */
	public void setPredoms_id(int predoms_id) {
		this.predoms_id = predoms_id;
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
	
	
}
