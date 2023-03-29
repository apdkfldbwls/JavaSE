package day06.oop;
/*
 * [[ OOP(Object Oriented Programming) ]]
 * 	- 객체지향 프로그래밍
 * 	- 프로그램을 작성할 때 데이터와 데이터를 조작하는 메소드(함수)를
 * 	 하나의 논리적 단위인 객체로 묶는 방식
 * 
 * [[ 객체(Object) ]]
 *  - 물리적으로 존재하거나 추상적으로 생각할 수 있는것 중에서
 *   정의가능하고 식별 가능한것을 말한다.
 *  
 *  예) 물리적인것 - 사람, 모니터, 컴퓨터, 학생, 회원
 *     추상적인것 - 주문, 회계장부, 생산 등..
 *     
 * [[ Class ]]
 * 	- 객체를 만들기 위한 설계도 
 *  - Class에 작성된 코드를 읽어 인스턴스(객체)화 한다 => 메모리에 올린다!!
 * 	예) 와플기계
 * 
 * 	클래스 구조
 *  (접근제어자) class 클래명 (extends 상속) (implements 인터페이스상속) { // 클래스 선언부
 *  	(생성자) => 초기화
 *  	변수(멤버변수, 멤버필드) => 속성
 *  	메소드(멤버메소드) => 기능
 *  }
 *  
 *  객체화 - new 연산자로 인스턴스화 가능!
 *  클래스명(타입) 변수명 = new 클래스명();
 * 
 *  
 * 
 */

// import 단축키 -> Ctrl + Shift + O
import day06.mypac.Card;


public class MainClass01 {
	public static void main(String[] args) {
		Card card = new Card();
		Card card2 = new Card();
		// 변경 전
		System.out.println("card type : "+card.type);
		System.out.println("card number : "+card.number);
		System.out.println("card2 type : "+card2.type);
		System.out.println("card2 number : "+card2.number);
		
		System.out.println("card width : "+card.width);
		System.out.println("card2 width : "+card2.width);
		
		
		card.number = "10";
		card.width = 72;
		// 변경 후
		System.out.println(card.number);
		System.out.println(card2.number);
		
		System.out.println("card width : "+card.width);
		System.out.println("card2 width : "+card2.width);
		
		
		
		
	}
}









