package sec05_Inputstreamreader;

import java.io.*;

public class ISRExPractice {

	public static void main(String[] args) throws IOException {

		InputStream is = System.in;

		InputStreamReader isr = new InputStreamReader(is);

		BufferedReader br = new BufferedReader(isr);
		String line = "";

		System.out.println("������� ���ڵ� ���: " + isr.getEncoding());

		int data = 0;

		do {
			System.out.println("������ �Է�(����: q): ");
			line = br.readLine();
			System.out.println("�Է��� ����: " + line);
		} while (!line.equals("q"));

		br.close();
		System.out.println("���α׷� ����");
	}

}
