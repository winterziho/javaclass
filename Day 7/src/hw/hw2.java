package hw;


public class hw2 {

	public static void main(String[] args) {
		
		System.out.println(num(1, 2));
		System.out.println("입력하신 세개의 숫자 중 최소값은 " + num(7, 5, 8) + "입니다.");

	}
	static int num (int a, int b) {
		
		int no = a > b ? a : b;
		return no;
		
	}
	
	static int num (int  a, int b, int c) {
		
		int min = a;
		
		if(min > b) min = b;
		
		if ( min > c) min = c;
		
		return min;
	
	}
}
