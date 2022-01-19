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

		System.out.println(set); // 알파벳 순으로 정렬해서 출력(a~z), 대문자 -> 소문자 순서대로
		System.out.println("1번객체: " + set.first()); // 첫번째 객체
		System.out.println("'disc의 headset: " + set.headSet("disc")); // disc 이전까지 출력한다
		System.out.println("'disc의 tailset: "+set.tailSet("disc")); // disc 를 포함하여 이후까지 출력
		System.out.println("'disc의 lower: "+set.lower("disc")); // 객체보다 바로아래 객체 리턴
		System.out.println("'disc의 floor: "+set.floor("disc")); // 동등한 객체 리턴 없으면 바로아래 객체 리턴
	}

}
