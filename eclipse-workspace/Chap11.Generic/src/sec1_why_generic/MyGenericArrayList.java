package sec1_why_generic;

/*
 *  여러가지 타입의 데이터를 저장하는 저장목록
 */

public class MyGenericArrayList<E> { // E:타입을 나타내는 변수

	private Object[] elements; // 모든 타입의 참조변수를 저장할수 있는 저장소
	private int size; // 저장된 항목의 수

	public MyGenericArrayList() {
		elements = new Object[10]; // 초기에 저장할 데이터의 수를 설정
		size = 0;
	}

	// 데이터 저장하는 메소드
	public void add(Object obj) {
		if (size < elements.length) { // 배열의 항목수보다 작아야 저장 가능
			elements[size] = obj;
		} else {
			// 저장 불가능
		}
		++size;
	}

	// 리스트에서 특정 위치의 항목을 알아내는 메소드

	public E get(int index) {
		if (index >= size) {
			System.out.println("index 지정이 잘못되었습니다.");
		}

		return (E) elements[index];
	}

	// 현재 저장된 항목의 수를 리턴
	public int size() {
		return size;
	}
}
