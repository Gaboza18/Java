package sec06_user_defined_exception;

/*
 * ���� �������� ���� Ŭ���� 
 */

public class Account {
	private long balance; // ���� ���¿� ����ִ� �ܾ�

	public Account() {
	}

	public long getBalance() { // ���� �ܾ��� �˷��ִ� �޼ҵ�
		return balance;
	}

	public void deposit(int money) { // ���¿� �Ա��ϴ� �޼ҵ�
		balance += money;
	}

	// ���¿��� ����ϴ� �޼ҵ�, withdraw()�� ȣ���ϴ� ���α׷����� �ݵ�� ����ó���� ���־����(�ܾ�<��ݱݾ�)
	public void withdraw(int money) throws BalanceException {
		if (balance < money) { // �ܾ��� ������ ��� ���ܸ� �߻� ��Ų��
			throw new BalanceException("�ܾ׺���: -"+ (money - balance) + "��");
		}
		balance -= money; // �ܾ��� �������� ������ ���¿��� �ݾ��� ����
	}
}
