package Sec02;

public class BooleanExample {
	public static void main(String[] args) {
		boolean play = true; // true, false 만 가능
		//boolean play = false;  
		System.out.println("play= " + play);

		if (play) { // play 값이 참이면 출력
			System.out.println("play중 입니다.");
		} else // play 값이 거짓이면 출력
			System.out.println("play중이 아닙니다.");
	}
}