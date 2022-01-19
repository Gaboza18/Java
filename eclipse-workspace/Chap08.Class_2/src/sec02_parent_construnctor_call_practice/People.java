package sec02_parent_construnctor_call_practice;

public class People { // 조상 클래스

	public String name; // 이름
	public String ssn; // 주민번호
	
	public People(String name, String ssn) { // people 객체
		
		this.name = name; 
		this.ssn = ssn;
	}

}
