package sec06_user_defined_exception;

/*
 * ����ó�� ���� ��, �ܾ��� ������ ��� �߻��ϴ� ���� ���� 
 */

public class BalanceException extends Exception {
	public BalanceException() { // �⺻ ������
	}

	/*
	 * �Է� �Ű�����: message: ���� �߻���, ��µǴ� �޽��� ����
	 */

	public BalanceException(String message) {
		super(message);
	}

}
