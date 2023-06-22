package ExamPrivate;

public class ExamPrivate {
	
	
	public static void main(String[] args) {
		
		MyClass myClass = new MyClass();
//		System.out.println(myClass.privateFiled);
		
		// private 접근자로 인해 직접 호출이 불가능함으로 
		// 매서드를 통해서 간접 호출하여 사용하게 된다. 
		myClass.accessPrivate();
	}

}
