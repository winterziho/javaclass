package am;

public class ExamMethodStatic {

	public static void main(String[] args) {
		
		System.out.println(StaticMethod.add(1, 2));

	}

}

class StaticMethod{
	
	static int add(int a, int b) {
		
		int c = a + b;
		
		return c;
	}
}
