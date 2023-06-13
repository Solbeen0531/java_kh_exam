package com.kh.practice.repeat;

import java.util.Scanner;

public class RepeatPractice09 {

	public static void main(String[] args) {

		/* 문제 9
		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.

		숫자 : 4 						숫자 : 10
		===== 4단 ===== 				9 이하의 숫자만 입력해주세요.
		===== 5단 =====
		===== 6단 =====
		===== 7단 =====
		===== 8단 =====
		===== 9단 =====
		(해당 단의 내용들은 길이 상 생략)
		*/

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("숫자 : ");
		int num = sc.nextInt(); // 정수형 숫자 입력

		if (num < 2) { // num이 2 미만이라면 출력
			System.out.println("Meow");

		} else if (num > 9) { // num이 9를 초과하면 출력
			System.out.println("9 이하의 숫자만 입력해주세요.");
		} else {
			for (; num < 10; num++) { // num을 1씩 증가한 값을 출력
				System.out.println("===== " + num + "단 =====");

				for (int j = 1; j < 10; j++) { // 곱하는 수를 1에서 시작하여 9까지 1씩 증가하며 출력
					System.out.println(num + " * " + j + " = " + (num * j));
				}
				sc.close(); // 스캐너 끝
			}
		}

	}

}
