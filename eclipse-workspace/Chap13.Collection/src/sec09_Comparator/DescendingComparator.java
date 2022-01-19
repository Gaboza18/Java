package sec09_Comparator;

import java.util.*;

public class DescendingComparator implements Comparator<Product> {

	/*
	 * ���� ���� ��� 
	 * o1�� ������ 1 / o1,o2 ������ 0 / o1�� ũ�� -1 ����
	 */
	@Override
	public int compare(Product o1, Product o2) {
		if (o1.price < o2.price) {
			return 1;
		} else if (o1.price == o2.price) {
			return 0;
		} else
			return -1;

	}

}
