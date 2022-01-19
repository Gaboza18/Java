package GetterSetter_Practice;

public class Getter_Setter_Practice {
	
	private int speed;
	private boolean stop;
	
	public Getter_Setter_Practice(int speed, boolean stop) { // 객체 생성시 멤버 초기화
		this.speed = speed;
		this.stop = stop;
	}

	public int getSpeed() { /* getSpeed() 객체를 생성하는 이유: speed 값이 기본 int값이 아닌 private로 고정된 값으로
	 						   선언 했기 떄문에 직접값을 가져올수 없기 때문에 get이라는 객체에 값을 저장한다	*/ 		 
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
