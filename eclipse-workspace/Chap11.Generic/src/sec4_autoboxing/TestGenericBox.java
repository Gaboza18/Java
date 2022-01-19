package sec4_autoboxing;

public class TestGenericBox {

	public static void main(String[] args) {

		GenericBox<String> box1 = new GenericBox<String>("ȫ�浿");
		String str = box1.getContent(); // ���� �����ö� Ÿ�Ժ�ȯ �ʿ䰡 ����(AutoUnboxing)
		System.out.println("box1");

		GenericBox<Integer> box2 = new GenericBox<Integer>(123);
		// Integer Ÿ������ Ÿ�Ժ�ȯ ���� primary type�� �״�� �����.(Autoboxing)
		int i = box2.getContent();
		System.out.println("box2");
	}

}
