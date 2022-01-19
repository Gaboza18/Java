package exam_print;

public class PrintFormat {

	public static void main(String[] args) {

		int age = 27;
		int year = 2021;

		System.out.println("나이: " + age + " 출생년도: " + year + " 입니다."); // println문은 내용을 출력한후 다음행으로 이동하여 대기
		System.out.printf("나이: %d 출생년도: %d 입니다.\n", age, year); // printf문은 '\n'을 사용하여 다음행으로 내려준다.
		System.out.print("나이: " + age + " 출생년도: " + year+" 입니다.");
	}

}
