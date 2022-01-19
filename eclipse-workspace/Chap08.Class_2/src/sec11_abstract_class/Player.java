package sec11_abstract_class;

/*
 *  음악을 재생하는 플레이어 클래스
 */
public abstract class Player {

	int currentPos;
	boolean pause; // 일시정지 상태

	Player() {
		pause = false; // 일시정지 x
		currentPos = 0;
	}

	abstract void play(int pos); // 현재 상태에서 play의 구체적인 것을 구현할 수 없음

	abstract void stop();

	/*
	 * 추상클래스 내에서 일반 메소드 구현 기능
	 */
	void play() {
		play(currentPos); // 추상메소드를 호출 가능
	}

	void pause() { // 일시정지 기능을 구현하는 메소드
		if (pause) { // pause = 참, 일시정지 상태임
			pause = false; // 일시정지 풀림
			play(currentPos);
		} else {
			pause = true;
			stop();
		}
	}
}