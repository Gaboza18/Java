package sec10_method_overloading;

/*
 * �޼ҵ� �����ε带 ������� �ʰ� �Ϲ����� �޼ҵ� ���� ���
 */

class DisplayInfo {
	
	// ����
	public void dispChar(char c) {
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
}

public class OverloadTest {
	public static void main(String[] args) {

		DisplayInfo d1 = new DisplayInfo();
		// ���� ���
		d1.dispChar('A');

		// d1.disp("abc"); // String���� �Է��Ķ���ͷ� ���Ұ�

		// ���ڿ� ���
		d1.dispString("�ȳ�");

		// ���� ���
		d1.dispInt(123456);
	}

}
