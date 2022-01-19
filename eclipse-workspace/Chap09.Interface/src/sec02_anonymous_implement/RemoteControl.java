package sec02_anonymous_implement;

public interface RemoteControl { // ��üȭ �Ұ���

	public static final int MAX_VOLUME = 10; // ��� public static final ��������
	int MIN_VOLUME = 0; // ��� ����

	// �߻� �޼ҵ�(interface ���� '�߻�޼ҵ�' ����

	void turnOn(); // ������ �Ѵ� ���

	void turnOff(); // ���� ���� ���

	void setVolume(int volume);

	// ����Ʈ �޼ҵ�(���ο� ����� �߰��ϸ� �������̽��� ������ Ŭ�������� ���� �ʿ����)
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("���Ұ� ���");
		} else {
			System.out.println("���Ұ� ����");
		}
	}

	// static �޼ҵ�
	static void changeBattery() {
		System.out.println("������ �������� ��ü�մϴ�.");
	}
}
