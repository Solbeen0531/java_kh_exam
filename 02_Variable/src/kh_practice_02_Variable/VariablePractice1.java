package kh_practice_02_Variable;
//이 파일은 com (폴더) 안의 kh 안의 practice1 안의 func 안에 소속되어 있다.
import java.util.Scanner;
//따로 함수 정의 안하고, java.util.Scanner에 있는 함수를 불러오겠다.

public class VariablePractice1 {
//package와 import를 제외한 모든 소스는 class 안에 있어야 한다.	
//public 으로 선언되었기 때문에 필요 시, 다른 java 파일에서도 이것을 불러올 수 있다.

	public static void main(String[] args) {
	// 모든 프로그램에는 실행을 위해 반드시 main() 함수가 하나 필요하다.

		/* 문제 1
		이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
		
		ex.
		이름을 입력하세요 : 아무개
		성별을 입력하세요(남/여) : 남
		나이를 입력하세요 : 20
		키를 입력하세요(cm) : 180.5
		
		키 180.5cm인 20살 남자 아무개님 반갑습니다^^		
		*/

		Scanner sc = new Scanner(System.in);
		// 데이터를 입력해서 사용하기 위해 필요한 버퍼 on

		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		// 문자열을 입력받고 줄바꿈을 한다

		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		// 한 문자를 입력받고 줄바꿈을 한다
		// 여러 문자를 입력하더라도 그 중 첫 번째(프로그래밍에서 정수형 숫자는 0부터 1씩 올라가기 시작한다) 문자를 출력한다.

		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		// 정수형 숫자를 입력받는다

		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		// 실수형 숫자를 입력받는다

		System.out.println();
		System.out.println("키 "+height+"cm인 "+age+"살 "+gender+"자 "+name+"님 반갑습니다 ^^");

		sc.close();
		// 스캐너를 모두 사용했으므로 닫는다 off
	}

}
