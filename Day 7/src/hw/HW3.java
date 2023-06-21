package hw;

public class HW3 {

	public static void main(String[] args) {
		
		System.out.println(test(6));

	}
	
	public static String test(int num) {
		
		String x = num % 2==0 ? "even" : "odd";
		return x;
	}

}
