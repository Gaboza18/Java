package sec03_consturctor_declare;

public class Car {
	String company;
	String model;
	String color;

	int maxspeed = 250;
	int speed;

	// »ý¼ºÀÚ
	Car(String company, String color, String model) {
		this.company = company;
		this.color = color;
		this.model = model;
	}
}
