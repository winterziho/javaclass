package PM;

import java.util.*;
public class Quiz7 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scanner = new Scanner(System.in);
		
	
		
		while(true) {
			
			int x = ran.nextInt(10) + 1;
			int y = ran.nextInt(10) + 1;
			int z = ran.nextInt(10) + 1;
			
		int sum = 0;
		int num = ran.nextInt(4);
		
		switch(num) {
		case 0 :
			System.out.print(x +" + "+ y +" + "+ z);
			sum = x + y + z;
			break;
		case 1 :
			System.out.print(x+" - "+ y+" + "+ z);
			sum = x - y + z;
			break;
		case 2 :
			System.out.print(x+" + "+ y+" - "+ z);
			sum = x + y - z;
			break;
		case 3 :
			System.out.print(x+" - "+ y+ " - "+ z);
			sum = x - y + z;
			break;
		}
		
		System.out.print("=");
		int sum2 = scanner.nextInt();
		
		if (sum == sum2) {
			System.out.println("다시한번 ?<Yes...1/No...0> :");
			int yn = scanner.nextInt();
			
			if(yn == 0) {
				break;
			}
			
		}else {
			System.out.println("틀렸습니다!");
		}
		
		
	
		
	}
	}
}
