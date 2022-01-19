package sec14_final_field;

class Person {
	final String nation = "Korea"; // �ѹ������Ǹ� �ٲܼ� ����
	final String ssn; // �ֹι�ȣ
	String name;

	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("123123-1234567", "������");

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		System.out.println("");
		
		// final ����� �ٸ��� ����
		
		// p1.nation = "USA"; // final �ʵ忡 �����Ҽ� ����
		// p1.ssn = "123-789-456"; // final �ʵ忡 �����Ҽ� ����
		
		Person p2 = new Person("123123-1895567", "ȫ�浿");
		System.out.println(p2.nation);
		System.out.println(p2.ssn);
		System.out.println(p2.name);
	}

}