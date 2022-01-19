package sec02_parent_construnctor_call_practice;

public class StudentExample {

	public static void main(String[] args) {

		Student Student = new Student("홍길순", "12341234", 1);

		System.out.println("이름: " + Student.name);
		System.out.println("주민번호: " + Student.ssn);
		System.out.println("학번: " + Student.studentNo);

	}

}
