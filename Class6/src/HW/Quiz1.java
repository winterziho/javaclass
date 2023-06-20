package HW;

public class Quiz1 {

	public static void main(String[] args) {
		
		 int[] array = {10, 20, 30, 40, 50};
		 int max = array[0];
		 
		 for(int i = 1; i < 5; i ++) {
			 
			 if(max < array[i]) {
			 max = array[i];
		 }
		 }
		 System.out.println(max);
	}
}