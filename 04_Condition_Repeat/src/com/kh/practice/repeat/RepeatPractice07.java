package com.kh.practice.repeat;

import java.util.Scanner;

public class RepeatPractice07 {

	public static void main(String[] args) {

		/* 문제 7
		위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

		ex.
		첫 번째 숫자 : 8	첫 번째 숫자 : 4	첫 번째 숫자 : 9
		두 번째 숫자 : 4	두 번째 숫자 : 8	두 번째 숫자 : 0
		4 5 6 7 8		4 5 6 7 8		1 이상의 숫자를 입력해주세요.
										첫 번째 숫자 : 6
										두 번째 숫자 : 2
										2 3 4 5 6
		*/

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("첫 번째 숫자 : ");
		int numA = sc.nextInt(); // 정수형 숫자 입력

		System.out.print("두 번째 숫자 : ");
		int numB = sc.nextInt(); // 정수형 숫자 입력

		while ((numA < 1) || (numB < 1)) { // 입력받은 숫자 둘 중 하나가 1보다 작으면
			System.out.println("1 이상의 숫자를 입력해주세요.");

			System.out.print("첫 번째 숫자 : ");
			numA = sc.nextInt(); // 정수형 숫자 입력

			System.out.print("두 번째 숫자 : ");
			numB = sc.nextInt(); // 정수형 숫자 입력

		}
		if (numA - numB <= 0) { // numA - numB 의 결과가 0이거나 음수이면 > numA가 더 작은 수이고, numB가 더 큰 수라는 의미
			for (int i = 0; i <= numB; i++) { // 더 작은 수인 numA에서 1씩 증가시켜서 더 큰 수인 numB까지 출력
				i = numA++;
				System.out.print(i + " ");
			}
		} else if (numB - numA < 0) { // numB - numA 의 결과가 음수이면 > numB가 더 작은 수이고, numA가 더 큰 수라는 의미
			for (int i = 0; i <= numA; i++) { // 더 작은 수인 numB에서 1씩 증가시켜서 더 큰 수인 numA까지 출력
				i = numB++;
				System.out.print(i + " ");
			}
		} else {
			System.out.println("Meow");
		}

		sc.close(); // 스캐너 끝

	}

}
