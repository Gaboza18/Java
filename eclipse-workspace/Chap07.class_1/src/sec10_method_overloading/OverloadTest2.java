package sec10_method_overloading;

/*
 * �޼ҵ� �����ε带 ����Ͽ� �����ϴ� ���
 */

class DisplayInfo2 { // ���� ��Ű�� �ȿ� ���� Ŭ���� x

	// ����
	public void dispChar(char c) { // �޼ҵ� �̸��� �����ص� ������ ����
		System.out.println(c);
	}

	// ���ڿ�
	public void dispString(String str) {
		System.out.println(str);
	}

	// ����
	public void dispInt(int number) {
		System.out.println(number);
	}

	// ����, ����
	public void dispInt(String msg, int number) { // �޼ҵ� �����ε�(������ �޼ҵ尪)
		System.out.println(msg + number);
	}
}

public class OverloadTest2 {
	public static void main(String[] args) {

		DisplayInfo2 d1 = new DisplayInfo2();
		// ���� ���
		d1.dispChar('A');

		// d1.disp("abc"); // String���� �Է��Ķ���ͷ� ���Ұ�

		// ���ڿ� ���
		d1.dispString("�ȳ�");

		// ���� ���
		d1.dispInt(123456);
		
		//���ڿ�, ���� ���
		d1.dispInt("�������", 123);
	}

}
