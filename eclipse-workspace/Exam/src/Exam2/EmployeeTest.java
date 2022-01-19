package Exam2;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee Ee1 = new Employee(100, "Ã¶¼ö", "±è", 1000000);
		Employee Ee2 = new Employee(101, "¿µÈñ", "ÀÌ", 1100000);
		Employee Ee3 = new Employee(102, "±æµ¿", "È«", 1300000);

		dispSalary(Ee1);
		dispSalary(Ee2);
		dispSalary(Ee3);
		System.out.println();

		Ee1.raiseSalary(15);
		System.out.println("Ã¶¼öÀÇ ÀÎ»óµÈ ±Þ¿©");
		dispSalary(Ee1);
		System.out.println();

		Employee[] empArr1 = new Employee[3];
		empArr1[0] = new Employee(100, "Ã¶¼ö", "±è", 1000000);
		empArr1[1] = new Employee(101, "¿µÈñ", "ÀÌ", 1100000);
		empArr1[2] = new Employee(102, "±æµ¿", "È«", 1300000);

		for (Employee emp : empArr1) {
			System.out.println(emp.toString());
		}

	}

	public static void dispSalary(Employee e) {
		System.out.printf("»ç¹ø:%d ÀÌ¸§:%s ¿ù±Þ¿©:%d ³âºÀ:%d\n", e.getId(), e.getName(), e.getSalary(), e.getAnnualSalary());
	}
}
