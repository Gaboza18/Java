package sec01_equals;

public class EqualsEs {

	/*
	 * equals() - 두 객체의 내용이 같은지 비교
	 */
	public static void main(String[] args) {

		Value v1 = new Value(10);
		Value v2 = new Value(10);

		if (v1.equals(v2)) { // 두 객체의 주소를 비교한다
			System.out.println("v1과 v2는 같습니다.");
		} else {
			System.out.println("v1과 v2는 다릅니다.");
		}

		v2 = v1; // 같은 주소를 가리킨다.

		if (v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		} else {
			System.out.println("v1과 v2는 다릅니다.");
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
