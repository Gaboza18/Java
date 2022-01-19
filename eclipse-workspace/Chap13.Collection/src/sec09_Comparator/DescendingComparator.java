package sec09_Comparator;

import java.util.*;

public class DescendingComparator implements Comparator<Product> {

	/*
	 * 역순 정렬 기능 
	 * o1이 작으면 1 / o1,o2 같으면 0 / o1이 크면 -1 리턴
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
