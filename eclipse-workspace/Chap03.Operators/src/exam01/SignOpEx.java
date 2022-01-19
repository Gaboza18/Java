package exam01;
public class SignOpEx {

	public static void main(String[] args) {
		int a = -100;
		int result = +a; // 양수는 생략가능
		int result2 = -a;
		short s = 100; //
		// short s1 = -s; // short 타입의 값에 산술연산을 수행하면 int값으로 변환된다
		int s1 = -s;
		
		System.out.println("a= " + a);
		System.out.println("result= " + result);
		System.out.println("result2= " + result2);
		System.out.println("s= " + s);
		System.out.println("s1= " + s1);
	}

}
