package JavaPractice;

/*
public class JavaArrayPractice {
	public static void main(String[] args) {

		String[] classGroup = { "������", "������", "���̶�", "�̰���" };

		System.out.println(classGroup[0]);
		System.out.println(classGroup[1]);
		System.out.println(classGroup[2]);
		System.out.println(classGroup[3]);

	}

}
*/

/*
public class JavaArrayPractice {
	public static void main(String[] args) {

		String[] classGroup = new String[4]; // new String[n] = ���ο� �迭 ����, n���� ���� 

		classGroup[0] = "������"; // 0��° index���� �������� �ְڴ�.
		System.out.println(classGroup.length); // length = �迭�� �ִ� ���� = 4

		classGroup[1] = "������";
		System.out.println(classGroup.length);

		classGroup[2] = "���̶�";
		System.out.println(classGroup.length);

		classGroup[3] = "�̰���";
		System.out.println(classGroup.length);

	}
}
*/

/*
public class JavaArrayPractice {
	public static void main(String[] args) {

		String[] Members = { "������", "������", "���̶�" }; // �迭 ���� �� �� �Է�
		
		for (int i = 0; i < Members.length; i++) { // Members.length = ���̰� 3
			String Member = Members[i];
			System.out.println(Member + "�� ����� �޾ҽ��ϴ�.");
			
		}
	}
}
*/

/*
public class JavaArrayPractice { // for-each �迭 �˰���
	public static void main(String[] args) {
		
		String[] members = { "������", "������", "���̶�" };
		for (String e : members) { // members�� ���� ���� e�� ��Ƽ� ���� ������ ����
			System.out.println(e + "�� ����� �޾ҽ��ϴ�.");
			
		}
	}
}
*/

/*
public class JavaArrayPractice { // �迭 arr�� ��� ��� ���� ���ϴ� ���α׷�
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 }; // �迭�� ����
		int sum = 0; // �迭�� ���� ���� sum ����

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("�迭�� ������= " + sum);
	}
}
*/