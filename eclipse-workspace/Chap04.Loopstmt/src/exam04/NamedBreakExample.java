package exam04;

public class NamedBreakExample {

	public static void main(String[] args) {

		Loop1: for (int i = 2; i <= 9; i++) { 
			for (int j = 1; j <= 9; j++) {
				if (j == 5)
					break Loop1; // 5�ǹ���̸� Loop1�� �ߴ��Ѵ�
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
		}

	}

}
