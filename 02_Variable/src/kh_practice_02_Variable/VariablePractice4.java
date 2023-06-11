package kh_practice_02_Variable;
//이 파일은 com (폴더) 안의 kh 안의 practice1 안의 func 안에 소속되어 있다.

import java.util.Scanner;
//따로 함수 정의 안하고, java.util.Scanner에 있는 함수를 불러오겠다.

public class VariablePractice4 {
//package와 import를 제외한 모든 소스는 class 안에 있어야 한다.	
//public 으로 선언되었기 때문에 필요 시, 다른 java 파일에서도 이것을 불러올 수 있다.

	public static void main(String[] args) {
		// 모든 프로그램에는 실행을 위해 반드시 main() 함수가 하나 필요하다.
		
		/* 문제 4 
		영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.

		ex.
		문자열을 입력하세요 : pear

		첫 번째 문자 : p
		두 번째 문자 : e
		세 번째 문자 : a
		
		*/

		Scanner sc = new Scanner(System.in);
		// 데이터를 입력해서 사용하기 위해 필요한 버퍼 on

		System.out.print("문자열을 입력하세요 : ");
		String word = sc.nextLine();
		// 문자열을 입력받고 줄바꿈을 한다

		char firstWord = word.charAt(0);
		// 입력된 문자열 중 첫 번째(프로그래밍에서 정수형 숫자는 0부터 1씩 올라가기 시작한다) 문자를 출력한다.

		char secondWord = word.charAt(1);
		// 입력된 문자열 중 두 번째(프로그래밍에서 정수형 숫자는 0부터 1씩 올라가기 시작한다) 문자를 출력한다.

		char thirdWord = word.charAt(2);
		// 입력된 문자열 중 세 번째(프로그래밍에서 정수형 숫자는 0부터 1씩 올라가기 시작한다) 문자를 출력한다.

		System.out.println();
		
		System.out.println("첫 번째 문자 : " + firstWord + "\n두 번째 문자 : " + secondWord + "\n세 번째 문자 : " + thirdWord);

		sc.close();
		// 스캐너를 모두 사용했으므로 닫는다 off
	}
}
