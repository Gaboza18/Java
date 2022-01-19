package sec11_Networking;

import java.io.IOException;
import java.net.*;

/*
 *  서버 프로그램
 */

public class ServerExample { // 컴파일 후 cmd창

	public static void main(String[] args) {

		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket(5001);
			while (true) {
				System.out.println("연결 대기중..");
				Socket socket = serverSocket.accept(); // 연결후 서로 통신이 가능한 상태
				InetSocketAddress sa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락]" + sa.getHostName());
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
