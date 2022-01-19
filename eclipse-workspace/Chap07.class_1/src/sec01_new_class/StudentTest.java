package sec01_new_class;

public class StudentTest {
	public static void main(String[] args) {

		Student s1 = new Student(); // Student 변수 및 저장소 선언
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}

}
