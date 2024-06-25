package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수: ");
		
		int point = sc.nextInt();
		
		if(point > 60) {					  // if(조건식 : true, false 로 출력되는 값)
			System.out.println("합격입니다.");   // 조건식이 true 이면 실행되는 영역
		
		} 
		
						
		sc.close();
		

	}

}
