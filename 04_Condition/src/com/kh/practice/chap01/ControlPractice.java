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


}
