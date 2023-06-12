package com.kh.practice.repeat;

import java.util.Scanner;

public class RepeatPractice12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		
		while (true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String calc = sc.nextLine();

			System.out.print("정수1 : ");
			int numA = sc.nextInt(); 

			System.out.print("정수2 : ");
			int numB = sc.nextInt(); sc.nextLine();

			switch (calc) {
			case "+":
				System.out.println(numA + " + " + numB + " = " + (numA + numB));
				break;
			case "-":
				System.out.println(numA + " - " + numB + " = " + (numA - numB));
				break;
			case "*":
				System.out.println(numA + " * " + numB + " = " + (numA * numB));
				break;
			case "/":
				if ((numA == 0) || (numB == 0)) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				} else {
					System.out.println(numA + " / " + numB + " = " + (numA / numB));
				}
				break;
			case "%":
				System.out.println(numA + " % " + numB + " = " + (numA % numB));
				break;
			case "exit":
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				break;
			} // 스위치 문 
			
			
			sc.close(); // 스캐너 끝
		}
	}

}
