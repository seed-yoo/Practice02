package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		/*
		 다음과 같이 정의되는 함수의 함수값을 계산해보자
		 결과 출력값:
		 숫자를 입력해주세요
		 숫자: -2
		 계산결과는 12.0 입니다
		 
		 숫자를 입력해주세요
		 숫자: 7
		 계산결과는 51.0 입니다
		 
		 숫자를 입력해주세요
		 숫자: 0
		 계산결과는 2.0 입니다
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		System.out.print("숫자: ");
		double n = sc.nextDouble();
		
		if(n<=0) {
			double result = n*n*n-9*n+2;
			System.out.println("계산결과는 " + result + " 입니다");
		}else if (n>0) {
			double result = (7*n+2);
			System.out.println("계산결과는 " + result + " 입니다");
		}
		
		sc.close();
		
		
		
		
		
	}

}
