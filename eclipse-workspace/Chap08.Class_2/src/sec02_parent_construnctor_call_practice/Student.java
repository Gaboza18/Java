package sec02_parent_construnctor_call_practice;

public class Student extends People { // ����: People �ڼ�: Student
	
	public int studentNo; // �й�
	
	public Student(String name, String ssn, int studentNo){
		
		super(name,ssn); // ���� ������ ȣ��, ���� Ŭ���� �⺻ ������ ���� ���� �ۼ�
		this.studentNo = studentNo;
	}
}
