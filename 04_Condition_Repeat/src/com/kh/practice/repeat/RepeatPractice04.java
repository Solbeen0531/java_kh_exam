package com.kh.practice.repeat;

import java.util.Scanner;

public class RepeatPractice04 {

	public static void main(String[] args) {

		/* 문제 4
		3번 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

		ex.
		1이상의 숫자를 입력하세요 : 4 		1이상의 숫자를 입력하세요 : 0
		4 3 2 1 					1 이상의 숫자를 입력해주세요.
									1이상의 숫자를 입력하세요 : 8
									8 7 6 5 4 3 2 1


		*/

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1) { // num이 1보다 작다면
			while (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				System.out.print("1 이상의 숫자를 입력하세요 : ");
				num = sc.nextInt();
			}
			for (int i = 1; i <= num; num--) { // num 부터 1까지 1씩 마이너스하여 출력
				System.out.print(num + " ");
			}

		} else {
			for (int i = 1; i <= num; num--) { // num 부터 1까지 1씩 마이너스하여 출력
				System.out.print(num + " ");
			}

		}

		sc.close(); // 스캐너 끝

	}

}
