package Exercise;

import java.util.*;

class Student {

	private int Stud_no;
	private String name;
	private int age;

	public Student(int Stud_no, String name, int age) {
		this.Stud_no = Stud_no;
		this.name = name;
		this.age = age;
	}

	public int getStud_no() {
		return Stud_no;
	}

	public void setStud_no(int stud_no) {
		Stud_no = stud_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class ArrayListEx1 extends Student {

	public ArrayListEx1(int Stud_no, String name, int age) {
		super(Stud_no, name, age);
	}

	public static void main(String[] args) {

		ArrayList<Student> studList = new ArrayList<Student>();

		studList.add(new Student(101, "ȫ�浿", 25));
		studList.add(new Student(102, "�̼���", 33));
		studList.add(new Student(103, "�念��", 29));

		printList(studList);
	}

	public static void printList(ArrayList<Student> list1) {

		for (int i = 0; i < list1.size(); i++) {
			System.out.println("��ȣ: " + list1.get(i).getStud_no());
			System.out.println("�̸�: " + list1.get(i).getName());
			System.out.println("����: " + list1.get(i).getAge());
			System.out.println();
		}
	}
}
