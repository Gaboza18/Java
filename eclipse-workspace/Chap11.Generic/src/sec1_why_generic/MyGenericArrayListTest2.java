package sec1_why_generic;

public class MyGenericArrayListTest2 {

	public static void main(String[] args) {
		MyGenericArrayList<String> strList = new MyGenericArrayList();

		strList.add("abc");
		strList.add("beta");
		display(strList);

		// ���������� ���� �߻��ϱ� ���ؼ� ���� �Է�
		// Integer.vaLueOf(1234) -> �⺻���� �����͸� ���������� ��ȯ
		strList.add(Integer.valueOf(1234));
		display(strList);
	}

	// ����Ʈ�� ������ ����ϴ� �޼ҵ�
	public static void display(MyGenericArrayList<String> strList) {
		for (int i = 0; i < strList.size(); i++) {
			String str = (String) strList.get(i); // ������ ��ü�� String�� ���� ��ȯ
			System.out.println(str);
		}
	}
}
