package Exercise4;

class Animal {
	public void makeNoise() {
		System.out.println("������ ¢�� �Ҹ�");
		System.out.println();
	}
}

class Dog extends Animal {
	public void makeNoise() {
		System.out.println("������ ¢�¼Ҹ�: �۸�");
		System.out.println();
	}
}

class Cat extends Animal {
	public void makeNoise() {
		System.out.println("����� ¢�¼Ҹ�: �߿�");
		System.out.println();
	}
}

class BigDog extends Animal {
	public void makeNoise() {
		System.out.println("������ ¢�¼Ҹ�: �տ�");
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

		// ������ ���
		Animal animal1 = new Cat();
		animal1.makeNoise();

		Animal animal2 = new Dog();
		animal2.makeNoise();

		Animal animal3 = new BigDog();
		animal3.makeNoise();

		Animal animal4 = new Animal();
		animal4.makeNoise();

		// Downcast(����Ÿ�� -> �ڼ�Ÿ�� ����ȯ ���� �Ұ���)
		Dog dog2 = (Dog) animal2;
		dog2.makeNoise();

		BigDog bigDog2 = (BigDog) animal3;
		bigDog2.makeNoise();
		
		Cat cat2 = (Cat) animal1;
		cat2.makeNoise();

		// ���� Ÿ������ ��ü�� �����Ǿ� ���� ��
		Animal animal5 = new Animal();
		//Dog dog3 = (Dog) animal5; // Ÿ�Ժ�ȯ �Ұ���(����� ����)
		//dog3.makeNoise();

	}

}
