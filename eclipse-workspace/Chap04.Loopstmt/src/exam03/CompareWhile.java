package exam03;

import java.io.IOException;

public class CompareWhile { // Do-While�� ���� While������ ��ȯ

	public static void main(String[] args) throws IOException {

		int input = 0; // Ű���忡�� �Է��� ���ڸ� �ڵ�� ����

		System.out.println("������ �Է��ϼ���");
		System.out.println("�Է��� ��ĥ���� x�� �Է��ϼ���");

		input = System.in.read();
		while (input != 'x') { // x�� �ƴϸ� �ݺ��Ѵ�.
			System.out.print((char) input);
			input = System.in.read(); // Ű����� �Է¹޴±���

		}
	}

}
