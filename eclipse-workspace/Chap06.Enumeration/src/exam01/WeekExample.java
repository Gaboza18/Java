package exam01;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		String str = new String("abc");
		Calendar now = Calendar.getInstance(); // ��ǻ���� ��,��,��.�ð� ���� ����
		Week today = null;

		int year = now.get(Calendar.YEAR); // now������ ����� �⵵ ������ ���´�.
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println("����: " + year + "�� " + month + "��" + day + "��");

		int week = now.get(Calendar.DAY_OF_WEEK);

		switch (week) {
		case 1:
			today = Week.SUNDAY; // �̱��� �Ͽ��� ���� ����
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
		System.out.printf("����: %s �Դϴ�. ", today.name());
	}

}
