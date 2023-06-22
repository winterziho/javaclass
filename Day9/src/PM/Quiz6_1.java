package PM;

import java.util.*;

public class Quiz6_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 A를 입력하세요 : ");
		int x = scanner.nextInt();
		
		System.out.println("정수 B를 입력하세요 : ");
		int y = scanner.nextInt();
		
		
		int temp;
		
		if(x > y ) {
			temp = x;
			x = y;
			y = temp;
		}
		
		int num = y - x + 1;
		
		for(int i = 0; i < num; i ++) {
			System.out.println(x+i);
		}

	}

}
