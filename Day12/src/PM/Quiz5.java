package PM;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 1를 입력하세요 : ");
		String num1 = sc.nextLine();
		if("null".equals(num1)) throw new IllegalArgumentException("입력된 숫자가 없습니다.");
		System.out.print("숫자 1를 입력하세요 : ");
		String num2 = sc.nextLine();
		if("null".equals(num2)) throw new IllegalArgumentException("입력된 숫자가 없습니다.");
		System.out.print("숫자 1를 입력하세요 : ");
		String num3 = sc.nextLine();
		if("null".equals(num3)) throw new IllegalArgumentException("입력된 숫자가 없습니다.");
		
		
	try {


		
		int tnum1 = Integer.parseInt(num1);
		int tnum2 = Integer.parseInt(num2);
		int tnum3 = Integer.parseInt(num3);
		
		int temp = Math.max(tnum1,  Math.max(tnum2, tnum3));
		
		System.out.println("최댓값 : " + temp);
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}

	
	}
}
