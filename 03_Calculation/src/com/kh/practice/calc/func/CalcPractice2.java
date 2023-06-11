package com.kh.practice.calc.func;

import java.util.Scanner;

public class CalcPractice2 {

	public static void main(String[] args) {
		
		/* 문제 2 
		키보드로 입력 받은 하나의 정수가 양수이면 “양수다“,
		양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.

		ex.
		정수 : -9
		
		음수다		
		*/

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("정수 : ");
		int num = sc.nextInt(); // 정수 입력
		
		System.out.println();

		if (num > 0) {
			System.out.println("양수다"); // 입력받은 값이 0보다 크면 출력
		} else if (num == 0) {
			System.out.println("0이다"); // 입력받은 값이 0이면 출력
		} else {
			System.out.println("음수다"); // 입력받은 값이 0보다 작으면 출력
		}

		sc.close(); // 스캐너 끝
	}

}
