package CellPhone_inheritance;

public class DmbCellPhoneExample {
	public static void main(String[] args) {

		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10); // DmbCellPhone 객체 생성

		System.out.println("모델: " + dmbCellPhone.model); // CellPhone 으로 부터 상속받은 필드
		System.out.println("색상: " + dmbCellPhone.color); // CellPhone 으로 부터 상속받은 필드
		System.out.println("채널: " + dmbCellPhone.channel); // DmbCellPhone 필드
		
		dmbCellPhone.powerOn(); // 전원을 켭니다.
		dmbCellPhone.bell(); // 벨이 울립니다.
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.reciveVoice("네 홍길순 입니다.");
		dmbCellPhone.sendVoice("아 반갑습니다 홍길동 입니다.");
		dmbCellPhone.handUp(); // 전화 끊습니다.
	}

}
