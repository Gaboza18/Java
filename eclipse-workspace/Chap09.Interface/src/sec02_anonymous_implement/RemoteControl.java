package sec02_anonymous_implement;

public interface RemoteControl { // 객체화 불가능

	public static final int MAX_VOLUME = 10; // 상수 public static final 생략가능
	int MIN_VOLUME = 0; // 상수 생략

	// 추상 메소드(interface 에는 '추상메소드' 가능

	void turnOn(); // 전원을 켜는 기능

	void turnOff(); // 전원 끄는 기능

	void setVolume(int volume);

	// 디폴트 메소드(새로운 기능을 추가하면 인터페이스를 구현한 클래스에서 변경 필요없음)
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("음소거 모드");
		} else {
			System.out.println("음소거 해제");
		}
	}

	// static 메소드
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교체합니다.");
	}
}
