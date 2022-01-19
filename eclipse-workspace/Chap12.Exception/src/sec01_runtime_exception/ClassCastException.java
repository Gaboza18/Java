package sec01_runtime_exception;

public class ClassCastException { // ���� Ŭ���� �� ��� ���� �ƴҶ� ������ ����ȯ �õ����
	public static void main(String[] args) {

		Dog dog = new Dog();
		changeDog(dog);

		Cat cat = new Cat();
		changeDog(cat);
	}

	public static void changeDog(Animal animal) {
		Dog dog = (Dog) animal;
	}
}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}
