package sec02_parent_construnctor_call3;

public class StudentExample {

	public static void main(String[] args) {
		Student st = new Student("ȫ�浿", "96-1221", 100);
		
		System.out.println("�̸�: "+st.getName());
		System.out.println("�ֹι�ȣ: "+st.getSsn());
		System.out.println("�й�: "+st.getStudNo());
		
	}

}
