package sec01_Interface_declare;

public class TV implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV ���� 'ON'");

	}

	@Override
	public void turnOff() {
		System.out.println("TV ���� 'OFF'");

	}

	@Override
	public void setVolume(int volume) {

		if (volume >= RemoteControl.MAX_VOLUME) { // �������� 10�� �Ѿ��, �ִ밪�� ��� �̱� ������ �������̽�.�ִ� �ҷ��´�
			volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			volume = RemoteControl.MIN_VOLUME;
		} else {
			volume = volume;
		}
		System.out.println("���� TV ����: " + volume + " �Դϴ�.");

	}

}
