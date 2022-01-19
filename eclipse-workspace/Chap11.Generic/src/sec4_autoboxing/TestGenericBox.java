package sec4_autoboxing;

public class TestGenericBox {

	public static void main(String[] args) {

		GenericBox<String> box1 = new GenericBox<String>("홍길동");
		String str = box1.getContent(); // 값을 가져올때 타입변환 필요가 없음(AutoUnboxing)
		System.out.println("box1");

		GenericBox<Integer> box2 = new GenericBox<Integer>(123);
		// Integer 타입으로 타입변환 없이 primary type을 그대로 사용함.(Autoboxing)
		int i = box2.getContent();
		System.out.println("box2");
	}

}
