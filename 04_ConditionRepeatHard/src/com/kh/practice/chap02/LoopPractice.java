package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice {

	// 스캐너 시작
	Scanner sc = new Scanner(System.in);

	public void practice015() {

		/*
		 * 문제 15 ( HARD 문제 1 ) 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요. 단, 입력한 수가 2보다
		 * 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		 * 
		 * ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다. ex) 2, 3, 5, 7, 11 ...
		 * 
		 * ex. 숫자 : 5 숫자 : 9 숫자 : 0 소수입니다. 소수가 아닙니다. 잘못 입력하셨습니다.
		 */

		// ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
		// 즉, 1과 n, 2개를 세기 위한 변수
		// 수를 세야하기 때문에 초기값은 0으로 선언
		int count = 0;

		System.out.print("숫자 : ");

		// 정수형 숫자 입력
		int num = sc.nextInt();

		// 입력한 값이 2보다 작으면
		if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");

			// 입력한 값이 2보다 크거나 같으면
		} else {

			// i를 1부터 num까지 1씩 증가하여 반복
			for (int i = 1; i <= num; i++) {

				// num을 i로 나눈 나머지가 0이라면
				if (num % i == 0) {

					// count값에 1씩 증가
					count++;
				}

			}
			// count값이 2라면 / 즉, 소수라면
			if (count == 2) {
				System.out.println("소수입니다.");

				// count 값이 2가 아니라면
			} else {
				System.out.println("소수가 아닙니다.");
			}

		}

	}

	public void practice016() {
		
	}
}
