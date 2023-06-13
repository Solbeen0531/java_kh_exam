package com.kh.practice.repeat;

import java.util.Scanner;

public class RepeatPractice13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("정수 입력 : ");
		int num = sc.nextInt(); // 정수형 숫자 입력

		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) { //
				System.out.print("*"); // 1. *을 1개부터 입력한 숫자까지 출력 
			}
			System.out.println("#"); // 
		} 
		

		sc.close(); // 스캐너 끝
	}

}
