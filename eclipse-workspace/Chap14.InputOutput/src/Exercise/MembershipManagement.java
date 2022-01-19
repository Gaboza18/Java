package Exercise;

import java.io.*;
import java.util.*;

public class MembershipManagement {

	static HashSet<String> member = new HashSet<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		char menu;
		
		while ((menu = selectMenu()) != '0') { // 메뉴입력(0번이 입력될때 까지 반복한다)
			System.out.println("\n선택 menu: " + (int) menu);

			switch (menu) {
			case '1':
				addMember();
				break;
			case '2':
				removeMember();
				break;
			case '3':
				searchMember();
				break;
			case '4':
				listMember();
				break;
			default:
				System.out.println("메뉴 잘못 선택했습니다.");
			}
		}
		System.out.println("프로그램 종료");
	}

	/*
	 * 메뉴를 선택하는 메소드
	 */
	public static char selectMenu() {
		System.out.println("--회원관리 프로그램--");
		System.out.println("1.회원추가");
		System.out.println("2.회원삭제");
		System.out.println("3.회원검색");
		System.out.println("4.회원목록");
		System.out.println("0.종료");
		System.out.println("-----------------");
		System.out.print("메뉴 선택: ");

		// 표준입력에서 메뉴 입력
		InputStream is = System.in;

		int data = 0; // 데이터를 읽는 변수
		try {
			data = is.read();
			System.in.read(); // CR을 읽어 없앤다. CR: 반복문에서 값을 입력하고 생기는 엔터값
			System.in.read(); // LF를 읽어 없앤다. LF: 입력후에 다음줄로 내려갈때 생기는 값
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (char) data;

	}

	public static void addMember() { // 메뉴를 추가
		System.out.print("회원이름 입력: ");
		String name = sc.next();

		if (member.add(name)) {
			System.out.println("회원을 추가 하였습니다.");
			System.out.println();
		} else {
			System.out.println("이미 회원이 존재합니다.");
		}
	}

	public static void removeMember() {
		System.out.print("삭제할 회원이름 입력: ");
		String name = sc.next();

		if (member.remove(name)) {
			System.out.println("회원을 삭제 하였습니다.");
			System.out.println();
		} else {
			System.out.println("삭제할 회원이 존재하지 않습니다.");
		}
	}

	public static void searchMember() {
		System.out.print("검색할 회원이름 입력: ");
		String name = sc.next();

		if (member.contains(name)) {
			System.out.println("회원이 등록되어 있습니다.");
			System.out.println();
		} else {
			System.out.println("회원이 등록되어 있지 않습니다.");
		}
	}

	public static void listMember() {
		System.out.println("==회원목록==");
		System.out.println("회원수: " + member.size());

		Iterator<String> it = member.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			System.out.println("==========");
		}
		System.out.println();
	}
}
