package exam02;

public class IncreaseDecrease { // 증감연산자
	public static void main(String[] args) {
		int a = 5;
		System.out.println("a= " + (++a)); // a값이 1증가

		a = 5;
		System.out.println("a= " + (a++)); // a값을 먼저 증가하는게 아니라 a의 초기값을 먼저 출력
		System.out.println("a= " + a); // 초기값 출력후 증가한다.

		int x = 100;
		int y = 200;
		int result = ++x + y; // x = 101 y = 200(앞에서 먼저 계산)
		System.out.println("result= " + result);

		x = 100;
		y = 200;
		result = x++ + y; // x =101 y =200(뒤에서 먼저계산), 값이 참조된후 증가
		System.out.println("result= " + result); // x =100(x값이 참조되지않음) y =200
		System.out.println("x= " + x); // x =101(x값이 참조됨) y =200

		x = 10;
		y = 20;
		result = ++x + y++; // x값이 먼저 증가되고 y값은 계산 후에 증가한다
		System.out.println("result= " + result); // x= 11 y =20
		System.out.println("x= " + x); // x값은 참조되기전 1증감
		System.out.println("y= " + y); // y값은 참조된후 1증감
	}
}
