package com.javaex.ex01;

public class Ex07 {
	public static void main(String[] args) {
		/*
		 * //상수 : 변경 할 수 없는 고정값(관례상 대문자로 표기)
		 * 
		 * //일반적인 방식 double pi = 3.14;
		 * 
		 * double result01 = pi*5*5;
		 * 
		 * System.out.println(result01);
		 * 
		 * //pi 값 변경 가능 pi= 3.1415926; double result02 = pi*5*5;
		 * System.out.println(result02);
		 */
		//////////////////////////////////////////////////////////
		
		final double PI = 3.14;
		double result03 = PI*5*5;
		System.out.println(result03);
		
		//PI 값 변경 불가
		// PI = 3.1415926; 상수로 선언되어 바꿀 수 없음
		
		
		/*
		 * int num1 = 1; float num2 = 1.0f; double result = num1 + num2;
		 * 
		 * System.out.println(result);
		 */
		
		int i = 5;
		int s = 1;
		int result01 = i * s;		
		System.out.println(result01);
		
		s = 100;
		result01 = i + s;
		System.out.println(result01);
		
		
		int x;
		
		x=1;
		
		int result99 = 4*x;
		System.out.println(result99);
		
	}

}
