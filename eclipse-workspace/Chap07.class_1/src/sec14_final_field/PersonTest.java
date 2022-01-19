package sec14_final_field;

class Person {
	final String nation = "Korea"; // 한번설정되면 바꿀수 없다
	final String ssn; // 주민번호
	String name;

	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("123123-1234567", "유관순");

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		System.out.println("");
		
		// final 멤버에 다른값 대입
		
		// p1.nation = "USA"; // final 필드에 대입할수 없음
		// p1.ssn = "123-789-456"; // final 필드에 대입할수 없음
		
		Person p2 = new Person("123123-1895567", "홍길동");
		System.out.println(p2.nation);
		System.out.println(p2.ssn);
		System.out.println(p2.name);
	}

}