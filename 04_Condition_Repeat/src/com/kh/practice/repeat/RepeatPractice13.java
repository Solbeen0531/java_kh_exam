package com.kh.practice.repeat;

import java.util.Scanner;

public class RepeatPractice13 {

	public static void main(String[] args) {
		
		/* 문제 13
		다음과 같은 실행 예제를 구현하세요.

		ex.
		정수 입력 : 4
		*
		**
	 	***
		****
		*/

		// 스캐너 시작
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");

		// 정수형 숫자 입력
		int num = sc.nextInt();

		// num 이 2 이상일 때만 반복문 수행
		// num 이 2 이상이어야 우변 직각 삼각형 구조로 출력 가능
		if (num >= 2) {

			// 1부터 num까지의 숫자만큼 반복
			for (int i = 1; i <= num; i++) {

				// 0부터 i-1까지의 숫자만큼 반복
				for (int j = 0; j < i; j++) {

					// j가 0일 때, *을 1개 출력.
					// 1번 수행되면 *, 두 번 수행되면 **, 세 번 수행되면 ***...
					// print() 대신 println() 사용하면 *이 하나 출력될 때마다 줄바꿈이 적용되어, 세로로 * (blank) * * (blank) * * * (blank)와 같은 구조로 출력 
					System.out.print("*");
				}

				// j가 0일 때, i는 1. *이 i개 찍힐 때마다 (blank)를 출력. 
				// 1번 수행되면 *(blank), 2번 수행되면 **(blank), 3번 수행되면 ***(blank)...
				// println() 을 사용하여 (blank)의 위치마다 줄 바꿈을 실행하여 출력해야 우변 직각 삼각형 구조로 출력 가능
				System.out.println(" ");
			}
		} else {
			System.out.println("2 이상의 숫자를 입력하세요");
		}

		sc.close(); // 스캐너 끝
	}

}
