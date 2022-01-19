package sec07_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {

		Date now = new Date();

		System.out.println(now.toString()); // 미국 표준시간 기준

		// 날짜 포맷을 변경
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow = sdf.format(now);
		System.out.println(strNow);

	}

}
