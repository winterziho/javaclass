package PM;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		
	try {
		
	if(score <= 100 && score >= 0) {
		switch(score/10) {
		case 10 :
			System.out.println("A");
			break;
		case 9 :
			System.out.println("B");
			break;
		case 8 :
			System.out.println("C");
			break;
		case 7 :
			System.out.println("D");
			break;
		case 6 :
			System.out.println("F");
			
		}
	}
	else {
			 throw new IllegalArgumentException("잘못된 점수입니다.");
		}
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}

	
	}
}
