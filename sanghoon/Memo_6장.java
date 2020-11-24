package sanghoon;


public class Memo_6장 {
	
	
	/*	
	  
	  ▶ 객체지향언어(OOP)핵심개념 
	  - 캡슐화
	  - 상속
	  - 추상화
	  - 다형성
	 
	 ▶ 클래스 와 객체
	 - 클래스 -> 설계도
	 - 객체 -> 제품
	
	 ▶ 객체와 인스턴스
	 - 객체 = 인스턴스 같다고 보면된다.
	 - 클래스    ----> 인스턴스(객체)	 
	       (인스턴스화) 
	 
	 ▶ public class이름과 소스파일이름이 일치해야함!
	
	 ▶ 객체 배열
	 
	 ▶  선언위치에 따른 변수와 종류
	 - 인스턴스변수 
	 - 클래스변수
	 - 지역변수
	
	▶ 클래스 영역은 선언만된다!! 더하기 sysout같은건 쓸수없음..
	
	▶ 공통속성은 cv / 개별속성은 iv 
	
	▶ cv 를 쓸때는 객체.변수  이렇게 쓰자!
	
	▶  static 메서드를 사용하는이유는 iv를 사용하지않을떄!(iv 인스턴스 변수)
	
	▶  인스턴스 메서드는 iv를 사용 !!!
	
	▶ static변수는 언제붙여야할까?-> 공통속성이 있을때 붙인다
	
	▶ static 메서드는 언제붙이는가? -> iv를 사용안할떄
	
	▶ static 정리 !!
	 - static 은 인스턴스 메서드 및 인스턴스 변수 사용 x! 이것만알자!
	 
	▶ 생성자
	- 인스턴스가 생성될때마다 호출되는 '인스턴스 초기화 메서드'
	- 반환값이 항상없다.
	- 모든클래스는 반드시 생성자를 가져야한다.
	
	  
		
		
	
	*/
	String a = "1";
	static String c = "1";
	int b = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("매개변수");
		
	}
	
	static String test() {
		
		return c;
	}
	

}
 class test {
	
}
