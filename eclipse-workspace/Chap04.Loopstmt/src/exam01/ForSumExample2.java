package exam01;

public class ForSumExample2 {
	public static void main(String[] args) {

		int sum = 0; // �հ踦 ������ ����
		for (int number = 1; number <= 10; number++) {
			sum += number; // ��������� �հ迡 number���� ���Ѵ�(sum = sum + number)
		}
		System.out.println("1~10������ �հ�: " + sum);
	}

}
