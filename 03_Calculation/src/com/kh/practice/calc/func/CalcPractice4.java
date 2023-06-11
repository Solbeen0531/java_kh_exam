package com.kh.practice.calc.func;

import java.util.Scanner;

public class CalcPractice4 {

	public static void main(String[] args) {
		
		/* 문제 4 
		모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
		1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.

		ex.
		인원 수 : 29
		사탕 개수 : 100
		
		1인당 사탕 개수 : 3
		남는 사탕 개수 : 13		
		*/

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("인원 수 : ");
		int num = sc.nextInt(); // 인원 수 입력/정수형

		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt(); // 사탕 개수 입력/정수형 입력

		System.out.println();

		System.out.println("1인당 사탕 개수 : " + candy / num); // 사탕 개수를 인원 수로 나눈 값 출력
		System.out.println("남는 사탕 개수 : " + candy % num); // 사탕 개수를 인원 수로 나눈 값의 나머지 출력

		sc.close(); // 스캐너 끝

	}

}
