package Exam2;

public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student("�庸��", 1, 10, 89, 93, 75);
		dispSalary(s1);

	}

	public static void dispSalary(Student s1) {
		System.out.printf("��:%d ��ȣ:%d �̸�:%s ����:%d�� ���:%5.2f��\n", 
				s1.getBan(), s1.getNo(), s1.getName(), s1.getTotal(),s1.getAverage());
	}

}
