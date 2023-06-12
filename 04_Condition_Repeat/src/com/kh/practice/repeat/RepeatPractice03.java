package com.kh.practice.repeat;

import java.util.Scanner;

public class RepeatPractice03 {

	public static void main(String[] args) {
		
		/* 문제 3
		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		단, 입력한 수는 1보다 크거나 같아야 합니다.

		ex.
		1이상의 숫자를 입력하세요 : 4 		1이상의 숫자를 입력하세요 : 0
		4 3 2 1 					1 이상의 숫자를 입력해주세요.		
		*/
		
		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt(); // 정수형 숫자 입력
		
		if (num < 1) { // num이 1보다 작다면
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		} else { 
			for (int i = 1; i <= num; num--) { // num 부터 1까지 1씩 마이너스하여 출력
				System.out.print(num + " ");
			}
		}

		sc.close(); // 스캐너 끝

	}

}
