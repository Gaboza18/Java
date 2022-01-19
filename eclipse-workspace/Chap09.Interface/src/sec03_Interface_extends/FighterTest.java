package sec03_Interface_extends;

class Unit { // ���� ����
	int currentHP; // ���� ü��
	int x, y; // ��ġ
}

interface Moveable { // ĳ���Ͱ� �����̴� ����� �������̽� ����
	public abstract void move(int x, int y); // �߻� �޼ҵ�
}

interface Attackable { // ĳ���Ͱ� �����ϴ� ����� �������̽� ����
	public abstract void attack(Unit u);
}

// 2���� �������̽��� ��ӹ޴� �������̽� ����, Moveable �޼ҵ�, Attackable �޼ҵ� ���

interface Fightable extends Moveable, Attackable {
}

class Tank extends Unit implements Fightable {

	@Override
	public void move(int x, int y) {
		System.out.println("��ũ�� " + x + "," + y + " ��ġ�� �̵�");
	}

	@Override
	public void attack(Unit u) {
		System.out.println("��ũ�� ���� ����!");
	}
}

public class FighterTest {
	public static void main(String[] args) {

		Tank t = new Tank();
		t.move(10, 10);
		t.attack(new Unit());

	}

}
