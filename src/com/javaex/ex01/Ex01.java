package com.javaex.ex01;

/*자바는 클래스로 이루어져 있다.
 * 클래스 안에 메소드가 있다.
 */
public class Ex01 {
    
	//메소드
	public static void main(String[] args) {
		
		//변수 선언 : 메모리 공간확보, 변수명은 소문자로..
		int myAge; 
		
		//초기화 : 아무 것도 없는 변수에 값을 처음 입력
		myAge = 25;
		
		//메소드사용(출력)
		System.out.println(myAge);
		
		//대입 : 값이 입력되어 있는 변수에 값을 대입
		myAge = 100;
		
		//메소드사용(출력)
		System.out.println(myAge);
		
	}
}
