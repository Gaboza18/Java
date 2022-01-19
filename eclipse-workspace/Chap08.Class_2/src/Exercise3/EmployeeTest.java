package Exercise3;

class Employee {

	public static long baseSalary = 100000;

	public long getBaseSalary() {
		return baseSalary;
	}
}

class Manager extends Employee { // �Ŵ��� ����

	public long getSalary() {
		return baseSalary + 20000;
	}

}

class clerk extends Employee { // ���� ����

	public long getSalary() {
		return baseSalary + 10000;
	}
}

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		System.out.println("�⺻ �޿�: " + e1.getBaseSalary() + "��");

		Manager e2 = new Manager();
		System.out.println("�Ŵ��� �޿�: " + e2.getSalary() + "��");

		clerk e3 = new clerk();
		System.out.println("���� �޿�: " + e3.getSalary() + "��");

	}

}
