package sec11_abstract_class;

public class CdPlayer extends Player {

	@Override
	void play(int pos) {
		currentPos = pos;
		System.out.println("CD �÷��̾ " + pos + "�� Ʈ���� ����մϴ�.");

	}

	@Override
	void stop() {
		System.out.println("CD �÷��̾��� ����� �����մϴ�.");
	}

	void nextTrack() { // ������
		if (!pause) { // �Ͻ����� ���°� �ƴҶ�
			currentPos++;
			System.out.println("CD �÷��̾ " + currentPos + "�� Ʈ���� ����մϴ�.");
		} else {
			System.out.println("CD �÷��̾ ������� �ƴմϴ�.");
		}

	}

	void prevTrack() { // ������
		if (!pause && currentPos > 1) { // �Ͻ����� ���°� �ƴҶ�, ������� 1�� Ʈ���̻��϶�
			currentPos--;
			System.out.println("CD �÷��̾ " + currentPos + "�� Ʈ���� ����մϴ�.");
		} else {
			System.out.println("CD �÷��̾ ������� �ƴմϴ�.");
		}
	}
}