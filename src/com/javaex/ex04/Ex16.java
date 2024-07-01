package com.javaex.ex04;

public class Ex16 {

	public static void main(String[] args) {
		
//		int num = (int)(Math.random()*6)+1;
//		
//		System.out.println(num);
		
		/*1~45까지의 숫자중 임의의 6개의 숫자를 출력하세요*/
		
		
		for (int  i = 0 ; i < 6 ; i++) {
			int lotto = (int)(Math.random()*45)+1;
			
			System.out.print(lotto);
			System.out.print("\t");
		}
		

	}

}
