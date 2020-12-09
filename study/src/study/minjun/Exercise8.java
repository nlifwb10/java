package study.minjun;

import java.util.Scanner;

/*
	1.예외처리의 정의와 목적
	  -정의: 프로그램 실행 시 발생할 수 있는 예외에 대비한 코드를 작성하는 것
	  -목적: 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것
	  
	2. d
	
	3. d, e
	
	4. c, d(?)
	
	5.	1
		3
		5
		1
		2
		5
		6
		
	6.	3
		4
		5
		
	7. 1
	
	10.	2
		3
		4
		5
		6




 */
public class Exercise8 {


	public static void main(String[] args) {
		
		//8
//		int answer = (int)(Math.random()*100) +1;
//		int input = 0;
//		int count = 0;
//		
//		do {
//			count++;
//			System.out.print("1과 100사이의 값을 입력하세요:");
//			
//			try {
//				input = new Scanner(System.in).nextInt();
//			
//			
//				if(answer > input) {
//					System.out.println("더 큰 수를 입력하세요.");
//				} else if(answer < input) {
//					System.out.println("더 작은 수를 입력하세요.");
//				} else {
//					System.out.println("맞췄습니다.");
//					System.out.println("시도횟수는 "+count+"번입니다.");
//					break; // do-while문을 벗어난다
//				}
//			} catch (Exception e) {
//				System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
//			}
//			
//		
//		}while(true);
		
		
		
		//9
//		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100);
	
	}//main

}

//9
class UnsupportedFuctionException extends RuntimeException{
	private final int ERR_CODE;
	
	
	UnsupportedFuctionException(String msg, int errCode){
		super(msg);
		ERR_CODE = errCode;
	}
	
	UnsupportedFuctionException(String msg){
		this(msg, 100);
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	public String getMessage() {
		return "["+ERR_CODE+"]"+super.getMessage();
	}
	
}
