package Sec02;

public class CharExample {

	public static void main(String[] args) { // char Ÿ���� �ϳ��� ���ڸ� �����ϴ� Ÿ��

		char c1 = 'A';
		int code = c1; // A = 65 �ƽ�Ű �ڵ尪
		char c2 = '��'; // �� = 44032 ���� �ڵ尪
		int code2 = c2;
		char c3 = '\uac00'; // �����ڵ�� ����

		System.out.println("c1 = " + c1);
		System.out.println("c1 = " + code);
		System.out.println("c2 = " + c2);
		System.out.println("c1 = " + code2);
		System.out.println("c3 = " + c3);
	}

}
