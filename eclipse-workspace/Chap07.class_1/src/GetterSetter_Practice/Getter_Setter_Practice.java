package GetterSetter_Practice;

public class Getter_Setter_Practice {
	
	private int speed;
	private boolean stop;
	
	public Getter_Setter_Practice(int speed, boolean stop) { // ��ü ������ ��� �ʱ�ȭ
		this.speed = speed;
		this.stop = stop;
	}

	public int getSpeed() { /* getSpeed() ��ü�� �����ϴ� ����: speed ���� �⺻ int���� �ƴ� private�� ������ ������
	 						   ���� �߱� ������ �������� �����ü� ���� ������ get�̶�� ��ü�� ���� �����Ѵ�	*/ 		 
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	

}
