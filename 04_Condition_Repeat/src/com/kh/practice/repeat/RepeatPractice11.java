package com.kh.practice.repeat;

import java.util.Scanner;

public class RepeatPractice11 {

	public static void main(String[] args) {
		
		/* 문제 11
		사용자로부터 시작 숫자와 공차를 입력 받아
		일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
		단, 출력되는 숫자는 총 10개입니다.

		 * ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
			ex) 2, 7, 12, 17, 22 ...
				5 5 5 5 => 여기서 공차는 5

		ex.
		시작 숫자 : 4
		공차 : 3
		4 7 10 13 16 19 22 25 28 31		
		*/
		
		Scanner sc = new Scanner(System.in); // 스캐너 시작
		
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt(); // 정수형 숫자 입력
		
		System.out.print("공차 : ");
		int differ = sc.nextInt(); // 정수형 숫자 입력
		
		for (int i = 1; i <= 10; i++) { // i를 1부터 10까지 1씩 증가, 즉 10회 출력
			System.out.print(start + " ");
			start = start + differ;
		}
		
		sc.close(); // 스캐너 끝

	}

}
