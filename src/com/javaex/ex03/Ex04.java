package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		/*철수는 편의점에서 아르바이트를 하고 있다.
		 * 8시간까지는 시간당 10000원
		 * 8시간 초과시에는 시간당 12000원을 받는다.
		 * 
		 * 근무시간을 입력받아 임금을 계산하세요.
		 * (단-시간은 고려하지 않는다)*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간: ");
		int time = sc.nextInt();
		int pay;
				
		if(time<=8) {
			pay = time * 10000;
			
		}else {
			pay = 8 * 10000 + (time - 8) *12000;

		}
		
		System.out.println("임금은 " + pay + "원 입니다.");
		
		sc.close();

	}

}
