package exam03;

public class LogicalDeny { // ����������
	public static void main(String[] args) {
		
		boolean power = false;
		System.out.println("power= " + power); // false�� ����

		power = !power; // power �ݴ� true������ ��ȯ
		System.out.println("power= " + power); // true�� ����
	}
}