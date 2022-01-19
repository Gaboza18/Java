package exam01;

public enum Week { // 첫글자만 대문자
	MONDAY("월요일"),
	TUESDAY("화요일"),
	WEDNESDAY("수요일"), // 대문자로 입력
	THURSDAY("목요일"),
	FRIDAY("금요일"),
	SATURDAY("토요일"),
	SUNDAY("일요일");	 // , 생략
	
	final private String name;

	private Week(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}
}
