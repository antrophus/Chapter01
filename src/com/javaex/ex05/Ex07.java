package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] leftArray = new int[] {10, 20, 30};
		
		int[] rightArray = new int[] {12, 20, 30};
		
		//갯수가 같아야 한다
		//각각의 방번호와 값이 같아야 한다.
		
		if(leftArray.length == rightArray.length) {
			//방의 갯수가 같으면
			System.out.println("방의 갯수가 같습니다.");
			//계속 검사
			for(int i = 0; i<leftArray.length; i++) {
				//검사
				if(leftArray[i] == rightArray[i]) {
					System.out.println(i + "번째 값이 같습니다.");
				}else {
					System.out.println(i + "번째 값이 다릅니다.");
				}
			}
				
			
			
		}else {
			//방의 갯수가 다르면
		}
		
		
		
		
		

	}

}
