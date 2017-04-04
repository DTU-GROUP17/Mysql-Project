package dto;

public class ProductBatch {
	private int id;                     // i omraadet 1-99999999
	private int status;                    // 0: ikke paabegyndt, 1: under produktion, 2: afsluttet
	private int receiptId;

	public ProductBatch(int id, int status, int receiptId) {
		this.id = id;
		this.status = status;
		this.receiptId = receiptId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(int receiptId) {
		this.receiptId = receiptId;
	}

	public String toString() {
		return id + "\t" + status + "\t" + receiptId;
	}
}

