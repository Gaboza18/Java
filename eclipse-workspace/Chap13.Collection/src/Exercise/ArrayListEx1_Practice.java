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

		List<Student2> studentList = new ArrayList<>(); // ArrayList °´Ã¼ »ý¼º

		studentList.add(new Student2(104, "±è°³¶Ë", 94));
		studentList.add(new Student2(105, "±è¸»¶Ë", 93));
		studentList.add(new Student2(106, "±è¼Ò¶Ë", 91));

		printList(studentList);
	}

	private static void printList(List<Student2> studentList) {

		for (int i = 0; i < studentList.size(); i++) {
			System.out.println("¹øÈ£: " + studentList.get(i).getStud_no());
			System.out.println("ÀÌ¸§: " + studentList.get(i).getName());
			System.out.println("³ªÀÌ: " + studentList.get(i).getAge());
			System.out.println();
		}

	}

}
