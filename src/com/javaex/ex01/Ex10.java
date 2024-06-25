package com.javaex.ex01;

public class Ex10 {
	
	public static void main(String[] args) {
		
		//대입연산자 =
		
		int a = 7;
		int b = 2;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("------------------------------");
		
		//산술연산자 +,-,*,/
		int sum = a + b;
		System.out.println(sum);
		
		System.out.println(a + b); // +
		System.out.println(a - b); // -
		System.out.println(a * b); // *
		System.out.println(a / b); // / --> 몫
		System.out.println(a % b); // % --> 나머지
		
		System.out.println("----------------------------------------------");
		
		//부호연산자
		int var = -3;
		int pvar = +var; // +(-3) --> -3
		int mvar = -var; // -(-3) --> 3
		
		System.out.println(var);
		System.out.println(pvar);
		System.out.println(mvar);
		
		System.out.println("----------------------------------------------");
		
		//증감연산자
		
		System.out.println(a);  // 7
		System.out.println(++a);// 7-->8 1올림
		System.out.println(a);  // 값을 출력
		
		System.out.println(b); //2
		System.out.println(--b); // 2 -->1 1내림
		System.out.println(b); // 값을 출력
		
		System.out.println("------------------------");
		
		System.out.println(a); // 8
		System.out.println(a++); // 8
		System.out.println(a); // 9
		
		int c = 5;
		System.out.println(++c * 2); // 12
		
		int d = 5;
		System.out.println(d++ * 2); // 10, 출력 후 d 값은 6이 됨
		
		
		System.out.println(++a);
		
		System.out.println(a++);
		
		System.out.println(--a);
		
		System.out.println(a--);
		
	}

}
