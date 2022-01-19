package exam_print;

public class PrintEx2 {
	public static void main(String[] args) {
		float f1 = .10f; // 0.10 의미
		float f2 = 1e1f; // 1 x 10^1 = 10.0 의미
		float f3 = 3.14e3f; // 3.14 x 10^3 = 3140 의미
		double d = 1.23456789;

		System.out.printf("f1 = %f, %e\n", f1, f1); // %e = 지수형태
		System.out.printf("f2 = %f, %e\n", f2, f2);
		System.out.printf("f3 = %f, %e\n", f3, f3);
		System.out.printf("d = %f\n", d);
		System.out.printf("d = [%14.10f]\n", d); // 14자리 출력 소수점 이하 10자리 출력, 오른쪽으로 정렬
		System.out.printf("d = [%-14.10f]\n", d); // 14자리 출력 소수점 이하 10자리 출력, 왼쪽으로 정렬
	}
}