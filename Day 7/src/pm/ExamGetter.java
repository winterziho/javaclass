package pm;

public class ExamGetter {

	public static void main(String[] args) {
		Student student = new Student("John");
		//캡슐화 설정으로 인해 직접 접근 불가능해졌다.
//		System.out.println(student.name);
//		
//		student.name = "Jiho";
//		System.out.println(student.name);
		System.out.println(student.getName());
	}

}

class Student{
	
	private String name;	// private 접근 제한자로 캡슐화 적
	
	Student(String name) {
		this.name = name;
	}
		//Getter 매서드로 변수를 사용할 수 있다.
		String getName() {
			return this.name;
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
	}
}