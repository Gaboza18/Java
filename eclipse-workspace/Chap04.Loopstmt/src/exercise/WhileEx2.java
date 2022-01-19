package exercise;

public class WhileEx2 { // 중첩 while 연습문제(1~10까지 중에서 4*x+5* = 60 (x,y)값)

	public static void main(String[] args) {

		int x = 1; // x변수 선언

		while (x <= 10) { // 1~10사이
			int y = 1;

			while (y <= 10) { // 1~10사이
				if (4 * x + 5 * y == 60) {
					System.out.printf("(%d,%d)\n", x, y);
				}
				// System.out.printf("4*%d + 5*%d = %d\n", x, y, 4 * x + 5 * y); 
				y++; // x값이 10이 될때가지 증가
			}
			x++; // y값이 10이 될때까지 증가
		}

	}
}
