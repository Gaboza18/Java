package exercise;

public class OperatorEx1 {

	public static void main(String[] args) {
		
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a+b); // 형변환 풀이  - byte c = 30; 

		char ch = 'A';
		ch = 'A' + 2; // 형변환 풀이 - (char)(ch+2);

		float f = 3 / 2f;
		long l = 3000 * 3000 * 3000L;

		float f2 = 0.1f;
		double d = 0.1;
		double d1 = (float) d;

		boolean result = d1 == f2; // boolean result = ((float)d) == f2;
		System.out.println("c= " + c);
		System.out.println("ch= " + ch);
		System.out.println("f= " + f);
		System.out.println("l= " + l);
		System.out.println("result= " + result);

	}

}