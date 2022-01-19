package sec1_why_generic;

/*
 *  �������� Ÿ���� �����͸� �����ϴ� ������
 */

public class MyGenericArrayList<E> { // E:Ÿ���� ��Ÿ���� ����

	private Object[] elements; // ��� Ÿ���� ���������� �����Ҽ� �ִ� �����
	private int size; // ����� �׸��� ��

	public MyGenericArrayList() {
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

	public E get(int index) {
		if (index >= size) {
			System.out.println("index ������ �߸��Ǿ����ϴ�.");
		}

		return (E) elements[index];
	}

	// ���� ����� �׸��� ���� ����
	public int size() {
		return size;
	}
}
