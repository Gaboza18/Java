package sec08_method_return;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator c1 = new Calculator(); // ��ü����
		Calculator c2 = new Calculator();

		int total = c1.add(7, 14); // ȣ�� ������� ������ �����Ѵ�.
		int total2 = c2.substract(9, 5);

		System.out.println("���� ���: " + total);
		System.out.println("���� ���: " + total2);

		// ������ ���� �����ϰ� ����� ���
		int a1 = 25;
		int b1 = 41;
		total = c1.add(a1, b1);
		System.out.println("���� ���: " + total);

		/* Ȯ�� �ʿ�
		 * 
		 * return ���� ���� ��� cl.multiply(7,5);
		 * 
		 * cl.dispResult();
		 */

		// �Ű������� ������ �˼� ���� ���(���� Ÿ���� �Ű�����)�Ǹ޼ҵ� ȣ��

		total = c1.sum(2, 3, 5);
		System.out.println("total= " + total);
		
		total = c1.sum(1, 3, 5, 7, 9);
		System.out.println("total= " + total);
	}
		//if������ return���� ����� ��� ��� ��쿡 return�� �ϵ��� �Ұ�
		/*
		 * 
		 */
		int max(int a, int b) {
			if(a>b) {
				return a;
			}else
				return b;
			
		}
	}