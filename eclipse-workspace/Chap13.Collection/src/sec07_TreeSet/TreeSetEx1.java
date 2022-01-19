package sec07_TreeSet;

import java.util.*;

public class TreeSetEx1 {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<>();

		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("flower");

		System.out.println(set); // ���ĺ� ������ �����ؼ� ���(a~z), �빮�� -> �ҹ��� �������
		System.out.println("1����ü: " + set.first()); // ù��° ��ü
		System.out.println("'disc�� headset: " + set.headSet("disc")); // disc �������� ����Ѵ�
		System.out.println("'disc�� tailset: "+set.tailSet("disc")); // disc �� �����Ͽ� ���ı��� ���
		System.out.println("'disc�� lower: "+set.lower("disc")); // ��ü���� �ٷξƷ� ��ü ����
		System.out.println("'disc�� floor: "+set.floor("disc")); // ������ ��ü ���� ������ �ٷξƷ� ��ü ����
	}

}
