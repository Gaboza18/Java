package exam01;

public class RandomExample {

	public static void main(String[] args) {

		int anyNum = 0;
		double number = Math.random(); // ���: double ����
		/*
		 * 1~10���� ������ ���� ���ϱ�
		 */
		anyNum = (int) (number * 10) + 1; // 1<=number<10.99999....
		System.out.printf("�������ڴ�:%8.5f\n", number); // �Ź� ���� �������� ���
		System.out.println("�������ڴ�: " + anyNum);
		
		anyNum = (int) (number * 3) + 1; // 1<=number<3.99999....
		System.out.println("�������ڴ�: " + anyNum);
	}

}
