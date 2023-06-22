package ExamDefault;

import ExamPrivate.MyClass;

public class Main {

	public static void main(String[] args) {
		
		Same dsame = new Same();
		System.out.println(dsame.defaultField);
		
		// 객체 생성에는 이상이 없다. 클래스 자체에는 public이 설정 
		// 하지만 필드는 default로 접근제한이 설정되어 호출 불가 
		MyClass myclass = new MyClass();
		// myclass.accessPrivate();
		
	}

}
