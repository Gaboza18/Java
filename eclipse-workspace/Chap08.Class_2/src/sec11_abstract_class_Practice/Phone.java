package sec11_abstract_class_Practice;

public abstract class Phone {

	public String owner;

	public Phone(String owner) {
		this.owner = owner;
	}

	public void turnOn() {
		System.out.println("���� 'on'");
	}

	public void turnOff() {
		System.out.println("���� 'off'");
	}
}
