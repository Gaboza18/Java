import java.util.Scanner; // �ܺο��� �Է��ϱ� ���� Scanner import 

public class KeyboardInput {

	public static void main(String[] args) { // Ű���带 ���ؼ� ���α׷��� �����͸� �Է��ϴ� ���
		Scanner input = new Scanner(System.in); // ǥ���Է��� ����Ͽ� Ű���� �Է�

		System.out.print("������ �Է��ϼ���: ");
		int number = input.nextInt(); // Ű���� ���� ������ �Է¹޴´�.
		System.out.println("�Է��Ͻ� ������: " + number);
		System.out.println("");

		System.out.print("���ڸ� �Է��ϼ���: ");
		String str = input.next();
		System.out.println("�Է��Ͻ� ���ڴ�: " + str);
		System.out.println("");
	}

}
