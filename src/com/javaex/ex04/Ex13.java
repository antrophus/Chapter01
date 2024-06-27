package com.javaex.ex04;

public class Ex13 {

	public static void main(String[] args) {
/*		
		int i = 1;
		
		while(true) {
			
			if(i>3) {
				break;
			}
			
			System.out.println(i);
			i++;
			
		}
*/
		
		int i = 1;
		boolean flag = true;
		
		while(flag) {
			
			if(i>3) {
				flag = false;
				//break;
			}
			System.out.println(i);
			i++;
		}
		
	}

}
