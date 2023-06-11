package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		
		/* 문제 1
		아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
		종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.

		ex.
		1. 입력
		2. 수정
		3. 조회
		4. 삭제
		7. 종료
		메뉴 번호를 입력하세요 : 3
		
		조회 메뉴입니다.		
		 */

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");

		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt(); // 메뉴 번호 입력
		
		System.out.println();

		switch (menu) { // 입력한 메뉴 번호에 따라 출력
		case 1:
			System.out.println("입력 메뉴입니다.");
			break; // 조건문을 빠져나온다
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("종료 메뉴입니다.");
			break;
		}
		
		sc.close(); // 스캐너 끝
	}
	
	public void practice2() {
		
		/* 문제 2
		키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
		짝수가 아니면 “홀수다“를 출력하세요.
		양수가 아니면 “양수만 입력해주세요.”를 출력하세요.

		ex.
		숫자를 한 개 입력하세요 : -8
		
		양수만 입력해주세요.		
		 */

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt(); // 정수형 숫자 입력
		
		System.out.println();

		if ((num > 0) && (num % 2 == 0)) {
			System.out.println("짝수다"); // 양수이면서 짝수이면 출력
		} else if ((num > 0) && (num % 2 == 1)) {
			System.out.println("홀수다"); // 양수이면서 홀수이면 출력
		} else if (num < 0) {
			System.out.println("양수만 입력해주세요."); // 음수이면 출력
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
		sc.close(); // 스캐너 끝
		
	}
	
	public void practice3() {
		
		/* 문제 3
		국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		불합격인 경우에는 “불합격입니다.”를 출력하세요.
		
		ex 1. 			ex 2.
		국어점수 : 88		국어점수 : 88
		수학점수 : 50 		수학점수 : 50
		영어점수 : 40 		영어점수 : 45
		
		불합격입니다. 		국어 : 88
						수학 : 50
						영어 : 45
						합계 : 183
						평균 : 61.0
						축하합니다, 합격입니다!
		 */

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("국어점수 : ");
		int kor = sc.nextInt(); // 국어 점수 입력

		System.out.print("수학점수 : ");
		int math = sc.nextInt(); // 수학 점수 입력

		System.out.print("영어점수 : ");
		int eng = sc.nextInt(); // 영어 점수 입력
		
		System.out.println();

		int sum = kor + math + eng; // 합계 
		double avg = (kor + math + eng) / 3; // 소숫점 아래 자리를 나타내기 위해 실수형으로 사용

		if ((kor >= 40) && (math >= 40) && (eng >= 40) && (avg >= 60)) { // 국영수 점수가 40점 이상, 평균이 60점 이상이면 아래 출력
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		} else { // 이외 출력
			System.out.println("불합격입니다.");
		}
		
		sc.close(); // 스캐너 끝
		
	}
	
	public void practice4() {
		
		/* 문제 4
		if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.

		ex 1.
		1~12 사이의 정수 입력 : 8
		
		8월은 여름입니다.

		ex 2.
		1~12 사이의 정수 입력 : 99
		
		99월은 잘못 입력된 달입니다.		
		*/

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("1~12 사이의 정수 입력 : ");
		int season = sc.nextInt(); // 정수 입력
		
		System.out.println();
		
		switch(season) { 
		case 1 :  // 1을 입력받았다면 출력
			System.out.println(season+"월은 겨울입니다."); 						
			break;
		case 2 :
			System.out.println(season+"월은 겨울입니다.");
			break;
		case 3 :
			System.out.println(season+"월은 봄입니다.");
			break;
		case 4 :
			System.out.println(season+"월은 봄입니다.");
			break;
		case 5 :
			System.out.println(season+"월은 봄입니다.");
			break;
		case 6 :
			System.out.println(season+"월은 여름입니다.");
			break;
		case 7 :
			System.out.println(season+"월은 여름입니다.");
			break;
		case 8 :
			System.out.println(season+"월은 여름입니다.");
			break;
		case 9 :
			System.out.println(season+"월은 가을입니다.");
			break;
		case 10 :
			System.out.println(season+"월은 가을입니다.");
			break;
		case 11 :
			System.out.println(season+"월은 가을입니다.");
			break;
		case 12 :
			System.out.println(season+"월은 겨울입니다.");
			break;
		default :
			System.out.println(season+"월은 잘못 입력된 달입니다."); // 1~12가 아닌 정수를 입력받았다면 출력
		
		}
		
		sc.close(); // 스캐너 끝
		
	}
	
	public void practice5() {
		
		/* 문제 5
		아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		로그인 성공 시 “로그인 성공”,
		아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.

		ex 1. 					ex 2. 					ex 3.
		아이디 : myId 			아이디 : myId 			아이디 : my
		비밀번호 : myPassword12 	비밀번호 : myPassword 		비밀번호 : myPassword12
		로그인 성공 				비밀번호가 틀렸습니다. 		아이디가 틀렸습니다.		
		 */

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("아이디 : ");
		String id = sc.nextLine(); // 아이디 입력

		System.out.print("비밀번호 : ");
		String pw = sc.nextLine(); // 비밀번호 입력
		
		System.out.println();

		if ((id.equals("myId")) && (pw.equals("myPassword12"))) { // 입력한 아이디와 비밀번호의 값이 맞다면 출력
			System.out.println("로그인 성공");
		} else if (!(id.equals("myId")) && (pw.equals("myPassword12"))) { // 비밀번호만 맞을 때 출력
			System.out.println("아이디가 틀렸습니다.");
		} else if ((id.equals("myId")) && !(pw.equals("myPassword12"))) { // 아이디만 맞을 때 출력
			System.out.println("비밀번호가 틀렸습니다.");
		} else { // 이외 출력
			System.out.println("로그인을 다시 시도해주세요"); 
		}
		
		sc.close(); // 스캐너 끝
		
	}
	
	public void practice6() {
		
		/* 문제 6
		사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
		단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		비회원은 게시글 조회만 가능합니다.

		ex.
		권한을 확인하고자 하는 회원 등급 : 관리자
		
		회원관리, 게시글 관리 게시글 작성, 댓글 작성 게시글 조회		
		 */

		Scanner sc = new Scanner(System.in); // 스캐너 시작

		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String rank = sc.nextLine(); // 회원 등급 입력
		
		System.out.println();

		if (rank.equals("관리자")) { // 관리자 입력 시 출력
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		} else if (rank.equals("회원")) { // 회원 입력 시 출력
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		} else if (rank.equals("비회원")) { // 비회원 입력 시 출력
			System.out.println("게시글 조회");
		} else { // 이외 출력
			System.out.println("다시 시도해주세요");
		}

		sc.close(); // 스캐너 끝
		
	}







}
