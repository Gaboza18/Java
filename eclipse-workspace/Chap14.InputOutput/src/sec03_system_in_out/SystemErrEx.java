package sec03_system_in_out;

import java.io.*;

public class SystemErrEx {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		PrintStream ps = null;

		System.out.println("ǥ�� out: Hello World~");
		System.err.println("ǥ�� err: Hello err~");

		try {
			fos = new FileOutputStream("program.out");
			ps = new PrintStream(fos); // FileOutputStream�� printstream���� ����
			System.setOut(ps); // ǥ������� �����ϴ� �޼ҵ�

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Test standard out!"); // �ֿܼ� ��µ��� �ʰ� ǥ������� file�� ����Ѵ�
		System.err.println("Test standard err!");
	}
}
