package sec09_objectStream3;

import java.io.*;

class SuperUserInfo {
	String name;
	String password;

	SuperUserInfo() {
		this("Unknown", "1111");
	}

	@Override
	public String toString() {
		return "SuperUserInfo [name=" + name + ", password=" + password + "]";
	}

	public SuperUserInfo(String name, String password) {

		this.name = name;
		this.password = password;
	}

}

public class UserInfo extends SuperUserInfo implements Serializable {

	int age;

	public UserInfo() {
		this("Unknown", "1111", 0);

	}

	@Override
	public String toString() {
		return "UserInfo [name= " + name + ", password= " + password + ", age=" + age + "]";
	}

	public UserInfo(String name, String password, int age) {
		super(name, password);
		this.age = age;
	}

	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name);
		out.writeUTF(password);
		out.defaultWriteObject(); // serializable �Ǿ� �ִ� ����� write ��
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		password = in.readUTF();
		in.defaultReadObject(); // serializable �Ǿ� �ִ� ����� �о����
	}
}