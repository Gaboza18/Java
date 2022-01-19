package Exercise3;

class Employee {

	public static long baseSalary = 100000;

	public long getBaseSalary() {
		return baseSalary;
	}
}

class Manager extends Employee { // 매니저 월급

	public long getSalary() {
		return baseSalary + 20000;
	}

}

class clerk extends Employee { // 점원 월급

	public long getSalary() {
		return baseSalary + 10000;
	}
}

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		System.out.println("기본 급여: " + e1.getBaseSalary() + "원");

		Manager e2 = new Manager();
		System.out.println("매니저 급여: " + e2.getSalary() + "원");

		clerk e3 = new clerk();
		System.out.println("점원 급여: " + e3.getSalary() + "원");

	}

}
