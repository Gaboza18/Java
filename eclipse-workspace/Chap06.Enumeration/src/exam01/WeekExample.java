package exam01;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		String str = new String("abc");
		Calendar now = Calendar.getInstance(); // 컴퓨터의 년,월,일.시간 정보 저장
		Week today = null;

		int year = now.get(Calendar.YEAR); // now변수에 저장된 년도 정보를 얻어온다.
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println("현재: " + year + "년 " + month + "월" + day + "일");

		int week = now.get(Calendar.DAY_OF_WEEK);

		switch (week) {
		case 1:
			today = Week.SUNDAY; // 미국은 일요일 부터 시작
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.printf("현재: %s 입니다. ", today.name());
	}

}
