package com.kh.practice.calc.func;

import java.util.Scanner;

public class CalcPractice10 {

	public static void main(String[] args) {
		
		/* 문제 10
		3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.

		ex.
		입력1 : 5
		입력2 : -8
		입력3 : 5

		false		
		 */

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("정수1 : ");
		int num1 = sc.nextInt(); // 정수1 입력

		System.out.print("정수2 : ");
		int num2 = sc.nextInt(); // 정수2 입력

		System.out.print("입력3 : ");
		int num3 = sc.nextInt(); // 정수3 입력
		
		System.out.println();

		if ((num1 == num2) && (num2 == num3)) {
			System.out.println("true"); // 입력받은 수가 모두 같으면 출력
		} else {
			System.out.println("false");
		}

		sc.close(); // 스캐너 끝

	}

}
