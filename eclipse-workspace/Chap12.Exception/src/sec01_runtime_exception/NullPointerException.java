package sec01_runtime_exception;

public class NullPointerException {

	public static void main(String[] args) {

		String data = null; // ����Ұ� �Ҵ�Ǿ� ���� ����
		// �ذ��� //
		// data = new String("java"); // ����� �Ҵ�
		System.out.println(data.toString()); // ��ü�� �ּҰ� �Ҵ���� ����

	}

}
