package sec01_Interface_declare;

public class Audio implements RemoteControl { // 클래스 implements 인터페이스 형식
	// 멤버 변수

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오 전원이 켜집니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("오디오 전원이 꺼집니다.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume >= RemoteControl.MAX_VOLUME) { // 볼륨값이 10이 넘어갈때, 최대값이 상수 이기 때문에 인터페이스.최댓값 불러온다
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨: " + volume + " 입니다.");

	}

}