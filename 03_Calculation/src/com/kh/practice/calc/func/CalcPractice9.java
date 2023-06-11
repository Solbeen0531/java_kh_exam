package com.kh.practice.calc.func;

import java.util.Scanner;

public class CalcPractice9 {

	public static void main(String[] args) {
		
		/* 문제 9
		키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
		그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
		아니면 false를 출력하세요.
		(단, num1은 num2보다 작아야 함)

		ex.
		정수1 : 4
		정수2 : 11
		입력 : 13

		true		
		 */

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("정수1 : ");
		int num1 = sc.nextInt(); // 정수1 입력

		System.out.print("정수2 : ");
		int num2 = sc.nextInt(); // 정수2 입력

		System.out.print("입력 : ");
		int num3 = sc.nextInt(); // 정수3 입력

		System.out.println();

		if ((num3 <= num1) || (num3 > num2)) {
			System.out.println("true"); // num3이 num1 이하이거나 / num2 초과이면 출력
		} else {
			System.out.println("false"); // 그외 나머지 출력
		}
		sc.close(); // 스캐너 끝

	}

}
