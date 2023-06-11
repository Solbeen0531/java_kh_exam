package com.kh.practice.calc.func;

import java.util.Scanner;

public class CalcPractice5 {

	public static void main(String[] args) {
		
		/* 문제 5 
		키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.

		ex.
		이름 : 박신우
		학년(숫자만) : 3
		반(숫자만) : 4
		번호(숫자만) : 15
		성별(M/F) : F
		성적(소수점 아래 둘째자리까지) : 85.75
		
		3학년 4반 15번 박신우 여학생의 성적은 85.75이다.		
		*/

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("이름 : ");
		String name = sc.next(); // 이름 입력

		System.out.print("학년(숫자만) : ");
		int year = sc.nextInt(); // 학년 입력

		System.out.print("반(숫자만) : ");
		int ban = sc.nextInt(); // 반 입력

		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine(); // 번호 입력

		System.out.print("성별(M/F) : ");
		String gender = sc.nextLine(); // 성별 입력

		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble(); // 성적 입력

		if (gender.equals("M")) {
			gender = "남학생"; // 입력받은 성별의 값이 M이면 출력
		} else {
			gender = "여학생"; // 입력받은 성별의 값이 M이 아니면 출력
		}

		System.out.println();

		System.out.print(year + "학년 " + ban + "반 " + num + "번 " + name + " " + gender + "의 성적은 " + score + "이다.");

		sc.close(); // 스캐너 끝

	}

}
