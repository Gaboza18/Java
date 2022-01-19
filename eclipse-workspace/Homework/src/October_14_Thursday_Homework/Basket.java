package October_14_Thursday_Homework;

public class Basket { // 1번문제: 사과를 담는데 필요한 상자의 개수 구하기

	public static void main(String[] args) {

		int apple = 123; // 사과의 개수
		int BasketInputSize = 10; // 한상자에 담을수 있는 사과의 개수는 최대 10개
		int NeedBasket = ((apple / BasketInputSize) + ((apple % BasketInputSize) > 0 ? 1 : 0));
		
		// 알고리즘 순서 //
		
		/* 
		 * 삼항 연산자: (조건식) ? 식1(true) : 식2(false)
		 * 사과의 개수(apple)를 10으로 나누면 상자의 개수(BasketInputSize)가 나오게 된다. 
		 * 하지만 10개씩 담고 남은 사과(1~9개 사과) 또는 (10개미만 사과)가 나오게 된다.
		 * 삼항 연산자를 이용. 
		 * (apple / BasketInputSize) => 10개씩 담은 사과상자
		 * (apple % BasketInputSize) > 0 ? 1 : 0) => 10개씩 담고 남은 사과의 나머지가 0보다 크면 1박스(True), 0보다 작으면 0박스 
		 * 10개씩 한박스 + 남은 사과 한박스 계산하여 최종 필요한 상자를 구한다.
		 */
	
		System.out.println("사과의 개수: " + apple); // 입력한 사과의 개수
		System.out.println("필요한 바구니의 개수: " + NeedBasket); // 10개씩 담은 박스 + 남은사과 담은 박스

	}
}
