package sec07_objectstream;

import java.io.*;

/*
 *  UserInfo ��ü�� object.data ���Ͽ� Write�ϴ� ����
 */
public class ObjectOutputStreamEx {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("object.data");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		UserInfo u1 = new UserInfo("Michael", "1234", 20);
		UserInfo u2 = new UserInfo("Boss", "5678", 30);

		oos.writeObject(u1);
		oos.writeObject(u2);

		oos.close();
		System.out.println("����ȭ�� �Ϸ�Ǿ����ϴ�.");
	}

}
