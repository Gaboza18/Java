package sec05_throws;

public class ThrowsEx { // ���� ���ѱ��

	public static void main(String[] args) {

		try {
			searchClass();
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
			// e.printStackTrace();
		}
	}

	// �� �޼ҵ忡�� ���ܸ� ó������ �ʰ� ȣ���� �޼ҵ�� ���ܸ� �ѱ��
	public static void searchClass() throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String2"); // ���� Ŭ������ �����Ͽ� ���ܹ߻���Ŵ
	}
}
