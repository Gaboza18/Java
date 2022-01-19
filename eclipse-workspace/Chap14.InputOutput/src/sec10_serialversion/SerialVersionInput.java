package sec10_serialversion;

import java.io.*;

public class SerialVersionInput {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		try {
			FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis);

			C c = (C) ois.readObject();
			System.out.println("field=" + c.field1);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
