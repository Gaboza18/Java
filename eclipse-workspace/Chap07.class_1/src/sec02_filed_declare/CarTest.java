package sec02_filed_declare;

public class CarTest {

	public static void main(String[] args) {

		// ��ü�� ����
		Car myCar = new Car(); // �̸� ����� ���� Car Ŭ����

		// �ʵ尪 �б�
		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ�ӵ�: " + myCar.maxspeed);
		System.out.println("�ӵ�: " + myCar.speed);
		
		// �ʵ尪 ����
		myCar.speed = 60;
		System.out.println("����ӵ�: " + myCar.speed);
	}

}
