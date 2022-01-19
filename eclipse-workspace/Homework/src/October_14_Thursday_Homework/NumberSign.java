package October_14_Thursday_Homework;

public class NumberSign { // 2번문제: 정수 변수 num값에 따라 '양수','0','음수' 판단하는 문제

	public static void main(String[] args) {
		
		int number = 12; // 임의의 숫자 입력
		String numbersign = number > 0 ? "'양수' 입니다." : (number < 0 ? "'음수' 입니다." : "'0' 입니다.");
		
		// 알고리즘 순서 //
		
		/*
		 *  삼항 연산자: (조건식) ? 식1(true) : 식2(false)
		 *  임의의 숫자가 0보다 크면(조건식) 만족하면 -> 양수 입니다(true)값 출력
		 *  첫번째 조건식이 만족하지 않으면 음수,0(조건식)으로 이동한다.
		 *  임의의 숫자가 0보다 작으면(조건식) 만족하면 -> 음수 입니다(true)값 출력
		 *  임의의 숫자가 1,2번(조건식)을 모두 만족하지 않으면 -> 0 입니다(false)값 출력
		 */
	

		System.out.println("number = " + number); // 임의로 선정한 숫자 출력
		System.out.println("입력하신 number는 " + numbersign); // 삼항연산자의 조건에 따른 결과값(양수, 0, 음수) 출력
	}

}