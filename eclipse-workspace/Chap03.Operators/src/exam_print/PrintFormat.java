package exam_print;

public class PrintFormat {

	public static void main(String[] args) {

		int age = 27;
		int year = 2021;

		System.out.println("����: " + age + " ����⵵: " + year + " �Դϴ�."); // println���� ������ ������� ���������� �̵��Ͽ� ���
		System.out.printf("����: %d ����⵵: %d �Դϴ�.\n", age, year); // printf���� '\n'�� ����Ͽ� ���������� �����ش�.
		System.out.print("����: " + age + " ����⵵: " + year+" �Դϴ�.");
	}

}
