package AM;

public class TryExam1 {
	
	public static void main(String[] args) {
		
		try {
		int result = 10 / 0;
		System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("예외가 발생했습니다.");
		}
	}
}
