package sec15.Package_ex1;

import java.util.*; // import ���� ����Ͽ� �ٸ� Package Ŭ���� �����´�. , java.util ��Ű�� ���� ��� Ŭ������ ����ϰڴٴ� �ǹ�

import sec08_method_return.Calculator;

// import ��Ű����.Ŭ������; , import ��Ű���� * : ��Ű�� �Ʒ� Ŭ���� �� import 

public class Application {

	public static void main(String[] args) {
		// Student s = new student(); // ���� ��Ű���� �������� �����Ƿ� ��� �Ұ����ϴ�

		// ��Ű����� �Բ� Ÿ���� �����ؾ� ��밡��
		sec01_new_class.Student s = new sec01_new_class.Student();
		sec02_filed_declare.Car c = new sec02_filed_declare.Car();
		
		// import 
		
		Calculator call = new Calculator();
	}

}
