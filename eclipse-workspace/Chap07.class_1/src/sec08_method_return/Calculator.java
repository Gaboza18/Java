package sec08_method_return;

public class Calculator {

	int mul_result; // ���ϱ� ��갪 �����ϴ� ����

	int add(int a, int b) { // ���ϴ� �޼ҵ�
		int result = a + b;

		// return a + b; // �� ���� ��� ��밡��
		return result;
	}

	int substract(int a, int b) { // ���� �޼ҵ�
		int result2 = a - b;

		return result2;
	}

	void multiply(int a, int b) {
		mul_result = a * b;
	}

	// �Ű������� ������ �� �� �ִ� ���
	int sum(int... val) { // ...�� �迭�� �ؼ�
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