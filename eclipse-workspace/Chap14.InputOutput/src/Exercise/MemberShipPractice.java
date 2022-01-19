package Exercise;

import java.io.*;
import java.util.*;

public class MemberShipPractice {

	static HashSet<String> member = new HashSet<>(); // �ɹ� ���� HashSet�� ����
	static Scanner sc = new Scanner(System.in); // �ܼ�â �Է��ϱ� ���� Scanner

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
				System.out.println("�޴��� �ٽ� �����ϼ���.");
			}
		}
		System.out.println("���α׷� ���� �մϴ�.");
	}
	/*
	 * �޴� �����ϴ� �޼ҵ�
	 */

	public static char selectMenu() {
		System.out.println("----ȸ������ ���α׷�----");
		System.out.println("    1.ȸ���߰�");
		System.out.println("    2.ȸ���˻�");
		System.out.println("    3.ȸ�����");
		System.out.println("    4.ȸ������");
		System.out.println("    0.����");
		System.out.println("--------------------");
		System.out.println("�޴�����: ");

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
	 * ȸ�� �߰��ϴ� �޼ҵ�
	 */

	public static void addMember() {
		System.out.print("����� ȸ���̸� �Է�: ");
		String name = sc.next();

		if (member.add(name)) {
			System.out.println("ȸ������� �Ϸ�Ǿ����ϴ�!");
			System.out.println();
		} else {
			System.out.println("�̹� ��ϵ� ȸ���Դϴ�.");
		}
	}

	/*
	 * ���� ��ϵǾ� �ִ� ȸ���˻� �޼ҵ�
	 */

	public static void searchMember() {
		System.out.print("�˻��� ȸ���̸� �Է�: ");
		String name = sc.next();

		if (member.contains(name)) {
			System.out.println("'ȸ��'�Դϴ�.");
		} else {
			System.out.println("'��ȸ��' �Դϴ�.");
		}
	}

	/*
	 * ȸ�� ��� �˻�
	 */

	public static void listMember() {
		System.out.println("----ȸ�����----");
		System.out.println("ȸ����: " + member.size());

		Iterator<String> it = member.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			System.out.println("------------");
		}
		System.out.println();
	}

	/*
	 * ȸ�� ����
	 */

	public static void removeMember() {
		System.out.println("������ ȸ���̸� �Է�: ");
		String name = sc.next();

		if (member.remove(name)) {
			System.out.println("ȸ�� �����Ϸ�");
		} else {
			System.out.println("ȸ���� ��ϵǾ� ���� �ʽ��ϴ�.");
		}
	}
}
