package sec11_abstract_class;

abstract class Animal { // 추상클래스 선언: abstract class 클래스 이름 { }
	int legs; // 필드

	Animal(int legs) { // 생성자
		this.legs = legs;
	}

	public abstract void move(); // 메소드 선언 메소드 끝 ; 붙힌다.

	public abstract void eat();
}

class Spider extends Animal { // 기본 생성자 미생성

	public Spider() {
		super(8); // 다리 개수
	}

	@Override
	public void move() { // 재정의된 메소드
		System.out.printf("거미는 %d개의 다리를 이용하여 움직인다.\n", legs);
	}

	@Override
	public void eat() {
		System.out.println("거미는 곤충을 잡아먹습니다.");
	}
}

class Cat extends Animal {
	public String name;

	public Cat() {
		super(4);
	}

	public Cat(String name) {
		super(4);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void move() {
		System.out.printf("고양이는 %d개의 다리를 이용하여 움직인다.\n", legs);

	}

	@Override
	public void eat() {
		System.out.println("고양이는 쥐를 잡아먹습니다.");

	}

}

class Fish extends Animal {

	public String name;

	public Fish() {
		super(0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void move() {
		System.out.printf("생선은 지느러미로 헤엄친다.\n");

	}

	@Override
	public void eat() {
		System.out.println("생선은 작은 물고기를 잡아먹습니다.");

	}
}

public class AnimalTest {
	public static void main(String[] args) {

		Fish d = new Fish();
		Cat c = new Cat("나비");
		Animal a = new Fish(); // 조상의 참조변수 = 자손 객체
		Animal e = new Spider();

		d.setName("고등어");
		System.out.println("물고기 이름: " + d.getName());
		d.eat();
		d.move();
		System.out.println();

		System.out.println("고양이 이름: " + c.getName());
		c.eat();
		c.move();
		System.out.println();

		// a.setName(); // Animal 클래스에는 setName()이 없으므로 사용 불가능
		((Fish) a).setName("갈치");
		System.out.println("물고기 이름: " + ((Fish) a).getName());
		((Fish) a).eat();
		((Fish) a).move();
		System.out.println();

		((Spider) e).eat();
		((Spider) e).move();

	}

}
