package exam01;

public class EnumExample1 {

	public static void main(String[] args) {

		Week today = Week.WEDNESDAY;
		System.out.println("today: " + today);

		// 열거타입 메소드 name()
		String name = today.name();
		System.out.println("today: " + name);

		// today = Week.MARCH; // Week 타입에 정의되지 않는값을 선언x

		// 열거형 타입의 순서를 읽어온다.
		System.out.println("");
		int ordinal = today.ordinal(); // 0부터 시작
		System.out.printf("%s의 순서번호 %d\n", today, ordinal);

		// 열거타입 메소드 compareTO()
		Week day1 = Week.MONDAY; // 0
		Week day2 = Week.WEDNESDAY; // 2
		int result = day1.compareTo(day2); // 0-2
		System.out.println("day1.compareTo(day2) 결과: " + result);

		// 열거타입 메소드 vlaueOf()
		Week day3 = Week.valueOf("SUNDAY");
		System.out.println("day3= " + day3);

		if (day3 == Week.SUNDAY) { // >,< 비교 연산자는 사용 불가능
			System.out.println("일요일입니다. ");
		} else {
			System.out.println("평일입니다.");
		}

		System.out.println("");
		
		// 열거타입 메소드 values()
		Week[] days = Week.values();
		for (Week day : days) {
			System.out.println(day);
		}
	}

}
