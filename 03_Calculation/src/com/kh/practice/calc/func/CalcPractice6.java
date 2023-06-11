package com.kh.practice.calc.func;

import java.util.Scanner;

public class CalcPractice6 {

	public static void main(String[] args) {
		
		/* 문제 6
		나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지,
		성인(19세 초과)인지 출력하세요.

		ex.
		나이 : 19
		
		청소년		
		 */

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("나이 : ");
		int age = sc.nextInt(); // 나이 입력

		System.out.println();

		if (age <= 13) {
			System.out.println("어린이"); // 나이가 13세 이하이면 출력
		} else if (age <= 19) {
			System.out.println("청소년"); // 나이가 13세 초과 19세 이하이면 출력
		} else {
			System.out.println("성인"); // 나이가 19세 초과이면 출력
		}

		sc.close(); // 스캐너 끝

	}

}
