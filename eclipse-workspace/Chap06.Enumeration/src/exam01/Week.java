package exam01;

public enum Week { // ù���ڸ� �빮��
	MONDAY("������"),
	TUESDAY("ȭ����"),
	WEDNESDAY("������"), // �빮�ڷ� �Է�
	THURSDAY("�����"),
	FRIDAY("�ݿ���"),
	SATURDAY("�����"),
	SUNDAY("�Ͽ���");	 // , ����
	
	final private String name;

	private Week(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}
}
