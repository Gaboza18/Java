package sec12_init_block;

public class BlockTest {

	static {
		System.out.println("static ���: static {  }");
	}

	{
		System.out.println("�ν��Ͻ� ���: {  }");
	}

	// ������
	public BlockTest() {
		System.out.println("������");
	}

	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();

		System.out.println("BlockTest bt2 = new BlockTest();");
		BlockTest bt2 = new BlockTest();
	}

}
