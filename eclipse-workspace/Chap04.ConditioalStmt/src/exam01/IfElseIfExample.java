package exam01;

public class IfElseIfExample {

	public static void main(String[] args) {
		int number = -5;

		if (number > 0) { // ������ �ϳ��� ��� '{' �������� �ΰ� �̻��̸� ���� �Ұ���
			System.out.println("�Է��Ͻ� ���ڴ� '���' �Դϴ�");
		} else if (number == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� '0' �Դϴ�");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� '����' �Դϴ�");
		}
		System.out.println("���α׷��� �����մϴ�.");
	}

}
