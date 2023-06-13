package com.kh.practice.repeat;

import java.util.Scanner;

public class RepeatPractice14 {

	public static void main(String[] args) {
		
		/* 문제 14
		다음과 같은 실행 예제를 구현하세요.

		ex.
		정수 입력 : 4
		****
		***
		**
		*
		*/

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");

		// 정수형 숫자 입력
		int num = sc.nextInt();

		// num 이 2 이상일 때만 반복문 수행
		// num 이 2 이상이어야 직각 삼각형 구조로 출력 가능
		if (num >= 2) {

			// num부터 1까지의 숫자만큼 반복
			for (int i = 1; i <= num; i++) {

				// num부터 i까지의 숫자만큼 반복
				for (int j = num; i <= j; j--) {

					// j가 num일 때, *을 num개 출력.
					// 1번 수행되면 *을 num개, 두 번 수행되면 num-1, 세 번 수행되면 num-2...
					// print() 대신 println() 사용하면 *이 하나 출력될 때마다 줄바꿈이 적용되어, 세로로 * * * (blank) * *
					// (blank) * (blank)와 같은 구조로 출력
					System.out.print("*");
				}

				// j가 num일 때, i는 1. *이 num개 찍힐 때마다 (blank)를 출력.
				// 1번 수행되면 num의 개수만큼 * (blank), 2번 수행되면 num-1의 개수만큼*(blank), 3번 수행되면 num-2의 개수만큼 *(blank)...
				// println() 을 사용하여 (blank)의 위치마다 줄 바꿈을 실행하여 출력해야 우변 직각 삼각형 구조로 출력 가능. print()
				// 사용하면 한 줄로 출력.
				System.out.println(" ");
			}
		} else {
			System.out.println("2 이상의 숫자를 입력하세요");
		}

		sc.close(); // 스캐너 끝

	}

}
