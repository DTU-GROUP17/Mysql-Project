package dto;

public class ReceiptComponent {
	int receiptId;                  // auto genereres fra 1..n
	int materialId;             // i omraadet 1-99999999
	double nomNetto;            // skal vaere positiv og passende stor
	double tolerance;           // skal vaere positiv og passende stor

	public ReceiptComponent(int receiptId, int materialId, double nomNetto, double tolerance) {
		this.receiptId = receiptId;
		this.materialId = materialId;
		this.nomNetto = nomNetto;
		this.tolerance = tolerance;
	}

	public int getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(int receiptId) {
		this.receiptId = receiptId;
	}

	public int getMaterialId() {
		return materialId;
	}

	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}

	public double getNomNetto() {
		return nomNetto;
	}

	public void setNomNetto(double nomNetto) {
		this.nomNetto = nomNetto;
	}

	public double getTolerance() {
		return tolerance;
	}

	public void setTolerance(double tolerance) {
		this.tolerance = tolerance;
	}

	public String toString() {
		return receiptId + "\t" + materialId + "\t" + nomNetto + "\t" + tolerance;
	}
}
