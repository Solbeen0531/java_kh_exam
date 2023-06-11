package com.kh.practice.calc.func;

import java.util.Scanner;

public class CalcPractice11 {

	public static void main(String[] args) {
		
		/* 문제 11
		A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
		인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
		(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)

		ex.
		A사원의 연봉 : 2500
		B사원의 연봉 : 2900
		C사원의 연봉 : 2600
		
		A사원 연봉/연봉+a : 2500/3500.0
		3000 이상
		B사원 연봉/연봉+a : 2900/2900.0
		3000 미만
		C사원 연봉/연봉+a : 2600/2989.9999999999995
		3000 미만		
		 */

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("A사원의 연봉 : ");
		int money1 = sc.nextInt(); // A사원의 연봉 입력

		System.out.print("B사원의 연봉 : ");
		int money2 = sc.nextInt(); // B사원의 연봉 입력

		System.out.print("C사원의 연봉 : ");
		int money3 = sc.nextInt(); // C사원의 연봉 입력

		System.out.println();

		System.out.println("A사원 연봉/연봉+a : " + money1 + "/" + money1 * 1.4); // A사원의 연봉 / 연봉에 인센티브를 더한 값 출력

		if (money1 * 1.4 >= 3000) {
			System.out.println("3000 이상"); // A사원의 연봉에 인센티브를 더한 값이 3000 이상이면 출력
		} else {
			System.out.println("3000 미만");
		}

		System.out.println("B사원 연봉/연봉+a : " + money2 + "/" + money2 * 1.0); // B사원의 연봉 / 연봉에 인센티브를 더한 값 출력

		if (money2 * 1.0 >= 3000) {
			System.out.println("3000 이상"); // B사원의 연봉에 인센티브를 더한 값이 3000 이상이면 출력
		} else {
			System.out.println("3000 미만");
		}

		System.out.println("C사원의 연봉/연봉+a : " + money3 + "/" + money3 * 1.15); // C사원의 연봉 / 연봉에 인센티브를 더한 값 출력

		if (money3 * 1.15 >= 3000) {
			System.out.println("3000 이상"); // C사원의 연봉에 인센티브를 더한 값이 3000 이상이면 출력
		} else {
			System.out.println("3000 미만");
		}

		sc.close(); // 스캐너 끝

	}

}
