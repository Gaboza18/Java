package sec11_abstract_class;

/*
 *  ������ ����ϴ� �÷��̾� Ŭ����
 */
public abstract class Player {

	int currentPos;
	boolean pause; // �Ͻ����� ����

	Player() {
		pause = false; // �Ͻ����� x
		currentPos = 0;
	}

	abstract void play(int pos); // ���� ���¿��� play�� ��ü���� ���� ������ �� ����

	abstract void stop();

	/*
	 * �߻�Ŭ���� ������ �Ϲ� �޼ҵ� ���� ���
	 */
	void play() {
		play(currentPos); // �߻�޼ҵ带 ȣ�� ����
	}

	void pause() { // �Ͻ����� ����� �����ϴ� �޼ҵ�
		if (pause) { // pause = ��, �Ͻ����� ������
			pause = false; // �Ͻ����� Ǯ��
			play(currentPos);
		} else {
			pause = true;
			stop();
		}
	}
}