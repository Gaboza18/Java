package exercise;

import java.util.Scanner;

public class DowhileEx1 { // 1~100���� ��ǻ�Ͱ� �����ϴ� �������ڸ� ����� �Է��Ͽ� ���ߴ� ����
	public static void main(String[] args) {

		int HumanNumber = 1; // ����� �Է��ϴ� �� ����
		int PCNumber = (int) (Math.random() * 100) + 1; // 1<=PCnumber<100.99999999

		do {
			System.out.printf("���ڸ��� ������ �Է�: "); // scanner���� Ȱ���Ͽ� �Է��� ���� ���
			Scanner input = new Scanner(System.in); // scanner��
			HumanNumber = input.nextInt(); // scanner��

			if (PCNumber > HumanNumber) { // ����ڿ� ��ǻ�Ͱ� ������ ������ ��
				System.out.println("���� ��'ū'���� �Է��ϼ���"); // +
			} else if (PCNumber < HumanNumber) {
				System.out.println("���� ��'����'���� �Է��ϼ���"); // -
			} else {
				System.out.println("�����Դϴ�! (���α׷��� �����մϴ�.)"); // =
			}
		} while (HumanNumber != PCNumber); // ����ڰ� �Է��Ѽ� = ��ǻ�� �������� �ɶ����� �ݺ�

	}

}