package com.javaex.ex04;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//		
//			System.out.println("숫자를 입력하세요");
//		
//			int num = sc.nextInt();
//		
//				if(num%3==0 && num!=0) {
//				
//					System.out.println("3의 배수입니다.\n");
//				
//				} else if(num%3!=0 &&  num!=0) {
//				
//					System.out.println("3의 배수가 아닙니다.\n");
//				
//				} else if(num==0) {
//		
//					System.out.println("종료");
//								break;
//				}
//			num++;
//
//		}
//		sc.close();
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
		
			System.out.println("숫자를 입력하세요");
			System.out.print("숫자: ");
			int no = sc.nextInt();
			
			if(no==0) {
				System.out.println("종료");
				break;
				
			} else if(no%3==0) {
				System.out.println("3의 배수입니다.\n");
				
			} else {
				System.out.println("3의 배수가 아닙니다.\n");
			}
			
			
		}
		sc.close();
		
		
	}
}
