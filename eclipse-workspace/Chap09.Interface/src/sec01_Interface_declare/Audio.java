package sec01_Interface_declare;

public class Audio implements RemoteControl { // Ŭ���� implements �������̽� ����
	// ��� ����

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("����� ������ �����ϴ�.");

	}

	@Override
	public void turnOff() {
		System.out.println("����� ������ �����ϴ�.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume >= RemoteControl.MAX_VOLUME) { // �������� 10�� �Ѿ��, �ִ밪�� ��� �̱� ������ �������̽�.�ִ� �ҷ��´�
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� ����� ����: " + volume + " �Դϴ�.");

	}

}