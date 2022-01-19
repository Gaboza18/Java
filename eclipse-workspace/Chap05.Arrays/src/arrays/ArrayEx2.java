package arrays;

public class ArrayEx2 {

	public static void main(String[] args) {

		double[] arr = new double[3];
		double[] arr1 = { 5.5, 5.7, 5.9, 4.2, 3.8 };

		arr[0] = 3.5;
		arr[1] = 4.5;
		arr[2] = 3.8;

		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("arr2[%d]=%f\n", i, arr1[i]);

		}

		// char 배열
		char[] charr = { 'p', 'r', 'o', 'g', 'r', 'a', 'm' };
		for (int i = 0; i < charr.length; i++) {
			System.out.println(charr[i]);
		}

		// char 배열과 문자열
		String str = new String(charr);
		System.out.println("str=" + str);
		char[] tmp = str.toCharArray();
		for (int i = 0; i < tmp.length; i++) {
			System.out.println(tmp[i]);
		}
	}
}