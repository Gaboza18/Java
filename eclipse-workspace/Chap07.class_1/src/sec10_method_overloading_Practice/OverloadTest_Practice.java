package sec10_method_overloading_Practice;

class DisplayInfo_Practice {

	// ���� ��� �޼ҵ�
	public void displayChar(char c) {
		System.out.println("���ڸ� ����ϴ� �޼ҵ�: " + c);
	}

	// ���ڿ��� ����ϴ� �޼ҵ�
	public void displayString(String str) {
		System.out.println("���ڿ��� ����ϴ� �޼ҵ�: " + str);
	}

	// ���ڸ� ����ϴ� �޼ҵ�
	public void displayInt(int number) {
		System.out.println("���ڸ� ����ϴ� �޼ҵ�: " + number);
	}
}

public class OverloadTest_Practice {
	public static void main(String[] args) {

		DisplayInfo_Practice d1 = new DisplayInfo_Practice();

		d1.displayChar('a');
		d1.displayString("�ȳ��� ������.");
		d1.displayInt(4321);
	}

}
