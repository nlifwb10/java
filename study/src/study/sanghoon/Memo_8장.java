package study.sanghoon;

import java.io.File;
import java.io.IOException;

//import java.util.Date;

//import java.util.Date;

public class Memo_8장 {
	
	
	/*	
	  
	  ▶ 프로그램 오류
	  - 컴파일 에러 : 컴파일 할 떄 발생하는 에러
	  - 런타임 에러 : 실행 할 때 발생하는 에러
	  - 논리적 에러 : 작성 의도와 다르게 동작
	  
	  ▶ 런타임 에러 두가지
	  - 예외 : 미약한 오류
	  - 에러  : 심각한 오류
	  
	   ▶ Exception 과 RuntimeException 
	   - Exception : 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
	   - RuntimeException클래스들 : 프로그래머의 실수로 발생하는 예외
	  
	  ▶ try - catch문
	  - 예외발생 catch문을 보고 첫번째부터 확인한다음에 있으면 빠져나옴.
	        만약에 없으면 catch문 다찾음. 근데 없으면 다시빠져나옴.
	  - 예외처리를 못하면 비정상적인 프로그램 종료가됨!!!!
	  ex) try {
	  			System.out.print(0/0) ->ArithmeticException을발생
	  	  } catch (ArithmeticException ae){
	  	  	
	  	  } catch (Exception e ){
	  	   -->Exception은 맨마지막에와야한다. 모든 예외를 처리하므로..	  	  
	  	    
	  	  }
	  	  
	   ▶ printStackTrace() 와 getMessage()
	   - printStackTrace() : 예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다.
	   - getMessage() : 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
	   
	   
	   ▶ 멀티 catch블럭
	   - 내용이 같은 catch블럭을 하나로 합친 것
	   - catch (ExceptionA | ExceptionB e)
	   - 주의 -> catch (ParentException | ChildException e) // 에러! 부모자식 관계 x
	   - 왜냐하면 ParentException 을쓰면 ChildException 을 안써도됨! 부모클래스로쓰면됨 다형성?때문에..인듯
	   
	   ▶ 예외 발생시키기
	   1. 연산자 new를 이용해서 발생시키려는 예외클래스의 객체를 만든다음
	   2. 키워드 throw를 이용해서 예외를 발생시킨다.
	   ex) Exception e = new Exception("고의로 발생!");
	   	   throw e;
	    
	    ▶ checked 예외 , unchecked 예외
	    - checked 예외 : 컴파일러가 예외 처리 여부를 체크 (예외 처리 필수)--> Exception 
	    - unchecked 예외 : 컴파일러가 예외 처리 여부를 체크 안함(예외 처리 선택) --> RuntimeException
	      
	    ▶  메서드에 예외 선언하기
	    - 예외를 처리하는 방법 : try-catch문 , 예외 선언하기 ,은폐 ,이렇게 3가지방법이있음.
	    - 은폐는 try-catch 문을 쓰는데 catch문에 아무것도 안쓰는거임
	    
	    ▶  예외 되던지기
	    - 예외를 catch문에서 throw e; 해서 다시 발생시키기(호출한곳으로)
	    	  
	     ▶  연결된 예외
	    - 한 예외가 다른 예외를 발생시킬 수 있다.
	    - 예외 A가 예외 B를 발생시키면 A는 B의 원인 예외(cause exception)
	    - 이유는 ? 여러 예외를 하나로 묶어서 다루기위해서 연결된예외를 쓴다.
	    - checked 예외를 -> unchecked 예외로 변경할때 사용함!
	    
	  
	      
	    
	*/

	public static void main(String[] args) {
		
		try {
			System.out.println(0/0);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			System.out.println("파이널리");
		}
		System.out.println("끝");
		
	}
	
}



