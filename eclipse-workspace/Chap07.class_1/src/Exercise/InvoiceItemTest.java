package Exercise;

import java.util.Scanner;

public class InvoiceItemTest {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		InvoiceItem[] item = { new InvoiceItem("111", "Book", 3, 35_000L), new InvoiceItem("112", "Phone", 2, 920_000L),
				new InvoiceItem("113", "Laptop", 1, 1_100_000L), };

		displayItems(item);
		System.out.println("------------------------------------------");		
		System.out.println();
		InvoiceItem invoice = new InvoiceItem();
		inputItem(invoice);
	}

	public static void displayItems(InvoiceItem[] items) {
		System.out.println("==========================================");
		System.out.println("  품번     항목명  수량    단가       금액");
		System.out.println("------------------------------------------");

		for (InvoiceItem item : items) {
			System.out.printf("%5s %8s %3d %9d %9d\n", item.getId(), item.getDesc(), item.getQty(), item.getUnitPrice(),
					item.getTotal());
		}
	}

	public static void inputItem(InvoiceItem invoice) { // 입력받는 메소드
		System.out.printf("품목을 입력: ");
		invoice.setId(input.next());
		// 위코드와 동일한 코드
		// String no = input.next();
		// invoice.id = setId(no);
		System.out.print("품목명 입력: ");
		invoice.setDesc(input.next());

		System.out.print("수량을 입력: ");
		invoice.setQty(input.nextInt());

		System.out.print("단가를 입력: ");
		invoice.setUnitPrice(input.nextLong());
		System.out.println(invoice.toString());
	}

}
