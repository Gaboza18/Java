package exercise;

public class forEx2 { // 3,6,9 게임

	public static void main(String[] args) {

		for (int i = 1; i <= 110; i++) {
			if (i % 15 == 0) { // 3과 5의배수 일경우: 3과 5의배수중 하나만 만족하면 첫번째 조건이 성립하기 때문에 위에서 수행할수 있게한다.(좁은범위>넓은범위)
				System.out.print("짝짝짝,");
			} else if (i % 3 == 0) {
				System.out.print("짝,");
			} else if (i % 5 == 0) {
				System.out.print("짝짝,");
			} else {
				System.out.print(i+",");
			}
			if (i % 10 == 0) { // i값이 10개 이상이면 줄을 바꾼다.
				System.out.println();
			}
		}

	}

}