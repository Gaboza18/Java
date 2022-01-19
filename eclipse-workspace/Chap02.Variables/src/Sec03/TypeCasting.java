package Sec03;

/*
 * 타임 캐스팅:
 * 서로 다른 타입 간의 타입을 변환하여 저장하는 기능
 */
public class TypeCasting {

	public static void main(String[] args) {
		int intvalue = 65;

		/*
		 * int형 에서 char형 으로 형변환
		 */

		char chvalue = (char) intvalue; // 65 -(char)-> chvalue 변환
		System.out.println("intvalue= " + intvalue); // intvalue = 65
		System.out.println("chvalue= " + chvalue); // 65 -> A (아스키 코드 값)

		/*
		 * long형 에서 int형 으로 형변환
		 */

		long longvalue = 3300;
		intvalue = (int) longvalue;
		System.out.println("longvalue= " + longvalue);
		System.out.println("intvalue= " + intvalue);

		/*
		 * double형 에서 int형 으로 형변환
		 */

		double doubleValue = 3.14;
		intvalue = (int) doubleValue;
		System.out.println("doubleValue= " + doubleValue);
		System.out.println("intvalue= " + intvalue); // 정수부분만 출력
	}

}