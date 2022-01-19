package sec17_Singleton;

public class Singleton {

	// 자신이 새로운 객체를 생성
	private static Singleton singleton = new Singleton();

	// private 제어자를 가진 생성자
	private Singleton() {
	}

	static Singleton getInstance() {
		return singleton; // 위에서 생성한 singleton 객체의 주소를 리턴
	}

}
