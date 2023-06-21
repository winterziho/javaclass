package am;

public class ExamOverriding {

	public static void main(String[] args) {
		
		Parent2 parent = new Parent2();
		parent.sayHello();
		Child2 child = new Child2();
		child.sayHello();
		child.sayHi();

	}

}

class Parent2{
	void sayHello() {
		System.out.println("Hello from Parent Class");
	}
}

class Child2 extends Parent2{
	void sayHi() {
		System.out.println("Hi from Child Class");
	}
	@Override	//@는 컴퓨터가 읽는 주
	void sayHello() {
		System.out.println("Hello from Child Class");
	}
}