package Exercise;

public class UserTest {

	public static void main(String[] args) {
		User user1 = new User(); // Ŭ���� ȣ��
		user1.name = "HongGilDong";
		user1.age = 35;

		System.out.println("name= " + user1.name);
		System.out.println("age= " + user1.age);

		user1.printData(); // �޼ҵ� ȣ��
	}

}
