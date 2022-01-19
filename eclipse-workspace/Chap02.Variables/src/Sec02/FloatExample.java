package Sec02;

public class FloatExample {

	public static void main(String[] args) {

		double d1 = 3.14;
		float f1 = 3.14f; // double에는 잘 사용하지 않고 float에는 리터널 뒤에 f 표시
		double d2 = 0.1234567890123456789; // 정밀한 숫자 표현, 보통은 double 많이사용
		float f2 = 0.1234567890123456789f; // 덜 정밀한 숫자 표현
		int var1 = 3000000;
		double var2 = 3e6; // 3x10^6 , 지수: 3 가수: 10^6 표현가능
		double var3 = 3e-3; // 3x10^-3 지수: 3 가수: 10^-3

		System.out.println("double d1 = " + d1);
		System.out.println("float f1 = " + f1);
		System.out.println("double d2 = " + d2);
		System.out.println("float f2 = " + f2);
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var2 = " + var3);
	}

}