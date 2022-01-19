package sec02_parent_construnctor_call3;

public class StudentExample {

	public static void main(String[] args) {
		Student st = new Student("홍길동", "96-1221", 100);
		
		System.out.println("이름: "+st.getName());
		System.out.println("주민번호: "+st.getSsn());
		System.out.println("학번: "+st.getStudNo());
		
	}

}
