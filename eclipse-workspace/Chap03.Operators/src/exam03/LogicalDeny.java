package exam03;

public class LogicalDeny { // 논리부정연산
	public static void main(String[] args) {
		
		boolean power = false;
		System.out.println("power= " + power); // false값 대입

		power = !power; // power 반대 true값으로 변환
		System.out.println("power= " + power); // true값 대입
	}
}