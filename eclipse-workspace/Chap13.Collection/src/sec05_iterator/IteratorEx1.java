package sec05_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>(); // �ڿ� ������ ���� ���� <>, �迭����Ʈ ����

		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("��ȸ");
		
		Iterator<String> it = list.iterator(); // <String> Ÿ������ ���� �������� ������ Object�� ����Ѵ�
		
		while(it.hasNext()) { // it�� ó���� �����Ͱ� �ִ��� ������ ������
			String str = it.next();
			System.out.println(str);
		}
	}

}
