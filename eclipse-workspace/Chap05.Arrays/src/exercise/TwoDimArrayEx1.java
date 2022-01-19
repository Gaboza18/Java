package exercise;

public class TwoDimArrayEx1 {

	public static void main(String[] args) { // 2차원 배열
		
		double[][] rainFals =  // 배열값 선언
			{
			{ 256.5, 654.2, 456.3, 76.9},
			{ 204.1, 610.4, 108.8, 66.6},
			{ 231.3, 752, 143.1, 142.3},
			{ 302.9, 692.6, 307.6, 98.7},
			{ 256.9, 1053.60, 225.5, 45.6},
			{ 256.5, 770.6, 363.3, 139.3},
			{ 264.3, 567.5, 231.2, 59.7},
			{ 215.9, 599.8, 293.1, 76.7},
			{ 109.1, 388, 247.3, 223.1}
			};
		
		
		double YearlyTotal = 0.0; //년간 총합
		
		System.out.printf("\t%3s\t%3s\t%3s\t%3s\t%5s\t%7s\n","봄","여름","가을","겨울","년간합계","평균강수량");
		
		for (int i = 0; i < rainFals.length; i++) { // n년 출력(열)
			System.out.printf("%5d년", 2007 + i);
			YearlyTotal = 0; //

			for (int j = 0; j < rainFals[i].length; j++) { // 배열값 출력(행)
				YearlyTotal += rainFals[i][j];
				System.out.printf("%8.2f", rainFals[i][j]); // 8칸 입력 2칸 뛰운다.

			}
			System.out.printf("%9.2f", YearlyTotal);
			System.out.printf("%9.2f", (YearlyTotal/rainFals[i].length));
			System.out.println("");
		}

	}

}
