package dto;

public class MaterialBatch {
	int id;                     // i omraadet 1-99999999
	int materialId;             // i omraadet 1-99999999
	double amount;             // kan vaere negativ

	public MaterialBatch(int id, int materialId, double amount) {
		this.id = id;
		this.materialId = materialId;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaterialId() {
		return materialId;
	}

	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String toString() {
		return id + "\t" + materialId + "\t" + amount;
	}
}
