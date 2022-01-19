package Exercise;

public class UserTest {

	public static void main(String[] args) {
		User user1 = new User(); // 클래스 호출
		user1.name = "HongGilDong";
		user1.age = 35;

		System.out.println("name= " + user1.name);
		System.out.println("age= " + user1.age);

		user1.printData(); // 메소드 호출
	}

}
