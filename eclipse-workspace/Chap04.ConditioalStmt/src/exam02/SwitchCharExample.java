package exam02;

public class SwitchCharExample {

	public static void main(String[] args) {
		/*
		 * Scanner input = new Scanner(System.in); System.out.print("회원을 확인할 등급을 입력하세요: ");
		 * char member_grade = input.nextInt(); // 회원의 등급: 'S,s' = 최우수 회원, 'A,a' = 우수 회원, 'B,b' = 일반 회원
		 */

		char member_grade = 'S'; // 회원의 등급: 'S,s' = 최우수 회원, 'A,a' = 우수 회원, 'B,b' = 일반 회원

		switch (member_grade) {
		case 'S':
		case 's':
			System.out.println("최우수 회원입니다.");
			break;

		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;

		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;

		default:
			System.out.println("손님 입니다.");

		}

	}

}
