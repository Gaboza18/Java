package exercise;

public class TwoDimArrayEx1 {

	public static void main(String[] args) { // 2���� �迭
		
		double[][] rainFals =  // �迭�� ����
			{
			{ 256.5, 654.2, 456.3, 76.9},
			{ 204.1, 610.4, 108.8, 66.6},
			{ 231.3, 752, 143.1, 142.3},
			{ 302.9, 692.6, 307.6, 98.7},
			{ 256.9, 1053.60, 225.5, 45.6},
			{ 256.5, 770.6, 363.3, 139.3},
			{ 264.3, 567.5, 231.2, 59.7},
			{ 215.9, 599.8, 293.1, 76.7},
			{ 109.1, 388, 247.3, 223.1}
			};
		
		
		double YearlyTotal = 0.0; //�Ⱓ ����
		
		System.out.printf("\t%3s\t%3s\t%3s\t%3s\t%5s\t%7s\n","��","����","����","�ܿ�","�Ⱓ�հ�","��հ�����");
		
		for (int i = 0; i < rainFals.length; i++) { // n�� ���(��)
			System.out.printf("%5d��", 2007 + i);
			YearlyTotal = 0; //

			for (int j = 0; j < rainFals[i].length; j++) { // �迭�� ���(��)
				YearlyTotal += rainFals[i][j];
				System.out.printf("%8.2f", rainFals[i][j]); // 8ĭ �Է� 2ĭ �ٿ��.

			}
			System.out.printf("%9.2f", YearlyTotal);
			System.out.printf("%9.2f", (YearlyTotal/rainFals[i].length));
			System.out.println("");
		}

	}

}
