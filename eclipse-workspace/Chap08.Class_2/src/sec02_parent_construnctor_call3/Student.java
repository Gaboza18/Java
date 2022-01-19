package sec02_parent_construnctor_call3;

public class Student extends People {
	public int studNo; // 학번

	public Student(String name, String ssn, int studNo) {
		super(name, ssn); // private로 선언되있기 때문 , 조상 클래스의 기본생성자가 없기때문
		this.studNo = studNo;
	}

	public int getStudNo() {
		return studNo;
	}

	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}

}
