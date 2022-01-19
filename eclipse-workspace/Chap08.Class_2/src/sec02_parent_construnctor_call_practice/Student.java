package sec02_parent_construnctor_call_practice;

public class Student extends People { // 조상: People 자손: Student
	
	public int studentNo; // 학번
	
	public Student(String name, String ssn, int studentNo){
		
		super(name,ssn); // 조상 생성자 호출, 조상 클래스 기본 생성자 없기 때문 작성
		this.studentNo = studentNo;
	}
}
