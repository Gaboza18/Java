package sec11_abstract_class;

import java.time.LocalDate;

abstract class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract String getDescription();
}

class Employee extends Person {

	private int Salary;
	private LocalDate hireDay;

	public Employee(String name, int Salary, int year, int month, int day) {
		super(name); // name private ���� �ؼ� super�� �ҷ��´�
		this.Salary = Salary;
		this.hireDay = LocalDate.of(year, month, day);
	}

	public int getSalary() {
		return Salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		Salary += (int) (byPercent / 100.0) * Salary;
	}

	@Override
	public String getDescription() {
		return "�޿� " + Salary + "�� �޴�����";
	}

}

class Student extends Person {

	private String major;

	public Student(String name, String major) {
		super(name);
		this.major = major;
	}

	@Override
	public String getDescription() {
		return "����(" + major + ") �л�";
	}

}

public class PersonTest {
	public static void main(String[] args) {

		Person[] people = {

				new Employee("�ƹ���", 50000, 2005, 10, 1), new Student("�念��", "��ǻ�Ͱ��а�") };

		System.out.println(people[0].getName() + ": " + people[0].getDescription());
		System.out.println(people[1].getName() + ": " + people[1].getDescription());
	}

}
