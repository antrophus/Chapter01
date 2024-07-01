package com.javaex.ex05;

public class Ex05 {
	
	//배열을 사용하여 1 ~ 45 까지의 숫자 중 임의의 수 6개의 숫자를 출력하세요

	public static void main(String[] args) {
		
		int[] noArr = new int[6];
				
		//입력
		for(int i = 0; i<noArr.length; i++) {
		
			noArr[i] = (int)(Math.random()*45)+1;
			
		}
		
		//출력
		for(int i = 0; i<noArr.length; i++) {
		System.out.println(noArr[i]);
		}
		
		
	
	}

}
