package sec17_Singleton;

public class SingletonTest {

	public static void main(String[] args) {
		// Singleton s = new Singleton(); // ������ ��� �Ұ���: private ����
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("obj1 = obj2(�����ּҰ�)");	
		}else
			System.out.println("obj1 != obj2(�ٸ��ּ� ��)");

	}

}
