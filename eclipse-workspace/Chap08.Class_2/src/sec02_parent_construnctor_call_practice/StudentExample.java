package sec02_parent_construnctor_call_practice;

public class StudentExample {

	public static void main(String[] args) {

		Student Student = new Student("ȫ���", "12341234", 1);

		System.out.println("�̸�: " + Student.name);
		System.out.println("�ֹι�ȣ: " + Student.ssn);
		System.out.println("�й�: " + Student.studentNo);

	}

}
