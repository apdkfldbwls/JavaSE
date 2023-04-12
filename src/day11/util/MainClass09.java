package day11.util;

import java.util.Random;

public class MainClass09 {
	public static void main(String[] args) {
		int[] lNum = new int[45];
		
		for(int i = 0; i < lNum.length; i++) {
			lNum[i] = i + 1;
		}
		
		Random ran = new Random();
		for(int i = 0; i < lNum.length; i++) {
			int changeIndex = ran.nextInt(45);
			
			int tmp = lNum[i];
			lNum[i] = lNum[changeIndex];
			lNum[changeIndex] = tmp;
		}
		
		// 37 / 10 / 34 / 5 / 3 / 41 / 
		for(int i = 0; i < 6; i++) {
			System.out.print(lNum[i]+" / ");
		}
		
	}

}
