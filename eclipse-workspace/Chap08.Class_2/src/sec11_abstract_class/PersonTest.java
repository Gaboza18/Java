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
		super(name); // name private 설정 해서 super로 불러온다
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
		return "급여 " + Salary + "원 받는직원";
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
		return "전공(" + major + ") 학생";
	}

}

public class PersonTest {
	public static void main(String[] args) {

		Person[] people = {

				new Employee("아무개", 50000, 2005, 10, 1), new Student("장영실", "컴퓨터공학과") };

		System.out.println(people[0].getName() + ": " + people[0].getDescription());
		System.out.println(people[1].getName() + ": " + people[1].getDescription());
	}

}
