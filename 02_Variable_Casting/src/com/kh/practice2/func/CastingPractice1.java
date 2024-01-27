package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {

	public void method1() {

		/* 문제 1 
		키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요.
		
		ex. 문자 : A
		
		A unicode : 65
		 */

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("문자 : ");
		char word = sc.nextLine().charAt(0); // 문자 하나 입력

		System.out.println();

		System.out.println(word + " unicode : " + (int) word); // 입력한 문자 하나와 정수형으로 변환된 문자 출력

		sc.close(); // 스캐너 끝
	}
}
