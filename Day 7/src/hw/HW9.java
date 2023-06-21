package hw;

public class HW9 {
	public static void main(String[] args) {
	
		Person person = new Person("Jiho", 27, "Korea");
		System.out.println(person.name);
		System.out.println(person.age);
		System.out.println(person.nationality);
		
		Person person2 = new Person("Jiho", 27);
		System.out.println(person2.name);
		System.out.println(person2.age);
		System.out.println(person2.nationality);
		
		Person person3 = new Person("Jiho");
		System.out.println(person3.name);
		System.out.println(person3.age);
		System.out.println(person3.nationality);
}
	
}

class Person {
	
	String name;
	int age;
	String nationality;
	
	Person(String name, int age, String nationality){
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
		this.nationality = "Korea";
	}
	Person(String name){
		this.name = name;
		this.age = 27;
		this.nationality = "Korea";
	}
}
