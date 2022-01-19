import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int Number = in.nextInt();

		int[] arr = new int[Number];

		for (int i = 0; i < Number; i++) {
			arr[i] = in.nextInt();
		}

		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[Number - 1]);

	}

}