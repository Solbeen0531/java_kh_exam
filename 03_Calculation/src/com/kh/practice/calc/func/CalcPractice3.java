package com.kh.practice.calc.func;

import java.util.Scanner;

public class CalcPractice3 {
	public static void main(String[] args) {
		
		/* 문제 3 
		키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.

		ex.
		정수 : 5
		
		홀수다		
		*/

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("정수 : ");
		int num = sc.nextInt(); // 정수 입력
		
		System.out.println();

		if (num % 2 == 0) {
			System.out.println("짝수다"); // 입력받은 값을 2로 나눈 나머지가 0이면 출력
		} else {
			System.out.println("홀수다"); // 입력받은 값을 2으로 나눈 나머지가 0이 아니면 출력
		}

		sc.close(); // 스캐너 끝
	}
}
