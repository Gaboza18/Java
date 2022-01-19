package sec04_file_class;

import java.io.*;

public class FileEx1 {

	public static void main(String[] args) throws IOException {

		File file = new File("./program.out");

		String fileName = file.getName();

		System.out.println("경로를 제외한 파일명: " + fileName);

		String path = file.getPath();
		System.out.println("경로를 포함한 파일명: " + path);

		System.out.println("파일의 절대경로: " + file.getAbsolutePath());
		System.out.println("파일의 정규경로: " + file.getCanonicalPath());
	}

}
