package com.kh.practice.repeat;

import java.util.Scanner;

public class RepeatPractice05 {

	public static void main(String[] args) {
		
		/* 문제 5
		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.

		ex.
		정수를 하나 입력하세요 : 8
		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36		
		*/
		
		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt(); // 정수형 숫자 입력
		
		for (int i = 1; i <= num; i++) { // i를 num까지 1씩 증가하여 조건식에 맞게 + 혹은 = 을 출력
			System.out.print(i);
			
			if (i < num) {
			System.out.print(" + ");
			} else {
				System.out.print(" = ");
			}
		}
		
		int sum = 0;
		for (int i = 1; i <= num; i++) { // i를 num까지 1씩 증가한 값을 더하여 출력
			sum = i + sum;
		}
		System.out.println(sum);
		
		sc.close(); // 스캐너 끝

	}

}
