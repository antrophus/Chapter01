package com.javaex.ex01;

public class Ex12 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		
		System.out.println("&&연산자---------");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("||연산자------------");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("!연산자-----------------");
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println("응용-----------------");
		
		boolean result = a<b && a>b; 
		System.out.println(result);
		
		System.out.println(true && false || true); // T&&F -> F, F || T -> T : 결과는 T
		System.out.println(true || false || true); // T||F -> T, T || T -> T : 결과는 T
		
		double result00 = 48/2*(9+3);
		System.out.println(result00);
	}

}
