package sec02_filed_declare;

public class TvTest {

	public static void main(String[] args) {

		Tv myTv = new Tv();

		myTv.power = false; // tv �۵�����(true = �۵�, false = ����)) 
		myTv.channel = 6; // tv ä�� 6��

		System.out.println("���� ä��: " + myTv.channel + "��");
		System.out.println("���� ��������: " + myTv.power);
		System.out.println("TV ����: " + myTv.color);

	}

}
