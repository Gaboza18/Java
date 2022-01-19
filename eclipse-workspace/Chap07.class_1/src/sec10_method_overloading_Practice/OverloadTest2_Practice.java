package sec10_method_overloading_Practice;

class DisplayInfo2_Practice {

	public void displayChar(char c) {
		System.out.println("�����ε� ���� ���� ����: " + c);
	}

	public void displayString(String str) {
		System.out.println("�����ε� ���� ���� ���ڿ�: " + str);
	}

	public void displayInt(int number) {
		System.out.println("�����ε� ���� ���� ����: " + number);
	}

	public void displayInt(String str2, int number) { // �����ε� ����: �޼ҵ� �̸��� ����, Ÿ�Ժ���, ����, ������ �޶�� ��
		System.out.println("�����ε� �� ���ڿ� �� ����: " + str2 + " " + number);
	}

}

public class OverloadTest2_Practice {
	public static void main(String[] args) {

		DisplayInfo2_Practice d1 = new DisplayInfo2_Practice();

		d1.displayChar('F');
		d1.displayString("�ݰ��� �ʽ��ϴ�.");
		d1.displayInt(666666);
		d1.displayInt("�߰�����", 888888);
	}

}
