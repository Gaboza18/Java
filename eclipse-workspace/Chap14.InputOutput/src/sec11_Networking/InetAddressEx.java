package sec11_Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {

		try {
			InetAddress localCom = InetAddress.getLocalHost();
			System.out.println("�� ��ǻ�� IP�ּ�: " + localCom.getHostAddress()); // ip�ּ� �о���� �޼ҵ�

			InetAddress[] inetArr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress remote : inetArr) {
				System.out.println("www.naver.com�� IP�ּ�: " + remote.getHostAddress()); // ���� Ip�ּ�
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();

		}
	}

}
