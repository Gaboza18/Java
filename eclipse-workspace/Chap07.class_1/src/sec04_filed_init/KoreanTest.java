package sec04_filed_init;

class Korean {
	String nation = "대한민국";
	String name;
	String birthday;

	public Korean(String name, String birthday) {
		this.name = name; // this = 자신의 객체를 참조하는 변수
		this.birthday = birthday;
	}
}

public class KoreanTest { // class는 여러개 생성가능, public 클래스는 1개, 클래스명은 서로 일치

	public static void main(String[] args) {

		Korean K1 = new Korean("이순신", "230114");
		
		System.out.println("국적: " + K1.nation);
		System.out.println("이름: " + K1.name);
		System.out.println("생일: " + K1.birthday);
		
		System.out.println("");
		
		Korean K2 = new Korean("유관순", "010301");
		
		System.out.println("국적: " + K2.nation);
		System.out.println("이름: " + K2.name);
		System.out.println("생일: " + K2.birthday);
		
		System.out.println("");
		
		Korean K3 = new Korean("김두환", "001122");
		
		System.out.println("국적: " + K3.nation);
		System.out.println("이름: " + K3.name);
		System.out.println("생일: " + K3.birthday);
	}

}
