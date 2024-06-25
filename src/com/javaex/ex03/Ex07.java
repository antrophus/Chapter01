package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		/*점수를 입력받아 등급을 표시하는 프로그램을 작성하세요
		 * 
		 * 90점이상이면 A등급
		 * 80점이상~89점이면 B등급
		 * 70점이상~79점이면 C등급
		 * 60점이상~69점이면 D등급
		 * 60점 미만이면 F등급*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		
		int point = sc.nextInt();
		
		if(point>=90) {
			System.out.println("A등급");
					
		} else if(point>=80 && point<90) { // 90 > point >=80 | && 이하 부분은 상위 연산 단계에서 제외되었기에 생략가능
			System.out.println("B등급");
			
		} else if(point>=70 && point<80) { // 80 > point >=70 | && 이하 부분은 상위 연산 단계에서 제외되었기에 생략가능
			System.out.println("C등급");
			
		} else if(point>=60 && point<70) { // 70 > point >=60 | && 이하 부분은 상위 연산 단계에서 제외되었기에 생략가능
			System.out.println("D등급");
			
		} else {						   // 60 > point --> 나머지
			System.out.println("F등급");
		}
				
		
		sc.close();
		
		
	}

}
