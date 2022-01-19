package Exercise;

import java.util.*;

class Student2 {

	private int stud_no;
	private String name;
	private int age;

	public Student2(int stud_no, String name, int age) {
		this.stud_no = stud_no;
		this.name = name;
		this.age = age;

	}

	public int getStud_no() {
		return stud_no;
	}

	public void setStud_no(int stud_no) {
		this.stud_no = stud_no;
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

public class ArrayListEx1_Practice {

	public static void main(String[] args) {

		List<Student2> studentList = new ArrayList<>(); // ArrayList ��ü ����

		studentList.add(new Student2(104, "�谳��", 94));
		studentList.add(new Student2(105, "�踻��", 93));
		studentList.add(new Student2(106, "��Ҷ�", 91));

		printList(studentList);
	}

	private static void printList(List<Student2> studentList) {

		for (int i = 0; i < studentList.size(); i++) {
			System.out.println("��ȣ: " + studentList.get(i).getStud_no());
			System.out.println("�̸�: " + studentList.get(i).getName());
			System.out.println("����: " + studentList.get(i).getAge());
			System.out.println();
		}

	}

}
