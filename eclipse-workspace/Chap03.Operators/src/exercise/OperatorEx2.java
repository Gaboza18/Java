package exercise;

public class OperatorEx2 {
	public static void main(String[] args) {

		int fahrenheit = 100;
		float celsius = 5f / 9 * (fahrenheit - 32);
		celsius = (int) (celsius * 1000) / 1000f; // �Ҽ��� 3°�ڸ����� ���ϱ�
		
		System.out.println("ȭ��: " + fahrenheit);
		System.out.println("����: " + celsius);
	}
}