package exam04;

public class ContinueExample { //continue��

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			if (i % 3 == 0) // 1���� 10�� 3�� ����� �������� �Ѿ��
				continue; 
			{
				System.out.println(i); // 3�ǹ���� �����ϰ� ����Ѵ�. 
			}
		}
	}

}
