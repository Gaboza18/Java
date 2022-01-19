package sec01_inputstreamOutputstream;

import java.io.*;
import java.util.Arrays;

public class ByteArrayInputStreamPractice {

	public static void main(String[] args) {

		byte[] InSrc = { 0, 1, 2, 3, 4, 5 }; // 입력용 배열 
		byte[] OutSrc = null; // 출력용 배열(입력받은걸 출력해야 하기 때문에 null)

		ByteArrayInputStream input = new ByteArrayInputStream(InSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();

		int data = 0; // 스트림에서 읽은 데이터 저장

		while ((data = input.read()) != -1) { // 메오리에서 더이상 읽을 데이터가 없으면 -1 리턴한다
			output.write(data);
		}

		OutSrc = output.toByteArray();
		System.out.println("Input Source: " + Arrays.toString(InSrc));
		System.out.println("Output Source: " + Arrays.toString(OutSrc));
	}

}
