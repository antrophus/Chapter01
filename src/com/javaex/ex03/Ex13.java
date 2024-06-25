package com.javaex.ex03;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요: ");
		
		int month = sc.nextInt();
		int days;
		
		if((month == 4)||(month == 6)||(month == 9)||(month == 11)) {
		
			days = 30;
			
			
		}else if(month==2) {
			
			days = 28;
		
		}else {
			
			days = 31;
			
		}
			System.out.println(days + "일 입니다.");
		
		sc.close();
		

	}

}
