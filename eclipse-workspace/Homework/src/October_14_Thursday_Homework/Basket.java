package October_14_Thursday_Homework;

public class Basket { // 1������: ����� ��µ� �ʿ��� ������ ���� ���ϱ�

	public static void main(String[] args) {

		int apple = 123; // ����� ����
		int BasketInputSize = 10; // �ѻ��ڿ� ������ �ִ� ����� ������ �ִ� 10��
		int NeedBasket = ((apple / BasketInputSize) + ((apple % BasketInputSize) > 0 ? 1 : 0));
		
		// �˰��� ���� //
		
		/* 
		 * ���� ������: (���ǽ�) ? ��1(true) : ��2(false)
		 * ����� ����(apple)�� 10���� ������ ������ ����(BasketInputSize)�� ������ �ȴ�. 
		 * ������ 10���� ��� ���� ���(1~9�� ���) �Ǵ� (10���̸� ���)�� ������ �ȴ�.
		 * ���� �����ڸ� �̿�. 
		 * (apple / BasketInputSize) => 10���� ���� �������
		 * (apple % BasketInputSize) > 0 ? 1 : 0) => 10���� ��� ���� ����� �������� 0���� ũ�� 1�ڽ�(True), 0���� ������ 0�ڽ� 
		 * 10���� �ѹڽ� + ���� ��� �ѹڽ� ����Ͽ� ���� �ʿ��� ���ڸ� ���Ѵ�.
		 */
	
		System.out.println("����� ����: " + apple); // �Է��� ����� ����
		System.out.println("�ʿ��� �ٱ����� ����: " + NeedBasket); // 10���� ���� �ڽ� + ������� ���� �ڽ�

	}
}
