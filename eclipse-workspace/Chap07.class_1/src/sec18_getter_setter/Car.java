package sec18_getter_setter;

public class Car {
	// ��� ����(�ʵ�)
	int speed1; // �ܺο��� ��밡��(���� ��Ű�� �� ��밡��)
	private int speed2; // private: ���� Ŭ���� �������� ��밡��
	private boolean stop;

	// �޼ҵ�
	int getSpeed() { // ��������� ���� �˷��ִ� ����
		return speed2;
	}

	void setSpeed(int speed2) { // ��������� ���� �����ϴ� ����

		if (speed2 < 0) { // ���ǹ��� Ȱ���Ͽ� ���� �����Ҽ� �ִ�
			this.speed2 = 0;
		} else
			this.speed2 = speed2;
	}

	boolean isStop() { // boolean �� ��� get ��� is�޼ҵ��
		return stop;
	}

	void setStop(boolean stop) {
		this.stop = stop;
		this.speed2 = 0;
	}
}
