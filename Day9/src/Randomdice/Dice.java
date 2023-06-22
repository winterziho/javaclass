package Randomdice;

import java.util.*;

public class Dice {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int[] count = new int[6];
		
		for(int i = 0; i < 100000; i ++) {
		int roll = ran.nextInt(6)+1;
		count[roll-1]++;
		}
		for(int j = 1 ; j < 6; j ++) {
		System.out.println(j+1 + "나온 횟수 : " +count[j]);
			}
	}
}
			
		
		
		
