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

		int number = 0; // number의 값이 10보다 작을경우 true, 크다면 false가 된다. 

		while (number < 10) {
			System.out.println("Coding Everyday " + number);
			number++; // number = number+1;
		}
	}

}
*/
/*
public class JavaWhilePractice { // break문 알고리즘
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		for (int number = 0; number < 10; number++) { // 0부터 9까지 출력한다.
			if (number == 5) // number 값이 5가될때
				break; // 멈춘다 * if문이 한줄일경우 한줄로 써도 무방하다.
			System.out.println("Coding Everyday" + number);
		}
	}
}
*/
/*
public class JavaWhilePractice { //continue문
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		for (int number = 0; number < 10; number++) {
			if (number == 5)
				continue; // 5가 되면 멈추다가 다시 시작한다
			System.out.println("Coding Everyday " + number);
		}
	}
}
*/
public class JavaWhilePractice { //for문 중첩
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		for (int number = 0; number < 10; number++) {
			for (int number2 = 0; number2 < 10; number2++) {
				System.out.println(number+" "+number2);
			}
		}
	}
}