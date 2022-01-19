package sec12_data__read__write;

import java.io.*;
import java.net.*;

/*
 *  ���� ���α׷�
 */

public class ServerExample { // ������ ��
	// cmdâ cd C:\Users\Administrator\eclipse-workspace\Chap14.InputOutput\bin ->
	// java sec12_data__read__write.ClientExample ����

	public static void main(String[] args) {

		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket(5001);
			while (true) {
				System.out.println("���� �����..");
				Socket socket = serverSocket.accept(); // ������ ���� ����� ������ ����
				InetSocketAddress sa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[���� ����]" + sa.getHostName());

				byte[] bytes = null;
				bytes = new byte[255];

				InputStream is = socket.getInputStream();
				int count = is.read(bytes); // count: �о�� �������� ����Ʈ ��
				String message = new String(bytes, 0, count, "UTF-8"); // ����Ʈ�� �迭���� ù��° ��ġ���� count��ŭ ���ڿ���
				System.out.println("������ ������: " + message);

				// Ŭ���̾�Ʈ�� ������ �����ϱ�
				OutputStream os = socket.getOutputStream();
				message = "�ȳ�! Ŭ���̾�Ʈ";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("������ ������ ����..");

				os.close();
				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
