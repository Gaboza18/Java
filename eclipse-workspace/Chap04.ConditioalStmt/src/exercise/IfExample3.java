package exercise;

public class IfExample3 { // ���� �ֻ��� ����
	public static void main(String[] args) {
		
		int DiceAnyNumber = 0;
		DiceAnyNumber = (int) (Math.random() * 6) + 1; // (int)1.0<=Math.random()<(int)7.0

		if (DiceAnyNumber == 1) {
			System.out.println("�����ֻ��� ����� '1' �Դϴ�.");
		} else if (DiceAnyNumber == 2) {
			System.out.println("�����ֻ��� ����� '2' �Դϴ�.");
		} else if (DiceAnyNumber == 3) {
			System.out.println("�����ֻ��� ����� '3' �Դϴ�.");
		} else if (DiceAnyNumber == 4) {
			System.out.println("�����ֻ��� ����� '4' �Դϴ�.");
		} else if (DiceAnyNumber == 5) {
			System.out.println("�����ֻ��� ����� '5' �Դϴ�.");
		} else {
			System.out.println("�����ֻ��� ����� '6' �Դϴ�.");
		}
	}
}
