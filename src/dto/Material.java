package dto;

/**
 * Raavare Data Objekt
 *
 * @author mn/sh/tb
 * @version 1.2
 */

public class Material {
	/**
	 * i omraadet 1-99999999 vaelges af brugerne
	 */
	private int id;
	/**
	 * min. 2 max. 20 karakterer
	 */
	private String name;
	/**
	 * min. 2 max. 20 karakterer
	 */
	private String supplier;

	public Material(int id, String name, String supplier) {
		this.id = id;
		this.name = name;
		this.supplier = supplier;
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

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String toString() {
		return id + "\t" + name + "\t" + supplier;
	}
}
