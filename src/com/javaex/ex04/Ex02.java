package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		/*숫자를 입력받아 입력한 순자(단)의 구구단을 출력하세요*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		
		int dan = sc.nextInt();
		
		int i = 0;
		int time = 1;
		
		while(i<9) {
			System.out.println( dan + " * " + time + " = " + dan*time );
			
			i++;
			time++;
		}
	
		

		sc.close();
		}

}
