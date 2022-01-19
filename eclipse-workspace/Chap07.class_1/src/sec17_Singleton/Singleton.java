package sec17_Singleton;

public class Singleton {

	// �ڽ��� ���ο� ��ü�� ����
	private static Singleton singleton = new Singleton();

	// private �����ڸ� ���� ������
	private Singleton() {
	}

	static Singleton getInstance() {
		return singleton; // ������ ������ singleton ��ü�� �ּҸ� ����
	}

}
