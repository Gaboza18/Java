package CellPhone_inheritance;

public class DmbCellPhoneExample {
	public static void main(String[] args) {

		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10); // DmbCellPhone ��ü ����

		System.out.println("��: " + dmbCellPhone.model); // CellPhone ���� ���� ��ӹ��� �ʵ�
		System.out.println("����: " + dmbCellPhone.color); // CellPhone ���� ���� ��ӹ��� �ʵ�
		System.out.println("ä��: " + dmbCellPhone.channel); // DmbCellPhone �ʵ�
		
		dmbCellPhone.powerOn(); // ������ �մϴ�.
		dmbCellPhone.bell(); // ���� �︳�ϴ�.
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.reciveVoice("�� ȫ��� �Դϴ�.");
		dmbCellPhone.sendVoice("�� �ݰ����ϴ� ȫ�浿 �Դϴ�.");
		dmbCellPhone.handUp(); // ��ȭ �����ϴ�.
	}

}
