package sec04_interface_polymorphism;

public class VehicleTest { // ������

	public static void main(String[] args) {

		Vehicle v1 = new Bus(); // �������̽�(����) = new �ڼ�();
		v1.run();
		
		Vehicle v2 = new Taxi();
		v2.run();

	}

}
