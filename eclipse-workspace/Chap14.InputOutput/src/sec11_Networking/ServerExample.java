package sec11_Networking;

import java.io.IOException;
import java.net.*;

/*
 *  ���� ���α׷�
 */

public class ServerExample { // ������ �� cmdâ

	public static void main(String[] args) {

		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket(5001);
			while (true) {
				System.out.println("���� �����..");
				Socket socket = serverSocket.accept(); // ������ ���� ����� ������ ����
				InetSocketAddress sa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[���� ����]" + sa.getHostName());
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
