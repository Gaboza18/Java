import java.util.Scanner; // 외부에서 입력하기 위해 Scanner import 

public class KeyboardInput {

	public static void main(String[] args) { // 키보드를 통해서 프로그램에 데이터를 입력하는 기능
		Scanner input = new Scanner(System.in); // 표준입력을 사용하여 키보드 입력

		System.out.print("정수를 입력하세요: ");
		int number = input.nextInt(); // 키보드 에서 정수를 입력받는다.
		System.out.println("입력하신 정수는: " + number);
		System.out.println("");

		System.out.print("문자를 입력하세요: ");
		String str = input.next();
		System.out.println("입력하신 문자는: " + str);
		System.out.println("");
	}

}
