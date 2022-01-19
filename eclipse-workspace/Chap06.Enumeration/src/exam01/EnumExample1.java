package exam01;

public class EnumExample1 {

	public static void main(String[] args) {

		Week today = Week.WEDNESDAY;
		System.out.println("today: " + today);

		// ����Ÿ�� �޼ҵ� name()
		String name = today.name();
		System.out.println("today: " + name);

		// today = Week.MARCH; // Week Ÿ�Կ� ���ǵ��� �ʴ°��� ����x

		// ������ Ÿ���� ������ �о�´�.
		System.out.println("");
		int ordinal = today.ordinal(); // 0���� ����
		System.out.printf("%s�� ������ȣ %d\n", today, ordinal);

		// ����Ÿ�� �޼ҵ� compareTO()
		Week day1 = Week.MONDAY; // 0
		Week day2 = Week.WEDNESDAY; // 2
		int result = day1.compareTo(day2); // 0-2
		System.out.println("day1.compareTo(day2) ���: " + result);

		// ����Ÿ�� �޼ҵ� vlaueOf()
		Week day3 = Week.valueOf("SUNDAY");
		System.out.println("day3= " + day3);

		if (day3 == Week.SUNDAY) { // >,< �� �����ڴ� ��� �Ұ���
			System.out.println("�Ͽ����Դϴ�. ");
		} else {
			System.out.println("�����Դϴ�.");
		}

		System.out.println("");
		
		// ����Ÿ�� �޼ҵ� values()
		Week[] days = Week.values();
		for (Week day : days) {
			System.out.println(day);
		}
	}

}
