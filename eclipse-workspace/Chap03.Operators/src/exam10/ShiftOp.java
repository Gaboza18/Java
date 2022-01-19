package exam10;

public class ShiftOp { // ����Ʈ ������(<<, >>, >>>)

	public static void main(String[] args) {

		int dec = 12; // �����(+)
		System.out.println("dec=" + dec + "    (" + toBinary(dec) + ")");
		System.out.println("dec<<1=" + (dec << 1) + " (" + toBinary(dec << 1) + ")"); // dec�� ���� �ѹ� �������� shift
		System.out.println("dec<<2=" + (dec << 2) + " (" + toBinary(dec << 2) + ")"); // dec�� ���� �ι� �������� shift
		System.out.println("dec>>1=" + (dec >> 1) + " (" + toBinary(dec << 1) + ")"); // dec�� ���� �ѹ� ���������� shift
		System.out.println("dec>>2=" + (dec >> 2) + " (" + toBinary(dec << 2) + ")"); // dec�� ���� �ι� ���������� shift
		System.out.println("");

		dec = -12; // ������(-)
		System.out.println("dec=" + dec + "    (" + toBinary(dec) + ")");
		System.out.println("dec<<1=" + (dec << 1) + " (" + toBinary(dec << 1) + ")"); // dec�� ���� �ѹ� �������� shift
		System.out.println("dec<<2=" + (dec << 2) + " (" + toBinary(dec << 2) + ")"); // dec�� ���� �ι� �������� shift
		System.out.println("dec>>1=" + (dec >> 1) + " (" + toBinary(dec << 1) + ")"); // dec�� ���� �ѹ� ���������� shift
		System.out.println("dec>>2=" + (dec >> 2) + " (" + toBinary(dec << 2) + ")"); // dec�� ���� �ι� ���������� shift
	}

	public static String toBinary(int value) { // 2���� ���ϴ� �޼ҵ�
		String str = Integer.toBinaryString(value); // value ������ �������� ���ڿ��� ��ȯ

		while (str.length() < 32) { // string ���� n�ڸ��� ���������� while��
			str = "0" + str; // n�ڸ��� �ɶ����� 0�� ������Ų��.
		}
		return str;
	}
}
