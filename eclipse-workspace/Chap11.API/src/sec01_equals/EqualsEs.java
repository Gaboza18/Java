package sec01_equals;

public class EqualsEs {

	/*
	 * equals() - �� ��ü�� ������ ������ ��
	 */
	public static void main(String[] args) {

		Value v1 = new Value(10);
		Value v2 = new Value(10);

		if (v1.equals(v2)) { // �� ��ü�� �ּҸ� ���Ѵ�
			System.out.println("v1�� v2�� �����ϴ�.");
		} else {
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
		}

		v2 = v1; // ���� �ּҸ� ����Ų��.

		if (v1.equals(v2)) {
			System.out.println("v1�� v2�� �����ϴ�.");
		} else {
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
		}

	}

}

class Value {
	int value;

	public Value(int value) {
		super();
		this.value = value;
	}

}
