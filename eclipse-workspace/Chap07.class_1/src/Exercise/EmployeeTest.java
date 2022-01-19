package Exercise;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee Ee1 = new Employee(100, "ö��", "��", 1000000);
		Employee Ee2 = new Employee(101, "����", "��", 1100000);
		Employee Ee3 = new Employee(102, "�浿", "ȫ", 1000000);

		dispSalary(Ee1);
		dispSalary(Ee2);
		dispSalary(Ee3);

		// ö���� ������ 15% �ø���.
		Ee1.raiseSalary(15);
		System.out.println("ö���� �λ�� �޿�");
		dispSalary(Ee1);
		
		// �迭�� �̿��Ͽ� �Էµ� ���� ���
		Employee[] empArr = new Employee[3];
		empArr[0] = new Employee(103, "����", "��", 1500000);
		empArr[1] = new Employee(104, "����", "��", 1400000);
		empArr[2] = new Employee(103, "����", "��", 1440000);

		for (Employee emp : empArr) { // ���� for�� Ȱ���� �迭���
			System.out.println(emp.toString());
		}

	}

	public static void dispSalary(Employee e) {
		System.out.printf("���:%d �̸�:%s %s ���޿�:%d ���:%d\n", e.getId(), e.getlastName(), e.getfirstName(), e.getSalary(),
				e.getAnnualSalary());
	}
}
