package exam01;

public class NestedForEx1 {

	public static void main(String[] args) { // ������(��ü ���)
	
		for (int i = 2; i < 10; i++) { // '��' ���
			for (int j = 1; j < 10; j++) { // '��' ���  
				System.out.printf("%d x %d = %d\n", i, j, (i * j));
				if (j % 9 == 0) {
					System.out.println("-----------");
				}
			}
		}
	}

}
