package sec02_filed_declare;

public class TvTest {

	public static void main(String[] args) {

		Tv myTv = new Tv();

		myTv.power = false; // tv 작동여부(true = 작동, false = 꺼짐)) 
		myTv.channel = 6; // tv 채널 6번

		System.out.println("현재 채널: " + myTv.channel + "번");
		System.out.println("현재 전원상태: " + myTv.power);
		System.out.println("TV 색상: " + myTv.color);

	}

}
