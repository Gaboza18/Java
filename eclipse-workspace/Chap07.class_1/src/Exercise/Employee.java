package Exercise;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public Employee() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// 연봉을 얻어오는 메소드
	public int getAnnualSalary() {
		return salary * 12;
	}

	// 인상된 급여
	public int raiseSalary(int percent) {
		int UPpercent = (int) (salary * (double) percent / 100);
		this.salary += UPpercent;

		return salary;
	}

	public String toString() {
		return "Employ[id: " + id + ", name: " + getName() + ", salary: " + salary + "]";
	}
}
