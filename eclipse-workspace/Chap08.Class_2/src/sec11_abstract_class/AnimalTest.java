package sec11_abstract_class;

abstract class Animal { // �߻�Ŭ���� ����: abstract class Ŭ���� �̸� { }
	int legs; // �ʵ�

	Animal(int legs) { // ������
		this.legs = legs;
	}

	public abstract void move(); // �޼ҵ� ���� �޼ҵ� �� ; ������.

	public abstract void eat();
}

class Spider extends Animal { // �⺻ ������ �̻���

	public Spider() {
		super(8); // �ٸ� ����
	}

	@Override
	public void move() { // �����ǵ� �޼ҵ�
		System.out.printf("�Ź̴� %d���� �ٸ��� �̿��Ͽ� �����δ�.\n", legs);
	}

	@Override
	public void eat() {
		System.out.println("�Ź̴� ������ ��ƸԽ��ϴ�.");
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
		System.out.printf("����̴� %d���� �ٸ��� �̿��Ͽ� �����δ�.\n", legs);

	}

	@Override
	public void eat() {
		System.out.println("����̴� �㸦 ��ƸԽ��ϴ�.");

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
		System.out.printf("������ �������̷� ���ģ��.\n");

	}

	@Override
	public void eat() {
		System.out.println("������ ���� ����⸦ ��ƸԽ��ϴ�.");

	}
}

public class AnimalTest {
	public static void main(String[] args) {

		Fish d = new Fish();
		Cat c = new Cat("����");
		Animal a = new Fish(); // ������ �������� = �ڼ� ��ü
		Animal e = new Spider();

		d.setName("����");
		System.out.println("����� �̸�: " + d.getName());
		d.eat();
		d.move();
		System.out.println();

		System.out.println("����� �̸�: " + c.getName());
		c.eat();
		c.move();
		System.out.println();

		// a.setName(); // Animal Ŭ�������� setName()�� �����Ƿ� ��� �Ұ���
		((Fish) a).setName("��ġ");
		System.out.println("����� �̸�: " + ((Fish) a).getName());
		((Fish) a).eat();
		((Fish) a).move();
		System.out.println();

		((Spider) e).eat();
		((Spider) e).move();

	}

}
