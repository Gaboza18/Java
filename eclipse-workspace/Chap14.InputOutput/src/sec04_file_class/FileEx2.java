package sec04_file_class;

import java.io.*;

/*
 *  명령행 프롬프트에서 디렉토리명을 입력하면
 *  디렉토리 여부를 판단하는 프로그램
 */
public class FileEx2 { // Run - RunConfigurations 실행

	public static void main(String[] args) {

		File file = new File(args[0]); // 명령행에서 입력값을 읽어들인다.
		System.out.println("입력 디렉토리명: " + args[0]);

		// 디렉토리명이 존재하지 않거나, 디렉토리가 아니면 프로그램 실행 중지
		if (!file.exists() || !file.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리 입니다.");
			System.exit(0); // 프로그램 종료
		} else {
			System.out.println("존재하는 디렉토리 입니다.");
			System.out.println();
		}

		File[] files = file.listFiles();
		System.out.println("======파일 목록======");
		for (int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory() ? "[" + fileName + "]" : fileName);
		}
	}

}
