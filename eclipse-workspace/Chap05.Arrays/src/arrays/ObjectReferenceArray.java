package arrays;

public class ObjectReferenceArray {

	public static void main(String[] args) {
		// 문자열 주소 3개를 저장할 배열 생성
		String[] strArr = new String[3];

		strArr[0] = new String("Java");
		strArr[1] = "Java";
		strArr[2] = "Java";

		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);

		}

		if (strArr[0] == strArr[1]) { // 내용은 같으나 참조주소가 다르다.
			System.out.println("참조 주소가 같습니다.");
		} else {
			System.out.println("참조 주소가 다릅니다.");
		}
		if (strArr[1] == strArr[2]) { // 내용과 참조주소가 같다.
			System.out.println("참조 주소가 같습니다.");
		} else {
			System.out.println("참조 주소가 다릅니다.");
		}

	}

}
