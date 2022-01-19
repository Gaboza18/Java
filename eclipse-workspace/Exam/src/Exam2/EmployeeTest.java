package Exam2;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee Ee1 = new Employee(100, "ö��", "��", 1000000);
		Employee Ee2 = new Employee(101, "����", "��", 1100000);
		Employee Ee3 = new Employee(102, "�浿", "ȫ", 1300000);

		dispSalary(Ee1);
		dispSalary(Ee2);
		dispSalary(Ee3);
		System.out.println();

		Ee1.raiseSalary(15);
		System.out.println("ö���� �λ�� �޿�");
		dispSalary(Ee1);
		System.out.println();

		Employee[] empArr1 = new Employee[3];
		empArr1[0] = new Employee(100, "ö��", "��", 1000000);
		empArr1[1] = new Employee(101, "����", "��", 1100000);
		empArr1[2] = new Employee(102, "�浿", "ȫ", 1300000);

		for (Employee emp : empArr1) {
			System.out.println(emp.toString());
		}

	}

	public static void dispSalary(Employee e) {
		System.out.printf("���:%d �̸�:%s ���޿�:%d ���:%d\n", e.getId(), e.getName(), e.getSalary(), e.getAnnualSalary());
	}
}
