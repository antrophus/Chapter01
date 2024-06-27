package com.javaex.ex04;

public class Ex12 {

	public static void main(String[] args) {
		//총 10번을 반복하는데
		//상황이되면 전체끝(가장 가까운 반복문만 끝)
		for(int i=1; i<=10; i++) {
			
			if(i%2==0 && i%3==0) {
				break;
			}
			
			System.out.println(i);
		}
		
//		System.out.println("--------------------------");
//		
//		for(int i=1; i<=10; i++) {
//			
//			if(i%2==0 && i%3==0) {
//				continue;
//			}
//			System.out.println(i);
//			
//		}
//		
//		System.out.println("--------------------------");
//		
//		for(int i=1; i<=10; i++) {
//			
//			if(i%2==0 && i%3==0) {
//				//조건에 만족하면 아무것도 안함
//				//코드가 없는데 어색하다
//			}else {
//				System.out.println(i);	
//			}
//			
//		}
//		
//		System.out.println("--------------------------");
//		
//		for(int i=1; i<=10; i++) {
//			
//			if( !(i%2==0 && i%3==0) ) {
//				System.out.println(i);
//			}
			
//		}
		
	}

}