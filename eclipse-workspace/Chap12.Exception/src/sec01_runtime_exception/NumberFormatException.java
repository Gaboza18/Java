package sec01_runtime_exception;

public class NumberFormatException {

	public static void main(String[] args) {

		// ���ڿ��� ���ڷ� ��ȯ�Ϸ��� ��
		String data1 = "123"; // ���ڿ�
		String data2 = "a123"; // ���ڿ�

		int value = Integer.parseInt(data1); // ���ڿ� -> ����
		int value2 = Integer.parseInt(data2); // data2 ��: ���ڿ� ���ڰ� �������� ��ȯ�Ұ�
	}

}
