package exam02;

public class IncreaseDecrease { // ����������
	public static void main(String[] args) {
		int a = 5;
		System.out.println("a= " + (++a)); // a���� 1����

		a = 5;
		System.out.println("a= " + (a++)); // a���� ���� �����ϴ°� �ƴ϶� a�� �ʱⰪ�� ���� ���
		System.out.println("a= " + a); // �ʱⰪ ����� �����Ѵ�.

		int x = 100;
		int y = 200;
		int result = ++x + y; // x = 101 y = 200(�տ��� ���� ���)
		System.out.println("result= " + result);

		x = 100;
		y = 200;
		result = x++ + y; // x =101 y =200(�ڿ��� �������), ���� �������� ����
		System.out.println("result= " + result); // x =100(x���� ������������) y =200
		System.out.println("x= " + x); // x =101(x���� ������) y =200

		x = 10;
		y = 20;
		result = ++x + y++; // x���� ���� �����ǰ� y���� ��� �Ŀ� �����Ѵ�
		System.out.println("result= " + result); // x= 11 y =20
		System.out.println("x= " + x); // x���� �����Ǳ��� 1����
		System.out.println("y= " + y); // y���� �������� 1����
	}
}
