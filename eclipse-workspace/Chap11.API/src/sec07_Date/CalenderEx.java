package sec07_Date;

import java.util.*;

public class CalenderEx {
	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();

		String[] weeks = { "", "일", "월", "화", "수", "목", "금", "토" }; // 일요일 1부터 시작 하기 때문에 첫번째는 공백을 준다

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // 0~11사이의 값을 리턴하기 때문에 +1을 해야한다.
		int day = now.get(Calendar.DAY_OF_MONTH); // 월별 일자를 리턴
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일을 리턴

		System.out.printf(year + "년 ");
		System.out.printf(month + "월 ");
		System.out.printf(day + "일 ");
		System.out.printf(weeks[week] + "요일 "); // 일요일 = 1 월요일 =2 ....

	}
}
