package sec04_filed_init;

class Korean {
	String nation = "���ѹα�";
	String name;
	String birthday;

	public Korean(String name, String birthday) {
		this.name = name; // this = �ڽ��� ��ü�� �����ϴ� ����
		this.birthday = birthday;
	}
}

public class KoreanTest { // class�� ������ ��������, public Ŭ������ 1��, Ŭ�������� ���� ��ġ

	public static void main(String[] args) {

		Korean K1 = new Korean("�̼���", "230114");
		
		System.out.println("����: " + K1.nation);
		System.out.println("�̸�: " + K1.name);
		System.out.println("����: " + K1.birthday);
		
		System.out.println("");
		
		Korean K2 = new Korean("������", "010301");
		
		System.out.println("����: " + K2.nation);
		System.out.println("�̸�: " + K2.name);
		System.out.println("����: " + K2.birthday);
		
		System.out.println("");
		
		Korean K3 = new Korean("���ȯ", "001122");
		
		System.out.println("����: " + K3.nation);
		System.out.println("�̸�: " + K3.name);
		System.out.println("����: " + K3.birthday);
	}

}
