package com.kh.practice.calc.func;

import java.util.Scanner;

public class CalcPractice7 {

	public static void main(String[] args) {
		
		/* 문제 7
		국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.

		ex.
		국어 : 60
		영어 : 80
		수학 : 40
		
		합계 : 180
		평균 : 60.0
		합격		
		 */

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("국어 : ");
		int kor = sc.nextInt(); // 국어 점수 입력

		System.out.print("영어 : ");
		int eng = sc.nextInt(); // 영어 점수 입력

		System.out.print("수학 : ");
		int math = sc.nextInt(); // 수학 점수 입력

		System.out.println();

		System.out.println("합계 : " + (kor + eng + math));

		double avg = (kor + eng + math) / 3;
		System.out.println("평균 : " + avg); // 국영수 점수를 합친 값을 3으로 나누어서 출력

		if ((kor >= 40) && (eng >= 40) && (math >= 40) && (avg >= 60)) {
			System.out.println("합격"); // 국영수 40점 이상이면서 평균 60점 이상이면 출력
		} else {
			System.out.println("불합격"); // 국영수 중 하나라도 40점 미만이거나 평균 60점 미만이면 출력
		}
		sc.close(); // 스캐너 끝

	}

}
