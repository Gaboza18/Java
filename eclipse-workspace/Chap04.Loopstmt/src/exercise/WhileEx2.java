package exercise;

public class WhileEx2 { // ��ø while ��������(1~10���� �߿��� 4*x+5* = 60 (x,y)��)

	public static void main(String[] args) {

		int x = 1; // x���� ����

		while (x <= 10) { // 1~10����
			int y = 1;

			while (y <= 10) { // 1~10����
				if (4 * x + 5 * y == 60) {
					System.out.printf("(%d,%d)\n", x, y);
				}
				// System.out.printf("4*%d + 5*%d = %d\n", x, y, 4 * x + 5 * y); 
				y++; // x���� 10�� �ɶ����� ����
			}
			x++; // y���� 10�� �ɶ����� ����
		}

	}
}
