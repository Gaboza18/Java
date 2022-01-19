package Exercise4;

class Animal {
	public void makeNoise() {
		System.out.println("동물이 짖는 소리");
		System.out.println();
	}
}

class Dog extends Animal {
	public void makeNoise() {
		System.out.println("강아지 짖는소리: 멍멍");
		System.out.println();
	}
}

class Cat extends Animal {
	public void makeNoise() {
		System.out.println("고양이 짖는소리: 야옹");
		System.out.println();
	}
}

class BigDog extends Animal {
	public void makeNoise() {
		System.out.println("대형견 짖는소리: 왕왕");
		System.out.println();
	}
}

public class Polymorphism_Exercise {
	public static void main(String[] args) {

		Animal ani1 = new Animal();
		ani1.makeNoise();

		Dog dog1 = new Dog();
		dog1.makeNoise();

		Cat cat1 = new Cat();
		cat1.makeNoise();

		BigDog bigDog1 = new BigDog();
		bigDog1.makeNoise();

		// 다형성 사용
		Animal animal1 = new Cat();
		animal1.makeNoise();

		Animal animal2 = new Dog();
		animal2.makeNoise();

		Animal animal3 = new BigDog();
		animal3.makeNoise();

		Animal animal4 = new Animal();
		animal4.makeNoise();

		// Downcast(조상타입 -> 자손타입 형변환 생략 불가능)
		Dog dog2 = (Dog) animal2;
		dog2.makeNoise();

		BigDog bigDog2 = (BigDog) animal3;
		bigDog2.makeNoise();
		
		Cat cat2 = (Cat) animal1;
		cat2.makeNoise();

		// 조상 타입으로 객체가 생성되어 있을 때
		Animal animal5 = new Animal();
		//Dog dog3 = (Dog) animal5; // 타입변환 불가능(실행시 에러)
		//dog3.makeNoise();

	}

}
