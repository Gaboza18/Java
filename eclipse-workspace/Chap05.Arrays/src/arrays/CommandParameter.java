package arrays;

public class CommandParameter {

	public static void main(String[] args) {

		System.out.println("Ŀ��� ���� Input: ");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		int number1 = Integer.parseInt(args[0]); // ���ڿ��� ���ڷ� ��ȯ
		int number2 = Integer.parseInt(args[1]); 
		System.out.println("number1 + number2= " + (number1 + number2));
	}

}
