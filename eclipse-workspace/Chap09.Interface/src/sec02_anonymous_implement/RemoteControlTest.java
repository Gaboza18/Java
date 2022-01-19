package sec02_anonymous_implement;

import sec01_Interface_declare.RemoteControl;

public class RemoteControlTest { // �͸� ���� ��ü(Ŭ�������� �ο����� �ʰ� �������̽��� �����ϴ� ��ü�� ���� �� �ִ� ���) ���� �� ;

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("���� ����");

			}

			@Override
			public void turnOff() {
				System.out.println("���� ����");

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
				System.out.println("���� ����: " + volume + " �Դϴ�.");
			}

		};

		rc.turnOn();
		rc.setVolume(12);

	}

}
