package com.javaex.ex01;

public class Ex09 {
	
	public static void main(String[] args) {
		
		double v01 = 5/4;
		System.out.println(v01);
		//1.25[x] - > 1.0 : 정수(+-*/)정수 = 정수 : 정수 사칙연산은 정수로 결과 값이 나옴: 나누기 값 나머지는 버림.
		//정수 / 정수 = 정수 나온 값을 double로 형변환 해서 '실수' 값으로 변환
		/*
		 1) 5/4 -> 1 (정수)/(정수) -> (정수)
		 2) 1을 실수형에 담는다   1 --> 1.0
		*/
		
		double v02 = (double) 5 / 4;
		System.out.println(v02);
		//1.25
		//실수 / 정수 = 강제 형변환 된 실수를 정수로 나눌 수 없기에 정수를 실수로 '자동 형변환' 후 연산 
		/*
		 1)(double)5 --> 5.0
		 2)5.0 / 4 -- > 5.0 / 4.0(자동형변환)
		 3)5.0 / 4.0 --> 1.25
		 4)1.25 --> double
		 */
		
		double v03 = 5 / (double)4 ;
		System.out.println(v03);
		//1.25
		// 상동
		
		
		double v04 = (double)5 /(double)4;
		System.out.println(v04);
		//1.25
		
		int v05 = (int)1.3 + (int)1.8;
		System.out.println(v05);
		//2
		
		int v06 = (int)(1.3 + 1.8);
		System.out.println(v06);
		//3
		
	}

}
