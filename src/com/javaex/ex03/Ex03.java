package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		System.out.print("숫자: ");
		
		int point = sc.nextInt();
		
//		if(point>0) {
//			System.out.println("양수 입니다.");
//			
//		} else if(point<0) {
//			System.out.println("음수 입니다.");
//			
//		} else if(point == 0) { //else :명확하게 else 값이 정해져 있을 때는 else if문을 else로 처리해도 된다.
//			System.out.println("0 입니다.");
//			
//		} else {
//			System.out.println("알 수 없음");
//		}
		if(point>0) {
			System.out.println("양수 입니다.");
			
		} else if(point<0) {
			System.out.println("음수 입니다.");
			
		} else {
			System.out.println("0 입니다.");			
		
		}

		sc.close();
		
	}

}
