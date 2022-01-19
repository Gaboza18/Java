
public class Signprint {

	public static void main(String[] args) {

		int num = -99;
		String numbersign = num > 0 ? "'양수' 입니다." : (num < 0 ? "'음수' 입니다." : "'0' 입니다.");

		System.out.println("입력하신값은 " + numbersign);

	}

}
