package sec03_system_in_out;

import java.io.*;

public class SystemErrEx {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		PrintStream ps = null;

		System.out.println("표준 out: Hello World~");
		System.err.println("표준 err: Hello err~");

		try {
			fos = new FileOutputStream("program.out");
			ps = new PrintStream(fos); // FileOutputStream을 printstream으로 지정
			System.setOut(ps); // 표준출력을 변경하는 메소드

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Test standard out!"); // 콘솔에 출력되지 않고 표준출력을 file로 출력한다
		System.err.println("Test standard err!");
	}
}
