package com.kh.practice.repeat;

import java.util.Scanner;

public class RepeatPractice06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int numA = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int numB = sc.nextInt();
		
		if ((numA < 1) || (numB < 1)) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			
		}
		
		sc.close();

	}

}
