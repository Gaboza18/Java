package sec02_parent_construnctor_call3;

public class People { // ���ѹα� ������ ǥ���ϴ� Ŭ����

	private String name;
	private String ssn; // �ֹι�ȣ

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
