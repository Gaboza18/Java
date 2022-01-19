package sec06_user_defined_exception;

public class AccountTest {

	public static void main(String[] args) {

		Account MyAccount = new Account(); // ���»���

		MyAccount.deposit(10000); // �����Ա�
		System.out.println("�����ܾ�: " + MyAccount.getBalance() + "��");

		try {
			MyAccount.withdraw(8000); // �������
			System.out.println("��� �� �����ܾ�: " + MyAccount.getBalance() + "��");
		} catch (BalanceException e) {
			System.out.println(e.getMessage()); // ����ó�� �޼��� ���
			e.printStackTrace();
		}
	}

}