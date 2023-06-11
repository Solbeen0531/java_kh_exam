package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void method1() {
		
		/* 문제 2 
		실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
		이 때 총점과 평균은 정수형으로 처리하세요.

		ex.
		국어 : 90.0
		영어 : 90.0
		수학 : 90.0

		총점 : 270
		평균 : 90
		*/
		
		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("국어 : ");
		double kor = sc.nextDouble(); // 국어 점수 실수형으로 입력

		System.out.print("영어 : ");
		double eng = sc.nextDouble(); // 영어 점수 실수형으로 입력

		System.out.print("수학 : ");
		double mat = sc.nextDouble(); // 수학 점수 실수형으로 입력
		
		System.out.println();

		System.out.println("총점 : " + (int) (kor + eng + mat)); // 총점을 정수형으로 반환
		System.out.println("평균 : " + (int) (kor + eng + mat) / 3); // 평균을 정수형으로 반환

		sc.close(); // 스캐너 끝
	}
}
