package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice {

	// 스캐너 시작
	Scanner sc = new Scanner(System.in);

	public void practice015() {

		System.out.print("숫자 : ");

		// 정수형 숫자 입력
		int num = sc.nextInt();

		for (;;) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + "#");
			}
		}

	}

}
