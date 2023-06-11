package kh_practice_02_Variable;
//이 파일은 com (폴더) 안의 kh 안의 practice1 안의 func 안에 소속되어 있다.

import java.util.Scanner;
//따로 함수 정의 안하고, java.util.Scanner에 있는 함수를 불러오겠다.

public class VariablePractice3 {
//package와 import를 제외한 모든 소스는 class 안에 있어야 한다.	
//public 으로 선언되었기 때문에 필요 시, 다른 java 파일에서도 이것을 불러올 수 있다.

	public static void main(String[] args) {
		// 모든 프로그램에는 실행을 위해 반드시 main() 함수가 하나 필요하다.
		
		/* 문제 3
		 키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		 
		 계산 공식 )	면적 : 가로 * 세로
		 			둘레 : (가로 + 세로) * 2

			ex.
			가로 : 13.5
			세로 : 41.7

			면적 : 562.95
			둘레 : 110.4
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		// 데이터를 입력해서 사용하기 위해 필요한 버퍼 on

		System.out.println("가로 : ");
		double width = sc.nextDouble();
		// 실수형 숫자를 입력받는다

		System.out.println("세로 : ");
		double vertical = sc.nextDouble();
		// 실수형 숫자를 입력받는다

		System.out.println();
		
		System.out.println("면적 : " + (width * vertical));
		System.out.println("둘레 : " + (width + vertical) * 2);

		sc.close();
		// 스캐너를 모두 사용했으므로 닫는다 off
	}
}
