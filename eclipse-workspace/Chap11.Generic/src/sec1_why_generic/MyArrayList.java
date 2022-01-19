package sec1_why_generic;

/*
 *  �������� Ÿ���� �����͸� �����ϴ� ������
 */

public class MyArrayList {

	private Object[] elements; // ��� Ÿ���� ���������� �����Ҽ� �ִ� �����
	private int size; // ����� �׸��� ��

	public MyArrayList() {
		elements = new Object[10]; // �ʱ⿡ ������ �������� ���� ����
		size = 0;
	}

	// ������ �����ϴ� �޼ҵ�
	public void add(Object obj) {
		if (size < elements.length) { // �迭�� �׸������ �۾ƾ� ���� ����
			elements[size] = obj;
		} else {
			// ���� �Ұ���
		}
		++size;
	}

	// ����Ʈ���� Ư�� ��ġ�� �׸��� �˾Ƴ��� �޼ҵ�

	public Object get(int index) {
		if (index >= size) {
			System.out.println("index ������ �߸��Ǿ����ϴ�.");
		}

		return elements[index];
	}

	// ���� ����� �׸��� ���� ����
	public int size() {
		return size;
	}
}
