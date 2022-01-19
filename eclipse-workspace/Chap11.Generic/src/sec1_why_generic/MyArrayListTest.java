package sec1_why_generic;

public class MyArrayListTest {

	public static void main(String[] args) {

		MyArrayList strList = new MyArrayList();

		strList.add("abc");
		strList.add("beta");
		display(strList);

		// 고의적으로 문제 발생하기 위해서 숫자 입력
		// Integer.vaLueOf(1234) -> 기본형의 데이터를 참조형으로 변환
		strList.add(Integer.valueOf(1234));
		display(strList);
	}

	// 리스트의 내용을 출력하는 메소드
	public static void display(MyArrayList list) {
		for (int i = 0; i < list.size(); i++) {
			String str = (String) list.get(i); // 조상의 객체를 String형 으로 변환
			System.out.println(list.get(i));
		}
	}
}
