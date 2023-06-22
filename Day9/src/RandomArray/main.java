package RandomArray;

import java.util.Random;

public class main {

	public static void main(String[] args) {
		
		int[] arr = {11, 12, 13, 14, 15, 16, 17, 18, 19 ,10};
		
		Random random = new Random();
		
		System.out.println(arr[random.nextInt(10)]);
		

	}

}
