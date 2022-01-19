package sec15.Package_ex1;

import java.util.*; // import 문을 사용하여 다른 Package 클래스 가져온다. , java.util 패키지 내의 모든 클래스를 사용하겠다는 의미

import sec08_method_return.Calculator;

// import 패키지명.클래스명; , import 패키지명 * : 패키지 아래 클래스 다 import 

public class Application {

	public static void main(String[] args) {
		// Student s = new student(); // 같은 패키지에 존재하지 않으므로 사용 불가능하다

		// 패키지명과 함께 타입을 지정해야 사용가능
		sec01_new_class.Student s = new sec01_new_class.Student();
		sec02_filed_declare.Car c = new sec02_filed_declare.Car();
		
		// import 
		
		Calculator call = new Calculator();
	}

}
