package exercise;

public class BreakEx1 {

	public static void main(String[] args) { // �ֻ����� ���� 6�� ���ö� ���� ���� �ݺ��Ѵ�.

		int Dice_Number = 0;

		while (true) {
			Dice_Number = (int) (Math.random() * 6) + 1; // 1<=Dice_Number<6.99999...
			System.out.println("�ֻ����� ����: " + Dice_Number);
			if (Dice_Number == 6) // Dice_Number�� 6�� ������ �����. 
				break;
		}
		System.out.println("���α׷� ����");
	}
}