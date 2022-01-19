package sec03.anonymous;

// Person을 상속받아 이름이 존재하는 클래스를 생성 
class Student extends Person {

	@Override
	void wakeup() {
		System.out.println("학생은 6시에 일어납니다.");
	}

}

public class Annonymous {
	Person s = new Student();

	// 필드의 초기값으로 익명의 클래스 생성
	Person field1 = new Person() {
		int wakeup_time;

		void work() {
			System.out.println("출근합니다.");
		}

		@Override
		void wakeup() {
			super.wakeup();
		}

	};

	void method1() {
		field1.wakeup();

		// 로컬변수에 익명의 클래스 생성
		Person lv = new Person() {
			void walk() {
				System.out.println("산책을 합니다.");
			}

			void wakeup() {
				System.out.println("8시에 일어납니다.");
			}
		}; // 익명 클래스 뒤 ;
		lv.wakeup();
	}
}
