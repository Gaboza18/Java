package sec1_why_generic;

public class MyArrayListTest {

	public static void main(String[] args) {

		MyArrayList strList = new MyArrayList();

		strList.add("abc");
		strList.add("beta");
		display(strList);

		// ���������� ���� �߻��ϱ� ���ؼ� ���� �Է�
		// Integer.vaLueOf(1234) -> �⺻���� �����͸� ���������� ��ȯ
		strList.add(Integer.valueOf(1234));
		display(strList);
	}

	// ����Ʈ�� ������ ����ϴ� �޼ҵ�
	public static void display(MyArrayList list) {
		for (int i = 0; i < list.size(); i++) {
			String str = (String) list.get(i); // ������ ��ü�� String�� ���� ��ȯ
			System.out.println(list.get(i));
		}
	}
}
