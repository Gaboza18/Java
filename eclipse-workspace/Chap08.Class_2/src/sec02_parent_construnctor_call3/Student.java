package sec02_parent_construnctor_call3;

public class Student extends People {
	public int studNo; // �й�

	public Student(String name, String ssn, int studNo) {
		super(name, ssn); // private�� ������ֱ� ���� , ���� Ŭ������ �⺻�����ڰ� ���⶧��
		this.studNo = studNo;
	}

	public int getStudNo() {
		return studNo;
	}

	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}

}
