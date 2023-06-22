package ExRandom;

import java.util.Scanner;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		
		int ran = random.nextInt(100);
		
		while(true) {
			System.out.println("숫자를 입력하세요 : ");
			int num = scanner.nextInt();
			
			if (ran == num) {
				System.out.println("정답입니다.짝짝");
				break;
			}else {
				System.out.println("틀렸습니다.ㅠㅠ");
			}
			
			
			}
	}
}


