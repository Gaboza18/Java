package exam01;

public class NestedForEx1 {

	public static void main(String[] args) { // 구구단(전체 출력)
	
		for (int i = 2; i < 10; i++) { // '열' 출력
			for (int j = 1; j < 10; j++) { // '행' 출력  
				System.out.printf("%d x %d = %d\n", i, j, (i * j));
				if (j % 9 == 0) {
					System.out.println("-----------");
				}
			}
		}
	}

}
