package sec10_serialversion;

import java.io.*;

public class SerialVersionOutput {

	public static void main(String[] args) throws IOException {

		try {
			FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			C c = new C();
			c.field1 = 10;

			oos.writeObject(c);
			oos.flush();
			oos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
