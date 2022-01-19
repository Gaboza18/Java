package sec11_abstract_class;

public class CdPlayer extends Player {

	@Override
	void play(int pos) {
		currentPos = pos;
		System.out.println("CD 플레이어가 " + pos + "번 트랙을 재생합니다.");

	}

	@Override
	void stop() {
		System.out.println("CD 플레이어의 재생을 중지합니다.");
	}

	void nextTrack() { // 다음곡
		if (!pause) { // 일시정지 상태가 아닐때
			currentPos++;
			System.out.println("CD 플레이어가 " + currentPos + "번 트랙을 재생합니다.");
		} else {
			System.out.println("CD 플레이어가 재생중이 아닙니다.");
		}

	}

	void prevTrack() { // 이전곡
		if (!pause && currentPos > 1) { // 일시정지 상태가 아닐때, 현재곡이 1번 트랙이상일때
			currentPos--;
			System.out.println("CD 플레이어가 " + currentPos + "번 트랙을 재생합니다.");
		} else {
			System.out.println("CD 플레이어가 재생중이 아닙니다.");
		}
	}
}