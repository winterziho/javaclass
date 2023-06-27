package PM;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
	try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if ( age >= 18) System.out.println("성인입니다.");
		else if (age < 0) throw new IllegalArgumentException("잘못된 나이입니다.");
		else System.out.println("민짜입니다.");
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}

	
	}
}
