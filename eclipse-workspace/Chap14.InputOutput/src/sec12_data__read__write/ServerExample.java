package sec12_data__read__write;

import java.io.*;
import java.net.*;

/*
 *  서버 프로그램
 */

public class ServerExample { // 컴파일 후
	// cmd창 cd C:\Users\Administrator\eclipse-workspace\Chap14.InputOutput\bin ->
	// java sec12_data__read__write.ClientExample 실행

	public static void main(String[] args) {

		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket(5001);
			while (true) {
				System.out.println("연결 대기중..");
				Socket socket = serverSocket.accept(); // 연결후 서로 통신이 가능한 상태
				InetSocketAddress sa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락]" + sa.getHostName());

				byte[] bytes = null;
				bytes = new byte[255];

				InputStream is = socket.getInputStream();
				int count = is.read(bytes); // count: 읽어온 데이터의 바이트 수
				String message = new String(bytes, 0, count, "UTF-8"); // 바이트의 배열에서 첫번째 위치부터 count만큼 문자열로
				System.out.println("수신한 데이터: " + message);

				// 클라이언트로 데이터 전송하기
				OutputStream os = socket.getOutputStream();
				message = "안녕! 클라이언트";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("데이터 보내기 성공..");

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
