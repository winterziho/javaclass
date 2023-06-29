package pm;

public class Summ {

	public static void main(String[] args) {
		
		int[] arr = {11, 12, 10, 9, 13};
		int sum = 0;
		
		for(int i = 0; i < 5; i ++) {
			sum += arr[i];
		}
		
		System.out.println(sum);

	}

}
