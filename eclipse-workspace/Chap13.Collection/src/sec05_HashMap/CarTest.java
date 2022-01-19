package sec05_HashMap;

import java.util.*;
import java.util.Map.Entry;

public class CarTest {

	public static void main(String[] args) {

		Map<Car, Integer> map = new HashMap<>();

		map.put(new Car(100, "아반떼"), 85);
		map.put(new Car(120, "람보르기니"), 100);
		map.put(new Car(100, "벤츠"), 85);
		map.put(new Car(120, "람보르기니"), 100);

		System.out.println("Size: " + map.size());

		Set<Entry<Car, Integer>> entry = map.entrySet();
		System.out.println(entry);

	}

}
