package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] intArr = new int[3];
		
		intArr[0] = 3;
		intArr[1] = 20;
		intArr[2] = 27;
		
		for (int i = 0 ; i < intArr.length ; i++) {
			System.out.println(intArr[i]);
		}
		System.out.println("------------------------------");
			intArr[0] = 13;
			for(int i = 0; i < intArr.length ; i++) {
				System.out.println(intArr[i]);
			}
			
		}
		

	}

