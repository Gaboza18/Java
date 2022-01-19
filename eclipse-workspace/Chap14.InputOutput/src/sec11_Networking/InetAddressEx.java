package sec11_Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {

		try {
			InetAddress localCom = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP주소: " + localCom.getHostAddress()); // ip주소 읽어오는 메소드

			InetAddress[] inetArr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress remote : inetArr) {
				System.out.println("www.naver.com의 IP주소: " + remote.getHostAddress()); // 공인 Ip주소
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();

		}
	}

}
