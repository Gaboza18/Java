package sec04_multi_catch; // 컴파일 RunConfiguration -> arguments 입력해서 결과 출력!

/*
 *  command line argument 입력시 다중 예외처리
 */
public class MultiCatchException { // 2개이상의 예외 하나로 출력

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

		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("실행 입력값의 개수가 부족하거나 숫자로 변환할수 없습니다.");
			System.out.println("[실행방법]: java ExceptionKindEx num1, num2");

		} catch (Exception e) { // 넓은 범위의 예외 처리를 뒤에 배치한다.(1,2번 catch문 이외의 예외판단한다))
			System.out.println("실행에 문제가 발생했습니다.");

		} finally {
			System.out.println("다시");
		}
	}

}
