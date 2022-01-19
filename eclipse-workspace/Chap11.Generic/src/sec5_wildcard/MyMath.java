package sec5_wildcard;

public class MyMath {

	// 숫자로 입력된 매개변수의 덧셈을 수행하는 메소드
	public static <T extends Number> double add(T first, T second) {

		return first.doubleValue() + second.doubleValue(); // 결과값을 double로 변환 해주는 메소드
	}

	public static void main(String[] args) {
		System.out.println(add(53, 65)); // int -> Integer
		System.out.println(add(5.3f, 6.5f)); // float -> Float

		// 매개변수가 Number에서 상속받은 타입이 아니므로 사용 불가능
		// System.out.println(add("java", "programming"));
	}

}
