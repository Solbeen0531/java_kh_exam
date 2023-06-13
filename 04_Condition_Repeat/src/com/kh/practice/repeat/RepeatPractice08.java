package com.kh.practice.repeat;

import java.util.Scanner;

public class RepeatPractice08 {

	public static void main(String[] args) {

		/* 문제 8
		사용자로부터 입력 받은 숫자의 단을 출력하세요.

		ex.
		숫자 : 4
		===== 4단 =====
		4 * 1 = 4
		4 * 2 = 8
		4 * 3 = 12
		4 * 4 = 16
		4 * 5 = 20
		4 * 6 = 24
		4 * 7 = 28
		4 * 8 = 32
		4 * 9 = 36
		*/

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("숫자 : ");
		int num = sc.nextInt(); // 정수형 숫자 입력

		System.out.println("===== " + num + "단 =====");

		if (num > 0) { // num 이 0보다 크다면 출력
			for (int i = 1; i < 10; i++) { // 곱하는 수를 1에서 시작하여 9까지 1씩 증가하며 출력
				System.out.println(num + " * " + i + " = " + (num * i));
			}
		} else {
			System.out.println("Meow");
		}

		sc.close(); // 스캐너 끝

	}

}
