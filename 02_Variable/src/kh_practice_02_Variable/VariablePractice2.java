package kh_practice_02_Variable;
//이 파일은 com (폴더) 안의 kh 안의 practice1 안의 func 안에 소속되어 있다.

import java.util.Scanner;
//따로 함수 정의 안하고, java.util.Scanner에 있는 함수를 불러오겠다.

public class VariablePractice2 {
//package와 import를 제외한 모든 소스는 class 안에 있어야 한다.	
//public 으로 선언되었기 때문에 필요 시, 다른 java 파일에서도 이것을 불러올 수 있다.

	public static void main(String[] args) {
	// 모든 프로그램에는 실행을 위해 반드시 main() 함수가 하나 필요하다.
		
		/* 문제 2
		 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.

		ex.
		첫 번째 정수 : 23
		두 번째 정수 : 7

		더하기 결과 : 30
		빼기 결과 : 16
		곱하기 결과 : 161
		나누기 몫 결과 : 3
		*/
		
		Scanner sc = new Scanner(System.in);
		// 데이터를 입력해서 사용하기 위해 필요한 버퍼 on

		System.out.print("첫 번째 정수 : ");
		int a = sc.nextInt();
		// 정수형 숫자를 입력받는다

		System.out.print("두 번째 정수 : ");
		int b = sc.nextInt();
		// 정수형 숫자를 입력받는다
		
		System.out.println();

		System.out.println("더하기 결과 : "+(a+b));
		System.out.println("빼기 결과 : " +(a-b));
		System.out.println("곱하기 결과 : "+(a*b));
		System.out.println("나누기 결과 : "+(a/b));
	
		sc.close();
		// 스캐너를 모두 사용했으므로 닫는다 off
	}
}
