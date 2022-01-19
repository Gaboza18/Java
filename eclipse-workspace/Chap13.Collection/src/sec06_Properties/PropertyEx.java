package sec06_Properties;

import java.util.*;

public class PropertyEx { // App ������ �����ϰų� �о�ö� ���ֻ��

	public static void main(String[] args) {

		Properties prop = new Properties();

		prop.setProperty("timeout", "30"); // String , String
		prop.setProperty("language", "kr");
		prop.setProperty("capacity", "10");

		// Ű �� ��ü�� �о��
		Enumeration e = prop.propertyNames();

		while (e.hasMoreElements()) {
			String element = (String) e.nextElement();
			System.out.println(element + "= " + prop.getProperty(element));
		}
		
		System.out.println();
		prop.list(System.out); // System.out : �ܼ��� �ǹ���
	}

}
