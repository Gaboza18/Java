package Sec03;

/*
 * Ÿ�� ĳ����:
 * ���� �ٸ� Ÿ�� ���� Ÿ���� ��ȯ�Ͽ� �����ϴ� ���
 */
public class TypeCasting {

	public static void main(String[] args) {
		int intvalue = 65;

		/*
		 * int�� ���� char�� ���� ����ȯ
		 */

		char chvalue = (char) intvalue; // 65 -(char)-> chvalue ��ȯ
		System.out.println("intvalue= " + intvalue); // intvalue = 65
		System.out.println("chvalue= " + chvalue); // 65 -> A (�ƽ�Ű �ڵ� ��)

		/*
		 * long�� ���� int�� ���� ����ȯ
		 */

		long longvalue = 3300;
		intvalue = (int) longvalue;
		System.out.println("longvalue= " + longvalue);
		System.out.println("intvalue= " + intvalue);

		/*
		 * double�� ���� int�� ���� ����ȯ
		 */

		double doubleValue = 3.14;
		intvalue = (int) doubleValue;
		System.out.println("doubleValue= " + doubleValue);
		System.out.println("intvalue= " + intvalue); // �����κи� ���
	}

}