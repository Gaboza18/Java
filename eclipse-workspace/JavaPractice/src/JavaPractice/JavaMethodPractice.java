package JavaPractice;

import java.util.Scanner;
/*
public class JavaMethodPractice {
	public static void numbering() { // numbering Method ����
		Scanner sc = new Scanner(System.in);

		int number = 0;
		while (number < 10) {
			System.out.println(number);
			number++;

		}

	}

	public static void main(String[] args) {
	 	numbering(); // numbering Method ȣ��
	}
}
*/
/*
public class JavaMethodPractice {
	public static void numbering(int limit) { // int limit = n; ������ �ǹ�
		int number = 0;
		while (number < limit) {
			System.out.println(number);
			number++;

		}
	}

	public static void main(String[] args) {
		numbering(5); // int limit
	}
}
*/
/*
public class JavaMethodPractice {
	public static void numbering(int init, int limit) {
		int number = init;
		while (number < limit) {
			System.out.println(number);
			number++;
		}
	}

	public static void main(String[] args) {
		numbering(2, 5); //(int init, int limit)

	}
}
*/
/*
public class JavaMethodPractice {
	public static String numbering(int init, int limit) {
		int number = init;
		String output = ""; // ��������� ���ڵ��� output�̶�� ������ ��� ���ؼ� ������ �� ���� �־���.
		
		while(number<limit) { // ���ڸ� ȭ�鿡 ����ϴ� ��� ���� output�� ��Ҵ�.
			output +=number; //output = output+i;
			number++;
		}
		return output;
	}

	public static void main(String[] args) {
		String result = numbering(2, 5);
		System.out.println(result);

	}
}
*/

public class JavaMethodPractice {
	public static String[] getMembers() {
		String[] members = { "ȫ�浿, ȫ���, ȫ�漭" };
		return members;
	}

	public static void main(String[] args) {
		String[] members = getMembers();
	}
}