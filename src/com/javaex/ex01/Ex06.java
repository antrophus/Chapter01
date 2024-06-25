package com.javaex.ex01;

public class Ex06 {
	
	//문자형 char
	public static void main(String[] args) {
		
				
		char ch01 = 'A';
		char ch02 = '안';
		
		System.out.println(ch01);
		System.out.println(ch02);
		
		
		char ch03 = '6';
		char ch04 = 6; //문자코드번호 6 : 컴퓨터는 char 예약자에 변수 선언을 숫자로 입력해도 문자열의 코드번호로 인식해서 오류로 반환하지 않음
		
		System.out.println(ch03);
		System.out.println(ch04);
		
		//*한 글자 이상의 문자열을 입력하려면, [String = ""] 자료형을 사용
		
		String str = "안녕하세요";
				
		System.out.println(str);
		
	}

}
