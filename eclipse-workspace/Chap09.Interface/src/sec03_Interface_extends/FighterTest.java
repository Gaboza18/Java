package sec03_Interface_extends;

class Unit { // 게임 유닛
	int currentHP; // 유닛 체력
	int x, y; // 위치
}

interface Moveable { // 캐릭터가 움직이는 기능을 인터페이스 구현
	public abstract void move(int x, int y); // 추상 메소드
}

interface Attackable { // 캐릭터가 공격하는 기능을 인터페이스 구현
	public abstract void attack(Unit u);
}

// 2개의 인터페이스를 상속받는 인터페이스 구현, Moveable 메소드, Attackable 메소드 상속

interface Fightable extends Moveable, Attackable {
}

class Tank extends Unit implements Fightable {

	@Override
	public void move(int x, int y) {
		System.out.println("탱크가 " + x + "," + y + " 위치로 이동");
	}

	@Override
	public void attack(Unit u) {
		System.out.println("탱크가 유닛 공격!");
	}
}

public class FighterTest {
	public static void main(String[] args) {

		Tank t = new Tank();
		t.move(10, 10);
		t.attack(new Unit());

	}

}
