package pm;

public class ExamSum {

	public static void main(String[] args) {
		// 내가 푼 방식 
//		int []array = {1, 2, 3, 4, 5};
//		
//		int sum = 0;
//		
//		for(int i = 0; i < 5; i ++) {
//			sum += array[i];
//		}
//		System.out.println(sum);

		// 선생님이 푼 방식
		int []array = {1, 2, 3, 4, 5};
		
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		
		System.out.println(sum);
		
	}

}

