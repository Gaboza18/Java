package Exam2;

public class Student {

	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() { // 국어+영어+수학 점수 합계 저장하는 메소드
		return kor + eng + math;
	}

	float getAverage() { // 평균
		float avg = (int) (getTotal() / 3.0f) * 1000 / 1000.0f;
		// (합계/3)x10^2 / 10^2 지수:소수점 아래 n자리 까지 표시
		return avg; // 평균값 리턴
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}
