package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 { //Ex09 'if-else' 예제를 'switch-case' 조건문으로 변경

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바 2.C 3.C++ 4.파이썬)");
		System.out.print("과목번호: ");
		int lecture = sc.nextInt();
		
		switch(lecture){
			case 1: 
				System.out.println("R101호");
				break;
			case 2:
				System.out.println("R202호");
				break;
			case 3:
				System.out.println("R303호");
				break;
			case 4:
				System.out.println("R404호");
				break;
			default :
				System.out.println("상담원에게 문의하세요");
				break;
							
		}
				
		sc.close();
		
	}

}
