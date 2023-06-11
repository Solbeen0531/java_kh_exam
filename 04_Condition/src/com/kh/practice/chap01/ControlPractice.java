package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		
		/* 문제 1
		아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
		종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.

		ex.
		1. 입력
		2. 수정
		3. 조회
		4. 삭제
		7. 종료
		메뉴 번호를 입력하세요 : 3
		
		조회 메뉴입니다.		
		 */

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");

		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt(); // 메뉴 번호 입력
		
		System.out.println();

		switch (menu) { // 입력한 메뉴 번호에 따라 출력
		case 1:
			System.out.println("입력 메뉴입니다.");
			break; // 조건문을 빠져나온다
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("종료 메뉴입니다.");
			break;
		}
		
		sc.close(); // 스캐너 끝
	}
	
	public void practice2() {
		
		/* 문제 2
		키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
		짝수가 아니면 “홀수다“를 출력하세요.
		양수가 아니면 “양수만 입력해주세요.”를 출력하세요.

		ex.
		숫자를 한 개 입력하세요 : -8
		
		양수만 입력해주세요.		
		 */

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt(); // 정수형 숫자 입력
		
		System.out.println();

		if ((num > 0) && (num % 2 == 0)) {
			System.out.println("짝수다"); // 양수이면서 짝수이면 출력
		} else if ((num > 0) && (num % 2 == 1)) {
			System.out.println("홀수다"); // 양수이면서 홀수이면 출력
		} else if (num < 0) {
			System.out.println("양수만 입력해주세요."); // 음수이면 출력
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		sc.close(); // 스캐너 끝
	}



}
