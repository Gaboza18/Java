package October_14_Thursday_Homework;

public class Alphabet {
	public static void main(String args[]) { // 3번: 문자형 변수 ch의 내용이 영문 소문자, 대문자 인지 숫자 인지 판별
		
		char ch = 'F'; // 문자형 변수 임의의 ch값 입력(대문자, 소문자, 숫자)
		String result = (('a' <= ch && ch <= 'z') ? "'소문자' 입니다." : ('A' <= ch && ch <= 'Z') ? "'대문자' 입니다." : "'숫자'입니다.");
		
		// 알고리즘 순서 //
		
		/* 
		 * 삼항 연산자: (조건식) ? 식1(true) : 식2(false)
		 * ('a' <= ch && ch <= 'z') => ch값이 and 연산자를 사용하여 a~z값을 입력하면 True(식1) '소문자 입니다' 출력 
		 * ('A' <= ch && ch <= 'Z') => ch값이 and 연산자를 사용하여 A~Z값을 입력하면 True(식1) '대문자 입니다' 출력
		 * 위 2개의 조건식이 모두 만족하지 않으면 False(식2) '숫자 입니다' 출력
		 */
		
		System.out.println("입력하신 ch: " + ch); // 임의의 ch값 출력(대문자, 소문자, 숫자)
		System.out.println("ch는 " + result); // 삼항연산자의 조건에 따른 결과값(대문자, 소문자, 숫자) 출력

	}
}
