package sec11_abstract_class;

public class PlayerTest {

	public static void main(String[] args) {

		// Player pl = new Player(); //�߻�Ŭ���� �̹Ƿ� ��üȭ �Ұ�

		CdPlayer player = new CdPlayer();

		player.play(1); // 1�� Ʈ�� 
		player.nextTrack(); // ���� Ʈ�� 
		player.pause(); // ����
		player.prevTrack(); // ���� Ʈ��
		player.pause();
		player.prevTrack();

	}

}
