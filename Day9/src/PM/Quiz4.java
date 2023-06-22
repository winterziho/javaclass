package PM;

import java.util.*;

public class Quiz4 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scanner = new Scanner(System.in);
		Scan();
		Rannum();
	}
	
	
	public static int Scan() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("몇개의 난수를 생성할까요 ?");
		int num =  scanner.nextInt();
		
		return num;
	}
	
	public static void Rannum() {
		Random ran = new Random();
		int a = Scan();
		int[] arr = new int[a];
		for (int i = 0; i < Scan(); i ++) {
			arr[i] = ran.nextInt(100);
		}
		for(int j : arr) {
			System.out.println(j);
		}
	}
}
