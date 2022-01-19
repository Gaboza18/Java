package sec05_HashMap;

import java.util.*;

public class Student {

	public int sno;
	public String name;

	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(sno, name);
	}

	/*
	 * �ΰ��� student ��ü�� ������ �Ǵ��ϴ� �޼ҵ�
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj; // sno, name �� ������ �ְ� Student Ÿ������ ��ȯ�Ѵ�

			return (this.sno == student.sno) && (this.name.equals(student.name));
		} else { // Ÿ���� ��ȯ�� ���� �ʾ������
			return false;
		}

	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}

}
