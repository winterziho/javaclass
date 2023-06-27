package PM;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("더할 정수 1를 입력하세요 : ");
			int num = sc.nextInt();
			
			if (num == 0) {
				throw new IllegalArgumentException("예외가 발생했습니다.");
			}
			
			System.out.println("더할 정수 2를 입력하세요 : ");
			int num2 = sc.nextInt();
			
			if (num2 == 0) {
				throw new IllegalArgumentException("예외가 발생했습니다.");
			}
			int sum = num + num2;
			
			System.out.println(sum);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
