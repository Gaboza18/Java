package sec12_data__read__write;

import java.io.*;
import java.net.*;

public class ClientExample {

	public static void main(String[] args) {

		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println("연결요청..");

			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("연결 성공..");

			byte[] bytes = null;
			OutputStream os = socket.getOutputStream();
			String message = "Hello HongGilDong!";
			bytes = message.getBytes("UTF-8"); // 메세지를 바이트 단위로 변환
			os.write(bytes);
			os.flush();
			System.out.println("데이터 보내기 성공..");

			InputStream is = socket.getInputStream();
			bytes = new byte[255];
			int count = is.read(bytes);
			message = new String(bytes, 0, count, "UTF-8");
			System.out.println("수신한 데이터: " + message);
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