package pm;

public class ExamStatic {
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.bark();
		
		Croc.bark();
		// Cat.bark(); error : Cat 클래스의 메서드에는 static이 없기 때문 
		
	}
}

class Cat{
	
	void bark() {
		System.out.println("Meeu!!!");
	}
	
}

class Croc {
	static void bark() {
		System.out.println("peeu!!!");
	}
}