package exam04;

public class ContinueExample { //continue문

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			if (i % 3 == 0) // 1부터 10중 3의 배수면 다음으로 넘어간다
				continue; 
			{
				System.out.println(i); // 3의배수를 제외하고 출력한다. 
			}
		}
	}

}
