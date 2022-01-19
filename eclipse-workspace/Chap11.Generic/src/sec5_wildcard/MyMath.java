package sec5_wildcard;

public class MyMath {

	// ���ڷ� �Էµ� �Ű������� ������ �����ϴ� �޼ҵ�
	public static <T extends Number> double add(T first, T second) {

		return first.doubleValue() + second.doubleValue(); // ������� double�� ��ȯ ���ִ� �޼ҵ�
	}

	public static void main(String[] args) {
		System.out.println(add(53, 65)); // int -> Integer
		System.out.println(add(5.3f, 6.5f)); // float -> Float

		// �Ű������� Number���� ��ӹ��� Ÿ���� �ƴϹǷ� ��� �Ұ���
		// System.out.println(add("java", "programming"));
	}

}
