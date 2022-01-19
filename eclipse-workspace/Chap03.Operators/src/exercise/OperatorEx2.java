package exercise;

public class OperatorEx2 {
	public static void main(String[] args) {

		int fahrenheit = 100;
		float celsius = 5f / 9 * (fahrenheit - 32);
		celsius = (int) (celsius * 1000) / 1000f; // 소수점 3째자리까지 구하기
		
		System.out.println("화씨: " + fahrenheit);
		System.out.println("섭씨: " + celsius);
	}
}