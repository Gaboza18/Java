package sec17_Singleton;

public class SingletonTest {

	public static void main(String[] args) {
		// Singleton s = new Singleton(); // 생성자 사용 불가능: private 지정
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("obj1 = obj2(같은주소값)");	
		}else
			System.out.println("obj1 != obj2(다른주소 값)");

	}

}
