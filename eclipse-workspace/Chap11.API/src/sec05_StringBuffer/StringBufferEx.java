package sec05_StringBuffer;

public class StringBufferEx {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("abc");

		sb.append("def");
		System.out.println("sb=" + sb);

		sb.append(9.0);
		System.out.println("sb=" + sb);

		sb.delete(3, 5); // 3 ~ 5전 까지 삭제
		System.out.println("sb=" + sb);
		
		sb.insert(4, "ghi"); 
		System.out.println("sb=" + sb);

	}

}
