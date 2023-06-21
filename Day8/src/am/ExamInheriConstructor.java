package am;

public class ExamInheriConstructor {

	public static void main(String[] args) {
		Parent4 parent4 = new Parent4();
		Child4 child4 = new Child4();
		

	}

}

class Parent4 {
	Parent4(){
		System.out.println("Parent Constructor");
	}
}
class Child4 extends Parent4 {
	Child4() {
		System.out.println("Child Constructor");
	}
}