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
		System.out.println("  ǰ��     �׸��  ����    �ܰ�       �ݾ�");
		System.out.println("------------------------------------------");

		for (InvoiceItem item : items) {
			System.out.printf("%5s %8s %3d %9d %9d\n", item.getId(), item.getDesc(), item.getQty(), item.getUnitPrice(),
					item.getTotal());
		}
	}

	public static void inputItem(InvoiceItem invoice) { // �Է¹޴� �޼ҵ�
		System.out.printf("ǰ���� �Է�: ");
		invoice.setId(input.next());
		// ���ڵ�� ������ �ڵ�
		// String no = input.next();
		// invoice.id = setId(no);
		System.out.print("ǰ��� �Է�: ");
		invoice.setDesc(input.next());

		System.out.print("������ �Է�: ");
		invoice.setQty(input.nextInt());

		System.out.print("�ܰ��� �Է�: ");
		invoice.setUnitPrice(input.nextLong());
		System.out.println(invoice.toString());
	}

}
