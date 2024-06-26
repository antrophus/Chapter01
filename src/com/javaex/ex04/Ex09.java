package com.javaex.ex04;

public class Ex09 {

	public static void main(String[] args) {
		/*6의 배수이자 14의 배수인 가장 적은 정수 찾기*/
		
		int no = 1;
		
		
		while (true) {
			
			if(no%6==0 && no%14==0) {
				
				System.out.println(no);
				break;
			}
			no++;
		}
		

	}

}
