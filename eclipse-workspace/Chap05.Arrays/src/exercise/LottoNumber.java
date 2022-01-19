package exercise;

public class LottoNumber {

	public static void main(String[] args) {
		
		// 45개의 정수를 저장할 배열변수 선언
		int[] lottoNumber = new int[45];

		// lotto 배열 초기화
		System.out.print("초기 데이터: ");
		for (int number = 0; number < lottoNumber.length; number++) { // 배열 인덱스는 0~44
			lottoNumber[number] = number + 1; // 1번부터 시작
			System.out.printf("%d ", lottoNumber[number]); // 1부터 45까지 출력한다.
		}
		System.out.println("");
		
		int index = 0; // 배열의 임의 의 위치 저장
		int temp = 0; // 첫번째 값을 임시로 저장할 변수

		for (int k = 0; k < 100; k++) { // 배열의 임의의 숫자와 첫번째 요소의 숫자를 서로 바꿔준다.
			index = (int) (Math.random() * 45); // 0~45까지의 범위 값을 랜덤으로 가져온다.
			temp = lottoNumber[0]; // 첫번째 요소의 값을 임시 저장소에 저장
			lottoNumber[0] = lottoNumber[index]; // 임의의 위치의 값을 첫번째 요소에 저장
			lottoNumber[index] = temp; // 첫번째 요소의 값을 임의의 위치에 저장
		}

		// 섞은 후의 데이터 출력
		System.out.print("섞은 후의 데이터: ");
		for (int item : lottoNumber) { // 향상된 for문
			System.out.printf("%d ", item);
		}
		System.out.println();
		System.out.println();
		System.out.printf("이번주 로또번호 입니다.\n");
		// 배열에서 처음 6개의 숫자를 출력
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d ", lottoNumber[i]);
		}

	}

}
