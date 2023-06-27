package every;

public class ExceptionallExam {
	public static void main(String[] args) {
		
	try {
		int[] array = new int[10];
		array[20] = 5;
	}	catch(Exception e) {
		System.out.println("예외가 발생했습니다 " + e.toString());
	}
	}
}
