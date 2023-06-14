package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice {

	// 스캐너 시작
	Scanner sc = new Scanner(System.in);

	public void practice015() {

		System.out.print("숫자 : ");

		// 정수형 숫자 입력
		int num = sc.nextInt();

		// 입력한 값이 2보다 작으면
		if (num < 2) {
			System.out.println("잘못 입력하셨습니다.");

			// 입력한 값이 (첫 번째 소수인) 2라면
		} else if (num == 2) {
			System.out.println("소수 입니다.");
			
			// 입력한 값이 2보다 크면
		} else {

			for (int i = 2; i <	num; i++) {

				if (num % i == 0) {
					System.out.println("소수가 아닙니다.");
					break;
				} else {
				}
				System.out.println("소수 입니다.");
				break;

			}

		}

	}
}
