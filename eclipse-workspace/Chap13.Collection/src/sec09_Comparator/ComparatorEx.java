package sec09_Comparator;

import java.util.*;

public class ComparatorEx {

	public static void main(String[] args) {

		// pset�� ������ ����� DescendingComparator() ��ü�� �̿��ϰԵ�
		TreeSet<Product> pSet = new TreeSet<Product>(new DescendingComparator());

		pSet.add(new Product("Tv", 10000));
		pSet.add(new Product("�����", 9000));
		pSet.add(new Product("��Ź��", 20000));
		pSet.add(new Product("��ǻŸ", 5000));

		Iterator<Product> it = pSet.iterator(); // Product ��ü�ȿ� �ֱ⶧���� for�� ��� �Ұ� -> Interactor ����� while�� ����ؼ� ����Ѵ�.
		while (it.hasNext()) {
			Product p = it.next();
			System.out.printf("%s : %d��\n", p.pname, p.price); // ���� ���������� ���� ���
		}
	}

}
