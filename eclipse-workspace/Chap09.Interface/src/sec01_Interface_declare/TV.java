package sec01_Interface_declare;

public class TV implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV 전원 'ON'");

	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원 'OFF'");

	}

	@Override
	public void setVolume(int volume) {

		if (volume >= RemoteControl.MAX_VOLUME) { // 볼륨값이 10이 넘어갈때, 최대값이 상수 이기 때문에 인터페이스.최댓값 불러온다
			volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			volume = RemoteControl.MIN_VOLUME;
		} else {
			volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + volume + " 입니다.");

	}

}
