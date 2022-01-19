package Exam2;

public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student("장보고", 1, 10, 89, 93, 75);
		dispSalary(s1);

	}

	public static void dispSalary(Student s1) {
		System.out.printf("반:%d 번호:%d 이름:%s 총점:%d점 평균:%5.2f점\n", 
				s1.getBan(), s1.getNo(), s1.getName(), s1.getTotal(),s1.getAverage());
	}

}
