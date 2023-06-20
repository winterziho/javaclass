package pm;

public class ExamQuiz3 {
	public static void main(String[] args) {
		
		Person person = new Person("JIho", 20, "korea");
		System.out.println(person.name);
		System.out.println(person.age);
		System.out.println(person.national);
		
		Person person2 = new Person("Austin", 20);
		System.out.println(person2.name);
		System.out.println(person2.age);
		System.out.println(person2.national);

		Person person3 = new Person("Lim");
		System.out.println(person3.name);
		System.out.println(person3.age);
		System.out.println(person3.national);
		
		
	}
}

class Person {
	
	String name;
	int age;
	String national;
	
	Person(String name, int age, String national) {
		
		this.name = name;
		this.age = age;
		this.national = national;
		
		
	}
	
	Person(String name, int age){
		
		this.name = name;
		age = age;
		national = "korea";
//		this(name, age, "korea");
		
	}
	
	Person(String name){
//		this.name = name;
//		this.age = 0;
//		national = "korea";
		this(name, 0, "korea");
	}
}