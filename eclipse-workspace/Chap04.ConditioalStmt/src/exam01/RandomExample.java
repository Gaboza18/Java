package exam01;

public class RandomExample {

	public static void main(String[] args) {

		int anyNum = 0;
		double number = Math.random(); // 출력: double 산출
		/*
		 * 1~10사이 임의의 정수 구하기
		 */
		anyNum = (int) (number * 10) + 1; // 1<=number<10.99999....
		System.out.printf("랜덤숫자는:%8.5f\n", number); // 매번 값이 랜덤으로 출력
		System.out.println("랜덤숫자는: " + anyNum);
		
		anyNum = (int) (number * 3) + 1; // 1<=number<3.99999....
		System.out.println("랜덤숫자는: " + anyNum);
	}

}
