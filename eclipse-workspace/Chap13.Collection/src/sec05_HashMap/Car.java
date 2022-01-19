package sec05_HashMap;

import java.util.*;

public class Car {

	public int speed;
	public String name;

	public Car(int speed, String name) {
		this.speed = speed;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Car) {
			Car car = (Car) obj;

			return (this.speed == car.speed) && (this.name.equals(car.name));
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", name=" + name + "]";
	}

}
