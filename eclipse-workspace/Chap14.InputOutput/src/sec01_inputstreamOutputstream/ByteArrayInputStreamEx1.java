package sec01_inputstreamOutputstream;

import java.io.*; // 입출력시 임포트
import java.util.Arrays;

public class ByteArrayInputStreamEx1 {

	public static void main(String[] args) {

		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // 입력용 배열
		byte[] outSrc = null; // 출력용 배열

		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		int data = 0; // 스트림에서 읽은 데이터 저장

		while ((data = input.read()) != -1) { // 메모리에서 더이상 읽을 데이터가 없으면 -1를 리턴한다
			output.write(data); // 출력스트림 으로 읽은 데이터를 내보낸다.
		}
		outSrc = output.toByteArray(); // 출력 스트림의 내용을 byte배열로 변환하여 저장
		System.out.println("Input Source: " + Arrays.toString(inSrc)); // 배열형태로 변환하여 출력
		System.out.println("Output Source: " + Arrays.toString(outSrc));
	}

}
