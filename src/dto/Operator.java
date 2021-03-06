package dto;

import java.util.List;

/**
 * Operatoer Data Access Objekt
 *
 * @author mn/tb
 * @version 1.2
 */

public class Operator {
	/**
	 * Operatoer-identifikationsnummer (opr_id) i omraadet 1-99999999. Vaelges af brugerne
	 */
	private int id;
	/**
	 * Operatoernavn (opr_navn) min. 2 max. 20 karakterer
	 */
	private String name;

	/**
	 * Operatoer-initialer min. 2 max. 3 karakterer
	 */
	private String ini;
	/**
	 * Operatoer cpr-nr 10 karakterer
	 */
	private String cpr;
	/**
	 * Operatoer password min. 7 max. 8 karakterer
	 */
	private String password;

	private List<String> roles;

	public Operator(int id, String name, String ini, String cpr, String password) {
		this.id = id;
		this.name = name;
		this.ini = ini;
		this.cpr = cpr;
		this.password = password;
	}

	public Operator(Operator opr) {
		this.id = opr.getId();
		this.name = opr.getName();
		this.ini = opr.getIni();
		this.cpr = opr.getCpr();
		this.password = opr.getPassword();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIni() {
		return ini;
	}

	public void setIni(String ini) {
		this.ini = ini;
	}

	public String getCpr() {
		return cpr;
	}

	public void setCpr(String cpr) {
		this.cpr = cpr;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public void addRole(String role) {
		this.roles.add(role);
	}

	public String toString() {
		return id + "\t" + name + "\t" + ini + "\t" + cpr + "\t" + password;
	}


}
