package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) {
		
		//초기화  증감식  조건식
		
		int i = 0; // 초기화
		 
		while(i<5) { // 조건식
			// 조건식이 true 면 실행 영역 안에서 계속 돌아감 : t||f 결론이 나올 수 있는 식을 조건식으로 넣음
			System.out.println("I Like java"+ i );
			
			i++; // 증감식
			
		}
		// 조건식이 false 면 실행 영역에서 빠져나옴
		

	}

}
