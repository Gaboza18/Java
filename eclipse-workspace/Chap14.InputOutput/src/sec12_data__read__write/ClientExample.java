package sec12_data__read__write;

import java.io.*;
import java.net.*;

public class ClientExample {

	public static void main(String[] args) {

		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println("�����û..");

			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("���� ����..");

			byte[] bytes = null;
			OutputStream os = socket.getOutputStream();
			String message = "Hello HongGilDong!";
			bytes = message.getBytes("UTF-8"); // �޼����� ����Ʈ ������ ��ȯ
			os.write(bytes);
			os.flush();
			System.out.println("������ ������ ����..");

			InputStream is = socket.getInputStream();
			bytes = new byte[255];
			int count = is.read(bytes);
			message = new String(bytes, 0, count, "UTF-8");
			System.out.println("������ ������: " + message);
			os.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}