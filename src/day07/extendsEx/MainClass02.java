package day07.extendsEx;

import day07.mypac.Jindo;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("메인메소드 진도 생성!!!");
		Jindo jindo = new Jindo();
		System.out.println(jindo.owner);
		jindo.special();
	}

}
