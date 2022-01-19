package sec01_arraylist;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Java"); // String °´Ã¼ »ý¼º
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");

		int size = list.size(); // ÀúÀåµÈ ÃÑ °´Ã¼ ¼ö ¾ò±â
		//System.out.println(list.size());
		System.out.println("ÃÑ °´Ã¼¼ö´Â: " + size);
		System.out.println();

		String skill = list.get(2); // 2¹ø ÀÎµ¦½ºÀÇ °´Ã¼ ¾ò±â
		System.out.println("2:" + skill);
		System.out.println();

		for (int i = 0; i < list.size(); i++) { // ÀúÀåµÈ °´Ã¼ ¼ö¸¸Å­ ·çÇÎ
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();

		list.remove(2); // 2¹ø ÀÎµ¦½º °´Ã¼(Database) »èÁ¦µÊ
		list.remove(2); // 2¹ø ÀÎµ¦½º °´Ã¼(Servlet/JSP) »èÁ¦µÊ
		list.remove("iBATIS");

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}

	}

}
