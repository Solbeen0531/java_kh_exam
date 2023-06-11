package com.kh.practice.calc.func;

import java.util.Scanner;

public class CalcPractice8 {

	public static void main(String[] args) {
		
		/* 문제 8
		주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.

		ex.
		주민번호를 입력하세요(- 포함) : 132456-2123456
		
		여자		
		 */

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String num = sc.nextLine(); // 주민번호 입력

		int gender = num.charAt(8); // 입력된 문자열에서 8번째 문자를 정수형 gender에 대입

		System.out.println();

		if (gender % 2 == 0) {
			System.out.println("여자"); // gender를 2로 나눈 나머지가 0이면 출력
		} else {
			System.out.println("남자"); // gender를 2로 나눈 나머지가 0이 아니면 출력
		}
		sc.close(); // 스캐너 끝

	}

}
