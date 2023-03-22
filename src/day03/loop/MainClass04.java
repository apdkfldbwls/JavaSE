package day03.loop;
/*

*
**
***
****
*****
******
*******

반복문 조건문 연습
 주말숙제 2중for문 코드 분석하기 
 
2번
   *
  **
 ***
****

3번
   *
  ***
 *****
******* 
  
4번
   *
  ***
 *****
*******
 *****
  ***
   *


   ☆
   *
  ***
 *****
******* 
  | | Merry Christmas~*

 
 */

public class MainClass04 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 7; i++) {
			System.out.print(i+": ");
			for(int j = 0; j < i+1; j++) { 
				System.out.print("*");
			}
			
			System.out.println();	// 개행
		}
	}

}
