package exercise;

public class IfExample3 { // 랜덤 주사위 문제
	public static void main(String[] args) {
		
		int DiceAnyNumber = 0;
		DiceAnyNumber = (int) (Math.random() * 6) + 1; // (int)1.0<=Math.random()<(int)7.0

		if (DiceAnyNumber == 1) {
			System.out.println("랜덤주사위 결과는 '1' 입니다.");
		} else if (DiceAnyNumber == 2) {
			System.out.println("랜덤주사위 결과는 '2' 입니다.");
		} else if (DiceAnyNumber == 3) {
			System.out.println("랜덤주사위 결과는 '3' 입니다.");
		} else if (DiceAnyNumber == 4) {
			System.out.println("랜덤주사위 결과는 '4' 입니다.");
		} else if (DiceAnyNumber == 5) {
			System.out.println("랜덤주사위 결과는 '5' 입니다.");
		} else {
			System.out.println("랜덤주사위 결과는 '6' 입니다.");
		}
	}
}
