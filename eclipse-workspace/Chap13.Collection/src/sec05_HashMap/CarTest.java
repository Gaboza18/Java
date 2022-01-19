package sec05_HashMap;

import java.util.*;
import java.util.Map.Entry;

public class CarTest {

	public static void main(String[] args) {

		Map<Car, Integer> map = new HashMap<>();

		map.put(new Car(100, "�ƹݶ�"), 85);
		map.put(new Car(120, "���������"), 100);
		map.put(new Car(100, "����"), 85);
		map.put(new Car(120, "���������"), 100);

		System.out.println("Size: " + map.size());

		Set<Entry<Car, Integer>> entry = map.entrySet();
		System.out.println(entry);

	}

}
