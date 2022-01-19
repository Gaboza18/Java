package exam12;

public class ConditionalOp { // 삼항 연산자
	public static void main(String[] args) {
		
		int number1;
		int result;

		number1 = 10;
		result = number1 >= 0 ? number1 : -number1; // 어떤 수의 절대값을 구하는 수식
		System.out.println("x 값의 절대값 입니다: " + number1);
		System.out.println(" ");

		int score = 15;
		
		char grade = score >= 90 ? 'A' : (score >= 80 ? 'B' : 'c'); // 입력한 값의 등급을 구하는 수식
		System.out.println("당신의 등급: " + grade);
	}
}
