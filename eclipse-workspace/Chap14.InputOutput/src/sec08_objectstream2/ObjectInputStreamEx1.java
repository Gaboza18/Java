package sec08_objectstream2;

import java.io.*;

public class ObjectInputStreamEx1 {

	public static void main(String[] args) {

		String fileName = "object2.data";

		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);

			UserInfo u1 = (UserInfo) ois.readObject();
			UserInfo u2 = (UserInfo) ois.readObject();

			System.out.println(u1);
			System.out.println(u2);

			ois.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
