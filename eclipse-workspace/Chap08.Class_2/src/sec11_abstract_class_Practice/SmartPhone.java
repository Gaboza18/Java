package sec11_abstract_class_Practice;

public class SmartPhone extends Phone {
	
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색 시작합니다");
	}
}
