package GetterSetter_Practice;

public class CarExample {
	public static void main(String[] args) {

		Car myCar = new Car();

		System.out.println("����ӵ�: "+myCar.getSpeed());
		
		myCar.setSpeed(-50); // �߸��� �ӵ��� �Է�
		System.out.println("����ӵ�: " + myCar.getSpeed()); 
		
		myCar.setSpeed(60);
		System.out.println("����ӵ�: " + myCar.getSpeed());
		
	}
}
