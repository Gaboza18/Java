package arrays;

public class ObjectReferenceArray {

	public static void main(String[] args) {
		// ���ڿ� �ּ� 3���� ������ �迭 ����
		String[] strArr = new String[3];

		strArr[0] = new String("Java");
		strArr[1] = "Java";
		strArr[2] = "Java";

		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);

		}

		if (strArr[0] == strArr[1]) { // ������ ������ �����ּҰ� �ٸ���.
			System.out.println("���� �ּҰ� �����ϴ�.");
		} else {
			System.out.println("���� �ּҰ� �ٸ��ϴ�.");
		}
		if (strArr[1] == strArr[2]) { // ����� �����ּҰ� ����.
			System.out.println("���� �ּҰ� �����ϴ�.");
		} else {
			System.out.println("���� �ּҰ� �ٸ��ϴ�.");
		}

	}

}
