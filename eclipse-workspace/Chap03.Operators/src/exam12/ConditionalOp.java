package exam12;

public class ConditionalOp { // ���� ������
	public static void main(String[] args) {
		
		int number1;
		int result;

		number1 = 10;
		result = number1 >= 0 ? number1 : -number1; // � ���� ���밪�� ���ϴ� ����
		System.out.println("x ���� ���밪 �Դϴ�: " + number1);
		System.out.println(" ");

		int score = 15;
		
		char grade = score >= 90 ? 'A' : (score >= 80 ? 'B' : 'c'); // �Է��� ���� ����� ���ϴ� ����
		System.out.println("����� ���: " + grade);
	}
}
