package sec18_getter_setter;

public class CarTest {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.speed1 = -10; // �ڵ����� �ӵ��� ������ �ɼ� ����(�߸��� �� ����)
		// car1.speed2 = 10; // private�� �����߱� ���� Ÿ Ŭ���� ���Ұ�
		
		car1.setSpeed(-10);
		System.out.println("car1�� �ӵ�: "+car1.getSpeed());
		
		car1.setSpeed(50);
		System.out.println("car1�� �ӵ�: "+car1.getSpeed());
		
		car1.setStop(true);
		System.out.println("car1�� �������� �Դϱ�?: "+car1.isStop());
		System.out.println("car1�� �ӵ�: "+car1.getSpeed());
	}

}
