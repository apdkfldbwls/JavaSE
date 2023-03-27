package day03.loop;

import java.util.Iterator;

/*

0:   *
1:  ***
2: *****
3:*******
4: *****
5:  ***
6:   *



*/
public class HomeWork {
	public static void main(String[] args) {

		for (int i = 0; i < 7; i++) {
			System.out.print(i + ":");
			for (int j = 0; j < 7; j++) {
				if (i < 3 - j || j - i > 3 || i - j > 3 || i + j > 9)  {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println(); // °³Çà
		}
	}
}
