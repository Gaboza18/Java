package JavaPractice;
import java.util.Scanner;

/*
public class JavaWhilePractice {
	public static void maia(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Coding Everyday");
		}
	}
}
*/
/*
public class JavaWhilePractice {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int number = 0; // number�� ���� 10���� ������� true, ũ�ٸ� false�� �ȴ�. 

		while (number < 10) {
			System.out.println("Coding Everyday " + number);
			number++; // number = number+1;
		}
	}

}
*/
/*
public class JavaWhilePractice { // break�� �˰���
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		for (int number = 0; number < 10; number++) { // 0���� 9���� ����Ѵ�.
			if (number == 5) // number ���� 5���ɶ�
				break; // ����� * if���� �����ϰ�� ���ٷ� �ᵵ �����ϴ�.
			System.out.println("Coding Everyday" + number);
		}
	}
}
*/
/*
public class JavaWhilePractice { //continue��
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		for (int number = 0; number < 10; number++) {
			if (number == 5)
				continue; // 5�� �Ǹ� ���ߴٰ� �ٽ� �����Ѵ�
			System.out.println("Coding Everyday " + number);
		}
	}
}
*/
public class JavaWhilePractice { //for�� ��ø
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		for (int number = 0; number < 10; number++) {
			for (int number2 = 0; number2 < 10; number2++) {
				System.out.println(number+" "+number2);
			}
		}
	}
}