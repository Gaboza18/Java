package sec06_Properties;

import java.util.*;

public class PropertyEx { // App 설정값 저장하거나 읽어올때 자주사용

	public static void main(String[] args) {

		Properties prop = new Properties();

		prop.setProperty("timeout", "30"); // String , String
		prop.setProperty("language", "kr");
		prop.setProperty("capacity", "10");

		// 키 값 전체를 읽어옴
		Enumeration e = prop.propertyNames();

		while (e.hasMoreElements()) {
			String element = (String) e.nextElement();
			System.out.println(element + "= " + prop.getProperty(element));
		}
		
		System.out.println();
		prop.list(System.out); // System.out : 콘솔을 의미함
	}

}
