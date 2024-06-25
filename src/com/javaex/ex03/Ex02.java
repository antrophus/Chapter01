package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			//키보드 입력을 위해 키보드 준비
		
		System.out.println("점수를 입력해주세요");
		System.out.print("점수: ");
		
		int point = sc.nextInt();
		
		if(point >= 60) {
			System.out.println("합격입니다.");	//true일때
			
		}else {			
			System.out.println("불합격입니다."); //false일때
		}
		
		sc.close();
		
	}

}
