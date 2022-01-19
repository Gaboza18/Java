package sec08_method_return;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator c1 = new Calculator(); // 객체생성
		Calculator c2 = new Calculator();

		int total = c1.add(7, 14); // 호출 결과값을 변수에 저장한다.
		int total2 = c2.substract(9, 5);

		System.out.println("덧셈 결과: " + total);
		System.out.println("뺄셈 결과: " + total2);

		// 변수를 직접 선언하고 결과값 출력
		int a1 = 25;
		int b1 = 41;
		total = c1.add(a1, b1);
		System.out.println("덧셈 결과: " + total);

		/* 확인 필요
		 * 
		 * return 값이 없는 경우 cl.multiply(7,5);
		 * 
		 * cl.dispResult();
		 */

		// 매개변수의 갯수를 알수 없는 경우(같은 타입의 매개변수)의메소드 호출

		total = c1.sum(2, 3, 5);
		System.out.println("total= " + total);
		
		total = c1.sum(1, 3, 5, 7, 9);
		System.out.println("total= " + total);
	}
		//if문에서 return문을 사용할 경우 모든 경우에 return을 하도록 할것
		/*
		 * 
		 */
		int max(int a, int b) {
			if(a>b) {
				return a;
			}else
				return b;
			
		}
	}