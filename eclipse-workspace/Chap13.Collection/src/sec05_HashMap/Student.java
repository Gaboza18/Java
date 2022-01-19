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
	 * 두개의 student 객체가 같은지 판단하는 메소드
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj; // sno, name 을 읽을수 있게 Student 타입으로 변환한다

			return (this.sno == student.sno) && (this.name.equals(student.name));
		} else { // 타입이 변환이 되지 않았을경우
			return false;
		}

	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}

}
