package every;

public class ExamExam1 {

	public static void main(String[] args) {
		
		ExceptionExam3 ex = new ExceptionExam3();
		int num = ex.get50thItem(new int [100]);
		
		System.out.println("array 배열의 50번째 요소의 값 : " + num);

	}

}
