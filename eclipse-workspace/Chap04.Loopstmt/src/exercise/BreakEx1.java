package exercise;

public class BreakEx1 {

	public static void main(String[] args) { // 주사위를 굴려 6이 날올때 까지 무한 반복한다.

		int Dice_Number = 0;

		while (true) {
			Dice_Number = (int) (Math.random() * 6) + 1; // 1<=Dice_Number<6.99999...
			System.out.println("주사위의 숫자: " + Dice_Number);
			if (Dice_Number == 6) // Dice_Number가 6이 나오면 멈춘다. 
				break;
		}
		System.out.println("프로그램 종료");
	}
}