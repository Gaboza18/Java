package sec08_method_return;

public class Calculator {

	int mul_result; // 곱하기 계산값 저장하는 변수

	int add(int a, int b) { // 더하는 메소드
		int result = a + b;

		// return a + b; // 두 가지 모두 사용가능
		return result;
	}

	int substract(int a, int b) { // 빼는 메소드
		int result2 = a - b;

		return result2;
	}

	void multiply(int a, int b) {
		mul_result = a * b;
	}

	// 매개변수의 갯수를 알 수 있는 경우
	int sum(int... val) { // ...은 배열로 해석
		int result = 0;

		for (int i = 0; i < val.length; i++) {
			result += val[i];
		}

		return result;
	}

	void dispResult() {
		System.out.println(mul_result);
	}
}