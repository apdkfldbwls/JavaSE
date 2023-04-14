package day11.util;

import java.util.Random;

public class MainClass09 {
	public static void main(String[] args) {
		// 45크기 배열생성
		int[] lNum = new int[45];
		
		// 1부터 45까지 배열이 저장
		for(int i = 0; i < lNum.length; i++) {
			lNum[i] = i + 1;
		}
		
		// 난수생성 객체 
		Random ran = new Random();
		for(int i = 0; i < lNum.length; i++) {
			// 0~44까지 숫자중 임의값 반환
			int changeIndex = ran.nextInt(45);
			
			// 스와핑
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
