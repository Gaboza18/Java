package sec07_Date;

import java.util.*;

public class CalenderEx {
	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();

		String[] weeks = { "", "��", "��", "ȭ", "��", "��", "��", "��" }; // �Ͽ��� 1���� ���� �ϱ� ������ ù��°�� ������ �ش�

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // 0~11������ ���� �����ϱ� ������ +1�� �ؾ��Ѵ�.
		int day = now.get(Calendar.DAY_OF_MONTH); // ���� ���ڸ� ����
		int week = now.get(Calendar.DAY_OF_WEEK); // ������ ����

		System.out.printf(year + "�� ");
		System.out.printf(month + "�� ");
		System.out.printf(day + "�� ");
		System.out.printf(weeks[week] + "���� "); // �Ͽ��� = 1 ������ =2 ....

	}
}
