package Exercise;

import java.io.*;
import java.util.*;

public class MemberShipPractice {

	static HashSet<String> member = new HashSet<>(); // 맴버 내용 HashSet에 저장
	static Scanner sc = new Scanner(System.in); // 콘솔창 입력하기 위한 Scanner

	public static void main(String[] args) {

		char menu;

		while ((menu = selectMenu()) != '0') {
			switch (menu) {

			case '1':
				addMember();
				break;
			case '2':
				searchMember();
				break;
			case '3':
				listMember();
				break;
			case '4':
				removeMember();
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}
		}
		System.out.println("프로그램 종료 합니다.");
	}
	/*
	 * 메뉴 선택하는 메소드
	 */

	public static char selectMenu() {
		System.out.println("----회원관리 프로그램----");
		System.out.println("    1.회원추가");
		System.out.println("    2.회원검색");
		System.out.println("    3.회원목록");
		System.out.println("    4.회원삭제");
		System.out.println("    0.종료");
		System.out.println("--------------------");
		System.out.println("메뉴선택: ");

		InputStream is = System.in;

		int data = 0;
		try {
			data = is.read();
			System.in.read();
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (char) data;
	}

	/*
	 * 회원 추가하는 메소드
	 */

	public static void addMember() {
		System.out.print("등록할 회원이름 입력: ");
		String name = sc.next();

		if (member.add(name)) {
			System.out.println("회원등록이 완료되었습니다!");
			System.out.println();
		} else {
			System.out.println("이미 등록된 회원입니다.");
		}
	}

	/*
	 * 현재 등록되어 있는 회원검색 메소드
	 */

	public static void searchMember() {
		System.out.print("검색할 회원이름 입력: ");
		String name = sc.next();

		if (member.contains(name)) {
			System.out.println("'회원'입니다.");
		} else {
			System.out.println("'비회원' 입니다.");
		}
	}

	/*
	 * 회원 목록 검색
	 */

	public static void listMember() {
		System.out.println("----회원목록----");
		System.out.println("회원수: " + member.size());

		Iterator<String> it = member.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			System.out.println("------------");
		}
		System.out.println();
	}

	/*
	 * 회원 삭제
	 */

	public static void removeMember() {
		System.out.println("삭제할 회원이름 입력: ");
		String name = sc.next();

		if (member.remove(name)) {
			System.out.println("회원 삭제완료");
		} else {
			System.out.println("회원이 등록되어 있지 않습니다.");
		}
	}
}
