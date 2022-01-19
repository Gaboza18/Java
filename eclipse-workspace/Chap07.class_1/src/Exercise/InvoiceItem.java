package Exercise;

public class InvoiceItem {
	private String id; // 품목번호
	private String desc; // 제품명
	private int qty; // 수량
	private long unitPrice; // 단가

	public InvoiceItem() {

	}

	public InvoiceItem(String id, String desc, int qty, long unitPrice) {
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public long getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(long unitPrice) {
		this.unitPrice = unitPrice;
	}

	public long getTotal() {
		return qty * unitPrice;
	}

	public String toString() {
		return "InvoiceItem[id: " + id + ", desc: " + desc + ", qty: " + qty + ", unitPrice: " + unitPrice + "]";
	}
}
