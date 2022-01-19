package sec01_runtime_exception;

public class ClassCastException { // 같은 클래스 및 상속 관계 아닐때 강제로 형변환 시도경우
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
