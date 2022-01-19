package sec11_abstract_class;

public class PlayerTest {

	public static void main(String[] args) {

		// Player pl = new Player(); //추상클래스 이므로 객체화 불가

		CdPlayer player = new CdPlayer();

		player.play(1); // 1번 트랙 
		player.nextTrack(); // 다음 트랙 
		player.pause(); // 멈춤
		player.prevTrack(); // 이전 트랙
		player.pause();
		player.prevTrack();

	}

}
