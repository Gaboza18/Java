package sec08_Comparable;

import java.util.*;

public class ComparableEx {

	public static void main(String[] args) {

		TreeSet<Person> tset = new TreeSet<>();

		tset.add(new Person("ȫ���", 92));
		tset.add(new Person("��ƹ���", 55));
		tset.add(new Person("�����", 75));

		Iterator<Person> it = tset.iterator(); // Person ��ü�ȿ� �ֱ⶧���� for�� ��� �Ұ� -> Interactor ����� while�� ����ؼ� ����Ѵ�.
		while (it.hasNext()) {
			Person p = it.next();
			System.out.printf("%s : %d\n", p.name, p.age); // ���� ������� ��� 
		}

	}

}
