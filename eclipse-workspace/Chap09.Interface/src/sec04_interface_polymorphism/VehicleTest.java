package sec04_interface_polymorphism;

public class VehicleTest { // 다형성

	public static void main(String[] args) {

		Vehicle v1 = new Bus(); // 인터페이스(조상) = new 자손();
		v1.run();
		
		Vehicle v2 = new Taxi();
		v2.run();

	}

}
