package HW;

public class Quiz7 {
	public static void main(String[] args) {
		Student stu = new Student("임지호", 27 );
		System.out.println(stu.getName());
		System.out.println(stu.getAge());
	}
}

class Student{
	
	private String name;
	private int age;
	
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
}