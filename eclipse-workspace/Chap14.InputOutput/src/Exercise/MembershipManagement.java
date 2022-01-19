package Exercise;

import java.io.*;
import java.util.*;

public class MembershipManagement {

	static HashSet<String> member = new HashSet<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		char menu;
		
		while ((menu = selectMenu()) != '0') { // �޴��Է�(0���� �Էµɶ� ���� �ݺ��Ѵ�)
			System.out.println("\n���� menu: " + (int) menu);

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
				System.out.println("�޴� �߸� �����߽��ϴ�.");
			}
		}
		System.out.println("���α׷� ����");
	}

	/*
	 * �޴��� �����ϴ� �޼ҵ�
	 */
	public static char selectMenu() {
		System.out.println("--ȸ������ ���α׷�--");
		System.out.println("1.ȸ���߰�");
		System.out.println("2.ȸ������");
		System.out.println("3.ȸ���˻�");
		System.out.println("4.ȸ�����");
		System.out.println("0.����");
		System.out.println("-----------------");
		System.out.print("�޴� ����: ");

		// ǥ���Է¿��� �޴� �Է�
		InputStream is = System.in;

		int data = 0; // �����͸� �д� ����
		try {
			data = is.read();
			System.in.read(); // CR�� �о� ���ش�. CR: �ݺ������� ���� �Է��ϰ� ����� ���Ͱ�
			System.in.read(); // LF�� �о� ���ش�. LF: �Է��Ŀ� �����ٷ� �������� ����� ��
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (char) data;

	}

	public static void addMember() { // �޴��� �߰�
		System.out.print("ȸ���̸� �Է�: ");
		String name = sc.next();

		if (member.add(name)) {
			System.out.println("ȸ���� �߰� �Ͽ����ϴ�.");
			System.out.println();
		} else {
			System.out.println("�̹� ȸ���� �����մϴ�.");
		}
	}

	public static void removeMember() {
		System.out.print("������ ȸ���̸� �Է�: ");
		String name = sc.next();

		if (member.remove(name)) {
			System.out.println("ȸ���� ���� �Ͽ����ϴ�.");
			System.out.println();
		} else {
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
		}
	}

	public static void searchMember() {
		System.out.print("�˻��� ȸ���̸� �Է�: ");
		String name = sc.next();

		if (member.contains(name)) {
			System.out.println("ȸ���� ��ϵǾ� �ֽ��ϴ�.");
			System.out.println();
		} else {
			System.out.println("ȸ���� ��ϵǾ� ���� �ʽ��ϴ�.");
		}
	}

	public static void listMember() {
		System.out.println("==ȸ�����==");
		System.out.println("ȸ����: " + member.size());

		Iterator<String> it = member.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			System.out.println("==========");
		}
		System.out.println();
	}
}
