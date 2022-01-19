package JavaPractice;

/*
public class JavaArrayPractice {
	public static void main(String[] args) {

		String[] classGroup = { "최진혁", "최유빈", "한이람", "이고잉" };

		System.out.println(classGroup[0]);
		System.out.println(classGroup[1]);
		System.out.println(classGroup[2]);
		System.out.println(classGroup[3]);

	}

}
*/

/*
public class JavaArrayPractice {
	public static void main(String[] args) {

		String[] classGroup = new String[4]; // new String[n] = 새로운 배열 선언, n개로 구성 

		classGroup[0] = "최진혁"; // 0번째 index값에 최진혁을 넣겠다.
		System.out.println(classGroup.length); // length = 배열의 최대 길이 = 4

		classGroup[1] = "최유빈";
		System.out.println(classGroup.length);

		classGroup[2] = "한이람";
		System.out.println(classGroup.length);

		classGroup[3] = "이고잉";
		System.out.println(classGroup.length);

	}
}
*/

/*
public class JavaArrayPractice {
	public static void main(String[] args) {

		String[] Members = { "최진혁", "최유빈", "한이람" }; // 배열 선언 및 값 입력
		
		for (int i = 0; i < Members.length; i++) { // Members.length = 길이가 3
			String Member = Members[i];
			System.out.println(Member + "이 상담을 받았습니다.");
			
		}
	}
}
*/

/*
public class JavaArrayPractice { // for-each 배열 알고리즘
	public static void main(String[] args) {
		
		String[] members = { "최진혁", "최유빈", "한이람" };
		for (String e : members) { // members의 값을 변수 e에 담아서 구간 안으로 전달
			System.out.println(e + "이 상담을 받았습니다.");
			
		}
	}
}
*/

/*
public class JavaArrayPractice { // 배열 arr에 담긴 모든 값을 더하는 프로그램
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 }; // 배열값 선언
		int sum = 0; // 배열의 총합 변수 sum 선언

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("배열의 총합은= " + sum);
	}
}
*/