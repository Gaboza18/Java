package sec07_objectstream;

import java.io.*;

public class ObjectInputStreamEx {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("object.data");
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
