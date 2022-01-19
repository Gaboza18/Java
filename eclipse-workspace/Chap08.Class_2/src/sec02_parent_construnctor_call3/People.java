package sec02_parent_construnctor_call3;

public class People { // 대한민국 국민을 표현하는 클래스

	private String name;
	private String ssn; // 주민번호

	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

}
