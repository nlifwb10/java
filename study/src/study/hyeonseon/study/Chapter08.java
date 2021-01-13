package study.hyeonseon.study;

import java.util.Scanner;

public class Chapter08 {

	public static void main(String[] args) {
		System.out.println("PDF 65 ~");

		practice1();
		practice2();
		practice3();
		practice4();
		practice5();
		practice6();
		practice7();
		practice8();
		practice9();
		practice10();
	}
	
	public static void practice1() {
		System.out.println("\n문제8-1 ========================================");
		System.out.println("예외처리의 정의와 목적에 대해서 설명하시오");
		System.out.println("답: ");
	}
	
	public static void practice2() {
		System.out.println("\n문제8-2 ========================================");
		System.out.println("다음은 실행도중 예외가 발생하여 화면에 출력된 내용이다 이에 대한 설명 중 옳지 않은 것은?");
		System.out.println("답: 2");
	}
	
	public static void practice3() {
		System.out.println("\n문제8-3 ========================================");
		System.out.println("다음 중 오버라이딩이 잘못된 것은? (모두 고르시오)");
		System.out.println("답: a");
	}
	
	public static void practice4() {
		System.out.println("\n문제8-4 ========================================");
		System.out.println("다음과 같은 메서드가 있을 때 예외를 잘못 처리한 것은?(모두 고르시오)");
		System.out.println("답: d");
		System.out.println("왜 상속받지 않은 Exception이 들어가 있는거지?");
	}
	
	public static void practice5() {
		System.out.println("\n문제8-5 ========================================");
		System.out.println("아래의 코드가 수행되었을 때의 실행결과를 적으시오.");
		System.out.println("답: 1 ->5 ->6");
		System.out.println("답: 1 ->2 ->5 ->6");
	}
	
	public static void practice6() {
		System.out.println("\n문제8-6 ========================================");
		System.out.println("아래의 코드가 수행되었을 때의 실행결과를 적으시오.");
		System.out.println("답: 2 ->3 ->4 ->5");
	}
	
	public static void practice7() {
		System.out.println("\n문제8-7 ========================================");
		System.out.println("아래의 코드가 수행되었을 때의 실행결과를 적으시오.");
		System.out.println("답: 1 ->5 ->6");
		System.out.println("답: 1 ->2 ->5 ->6");
	}
	
	public static void practice8() {
		System.out.println("\n문제8-8 ========================================");
		System.out.println("다음은 1~100 사이의 숫자를 맞추는 게임을 실행하던 도중에 숫자가 아닌 영문자를 넣어서 발생한 예외이다.\n" + 
				"예외처리를 해서 숫자가 아닌 값을 입력했을 때는 다시 입력을 받도록 보완하라.");
		
		// 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기 위한 변수
		
		/*
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요.");
			
			input = new Scanner(System.in).nextInt();
			
			try {
				
			} catch (Exception e) {
				
			}
			
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if(answer < input) {
				System.out.println("더 작은 수를 입력하세요."); 
			} else {
				System.out.println("맞췄습니다."); 
				System.out.println("시도횟는 "+count+"번 입니다."); 
				break; // do-while문을 벗어난다
			}
		} while(true); // 무한반복문
		*/
	}
	
	public static void practice9() {
		System.out.println("\n문제8-9 ========================================");
		System.out.println("다음과 같은 조건의 예외클래스를 작성하고 테스트하시오");
	}
	
	public static void practice10() {
		System.out.println("\n문제8-10 ========================================");
		System.out.println("아래의 코드가 수행되었을 때의 실행결과를 적으시오.");
		System.out.println("답: 2 ->4 ->5 ->7");
	}

}
