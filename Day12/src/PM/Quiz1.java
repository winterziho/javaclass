package PM;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
				System.out.print("숫자를 입력하세요 : ");
				int num = scanner.nextInt();
				double result = 1 / num ; 
				System.out.println(result);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}

}
