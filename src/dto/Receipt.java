package dto;

/**
 * Recept Data Objekt
 *
 * @author mn/tb
 * @version 1.2
 */

public class Receipt {
	/**
	 * Recept nr i omraadet 1-99999999
	 */
	private int id;
	/**
	 * Receptnavn min. 2 max. 20 karakterer
	 */
	private String name;

	/**
	 * liste af kompenenter i recepten
	 */


	public Receipt(int id, String name) {
		this.id = id;
		this.name = name;
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

	public String toString() {
		return id + "\t" + name;
	}
}
