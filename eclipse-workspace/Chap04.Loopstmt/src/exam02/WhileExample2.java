package exam02;

public class WhileExample2 {

	public static void main(String[] args) {
		int i = 10;

		while (i >= 0) {
			// i = 10; // 조건에 사용하는 변수를 블럭내에서 초기화 금지
			System.out.println(i--);
		}

	}

}
