package exam03;

import java.io.IOException; //����ó��

public class DoWhileExample1 { //x�� �Է��Ҷ� ���� �ݺ� ����
	public static void main(String[] args) throws IOException {

		int input = 0; // Ű���忡�� �Է��� ���ڸ� �ڵ�� ����

		System.out.println("������ �Է��ϼ���");
		System.out.println("�Է��� ��ĥ���� x�� �Է��ϼ���");

		do {
			input = System.in.read(); // Ű���忡�� �ѱ��ھ� �Է� �޴´�.
			System.out.print((char) input);
		} while (input != 'x'); // x�� �Է��ϸ� Ż���Ѵ�.
	}
}
