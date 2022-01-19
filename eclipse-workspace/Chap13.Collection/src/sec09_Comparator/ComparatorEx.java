package sec09_Comparator;

import java.util.*;

public class ComparatorEx {

	public static void main(String[] args) {

		// pset에 데이터 저장시 DescendingComparator() 객체를 이용하게됨
		TreeSet<Product> pSet = new TreeSet<Product>(new DescendingComparator());

		pSet.add(new Product("Tv", 10000));
		pSet.add(new Product("냉장고", 9000));
		pSet.add(new Product("세탁기", 20000));
		pSet.add(new Product("콤퓨타", 5000));

		Iterator<Product> it = pSet.iterator(); // Product 객체안에 있기때문에 for문 사용 불가 -> Interactor 사용후 while문 사용해서 출력한다.
		while (it.hasNext()) {
			Product p = it.next();
			System.out.printf("%s : %d원\n", p.pname, p.price); // 가격 높은순으로 역순 출력
		}
	}

}
