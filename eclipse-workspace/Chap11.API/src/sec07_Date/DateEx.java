package sec07_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {

		Date now = new Date();

		System.out.println(now.toString()); // �̱� ǥ�ؽð� ����

		// ��¥ ������ ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String strNow = sdf.format(now);
		System.out.println(strNow);

	}

}
