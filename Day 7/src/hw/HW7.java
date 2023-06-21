package hw;


public class HW7 {

	public static void main(String[] args) {
		
		Student2 student = new Student2();
		
		student.setName(27);
		System.out.println(student.getName());

	}
}
	
class Student2 {
	private int age;

	public  int getName() {
		return age;
	}

	public void setName(int age) {
		this.age = age;
	}
}
	
	



