package sec03_consturctor_declare;

public class CarTest {

	public static void main(String[] args) {

		Car myCar = new Car("�޸�������", "�����", "����"); // Car(String color, String model)

		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("��: " + myCar.model);
		System.out.println("����: " + myCar.color);

	}

}
