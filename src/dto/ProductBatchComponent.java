package dto;

public class ProductBatchComponent {
	private int productBatchId;      // produktbatchets productBatchId
	private int MaterialBatchId;        // i omraadet 1-99999999
	private double tara;
	private double netto;
	private int OperatorId;                    // operatoer-nummer


	public ProductBatchComponent(int productBatchId, int rbId, double tara, double netto, int OperatorId) {
		this.productBatchId = productBatchId;
		this.MaterialBatchId = rbId;
		this.tara = tara;
		this.netto = netto;
		this.OperatorId = OperatorId;
	}

	public int getProductBatchId() {
		return productBatchId;
	}

	public void setProductBatchId(int productBatchId) {
		this.productBatchId = productBatchId;
	}

	public int getMaterialBatchId() {
		return MaterialBatchId;
	}

	public void setMaterialBatchId(int materialBatchId) {
		this.MaterialBatchId = materialBatchId;
	}

	public double getTara() {
		return tara;
	}

	public void setTara(double tara) {
		this.tara = tara;
	}

	public double getNetto() {
		return netto;
	}

	public void setNetto(double netto) {
		this.netto = netto;
	}

	public int getOperatorId() {
		return OperatorId;
	}

	public void setOperatorId(int operatorId) {
		this.OperatorId = operatorId;
	}

	public String toString() {
		return productBatchId + "\t" + MaterialBatchId + "\t" + tara + "\t" + netto + "\t" + OperatorId;
	}
}
