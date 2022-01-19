package Exercise;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee Ee1 = new Employee(100, "철수", "김", 1000000);
		Employee Ee2 = new Employee(101, "영희", "이", 1100000);
		Employee Ee3 = new Employee(102, "길동", "홍", 1000000);

		dispSalary(Ee1);
		dispSalary(Ee2);
		dispSalary(Ee3);

		// 철수의 연봉을 15% 올린다.
		Ee1.raiseSalary(15);
		System.out.println("철수의 인상된 급여");
		dispSalary(Ee1);
		
		// 배열을 이용하여 입력된 정보 출력
		Employee[] empArr = new Employee[3];
		empArr[0] = new Employee(103, "순신", "이", 1500000);
		empArr[1] = new Employee(104, "보고", "장", 1400000);
		empArr[2] = new Employee(103, "두한", "김", 1440000);

		for (Employee emp : empArr) { // 향상된 for문 활용한 배열출력
			System.out.println(emp.toString());
		}

	}

	public static void dispSalary(Employee e) {
		System.out.printf("사원:%d 이름:%s %s 월급여:%d 년봉:%d\n", e.getId(), e.getlastName(), e.getfirstName(), e.getSalary(),
				e.getAnnualSalary());
	}
}
