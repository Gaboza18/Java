package sec14_final_filed_Practice;

class Person {
	final String nation = "Korea";
	final String ssn; // �ֹι�ȣ
	String name;

	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}

public class PersonTest_Practice {

	public static void main(String[] args) {
		Person p1 = new Person("123456789", "ȫ�浿");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
	}

}
