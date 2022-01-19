package sec02.nested_class_member_access;

/*
 *  �ν��Ͻ� �������, static ������� ���� ����Ŭ�������� 
 *  ��� ���Ǵ��� Ȯ��
 */
public class InnerEx2 {
	private int outerLv = 0;
	static int outerCv = 0;

	// �ν��Ͻ� ���� Ŭ���� ���� �ܺκ���(�ν��Ͻ�, static)�� ���
	class InstanceInner {
		int iiv = outerLv; // private �̳� Ŭ���� ���� Ŭ���� �̱� ������ ��밡��
		int iiv2 = outerCv;
	}

	// static ���� Ŭ�������� �ܺκ����� ���
	static class StaticInner {
		// int siv = outerLv; // �ܺ� Ŭ������ �ν��Ͻ� ����� ���ٺҰ���
		static int scv = outerCv; // static ����
	}

	void myMethod() {
		int lv = 0;
		final int LV = 0;

		class LocalInner {
			int liv = outerLv;
			int liv2 = outerCv;
			int liv3 = lv;
			int liv4 = LV;
		}
	}
}