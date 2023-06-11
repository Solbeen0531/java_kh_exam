package com.kh.practice.repeat;

import java.util.Scanner;

public class RepeatPractice01 {

	public static void main(String[] args) {
		
		/* 문제 1
		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		단, 입력한 수는 1보다 크거나 같아야 합니다.
		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

		ex.
		1이상의 숫자를 입력하세요 : 4 			1이상의 숫자를 입력하세요 : 0
		1 2 3 4 						1 이상의 숫자를 입력해주세요.
		*/

		Scanner sc = new Scanner(System.in); // 스캐너 시작
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num < 1) { // num이 1보다 작다면
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else { 
			for (int i = 1; i <= num; i++) { // 1부터 num까지 1씩 증가하여 출력
				System.out.print(i + " ");
			}
		}
		
		sc.close(); // 스캐너 끝

	}

}
