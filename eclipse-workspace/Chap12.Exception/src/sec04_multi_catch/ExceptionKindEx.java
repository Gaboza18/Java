package sec04_multi_catch; // 컴파일 RunConfiguration -> arguments 입력해서 결과 출력!

/*
 *  command line argument 입력시 다중 예외처리
 */
public class ExceptionKindEx { // 다중 catch문

	public static void main(String[] args) {

		// command line 에서 2개의 숫자를 입력한다고 가정
		try {
			String data1 = args[0];
			String data2 = args[1];

			// 두개의 문자열을 숫자로 변환
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

			int result = value1 + value2;
			System.out.println("result= " + result);

		} catch (ArrayIndexOutOfBoundsException e) { // 배열 인덱스 값 범위 초과하거나 부족할때 예외
			System.out.println("실행 입력값의 개수가 부족합니다.");
			System.out.println("[실행방법]: java ExceptionKindEx num1, num2");

		} catch (NumberFormatException e) { // 문자입력했을때 예외
			System.out.println("숫자로 변환할수 없는 데이터입니다.");

		} finally {
			System.out.println("다시");
		}
	}

}
