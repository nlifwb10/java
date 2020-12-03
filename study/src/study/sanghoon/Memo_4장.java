package study.sanghoon;

public class Memo_4장 {
	/*
	 
	▶  str.equals("yes") -> 대소문자 구분
	▶  str.equalsIgnoreCase("yes") -> 대소문자 구분안함
	
	▶switch문
	 - 조건문이 많을때 if문보다 더유용함
	 - (조건식) 결과는 정수 또는 문자열이어야 한다.
	 - case문의 값은 정수 상수(문자포함) , 문자열만 가능하며, 중복되지않아야한다.
	▶ switch문은 if문으로 변경이가능
	▶if문을 switch문으로 변경 안될가 있음(제약조건문에..)
	
	▶Math.random();
	 - 0.0 <= Math.ramdom() < 1.0
	 - 원하는 정수 범위값 만드는법
	   ex) 1~10까지 범위
	    -> (int)(Math.ramdom()*10)+1
	    
	▶    do-while문
	 - 최소 한번이상 무조건 실행함
	 - 입력을 받을때 사용하는게 좋음
	 
	▶ break문
	 - 자신이 속한 하나의 반복문을 빠져나온다. 
	
	▶ continue문
	 - 자신이 포함된 반복문 끝으로 이동-다음반복으로 넘어감 
	
	▶ 이름붙은 반복문 break;
	 - 반복문에 이름을 붙이고 break 반복문이름; -> 해당 이름 반복문을 빠져나온다. 
	 - 쓸수있다는 정도만알고있자! 거의 쓰진않음.
	
	*/
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	
//		for(int i=0;i<5;i++) {
//			for(int j =0;j<10;j++) {
//				System.out.printf("*");
//			}
//			System.out.println();
//		}
		int i = 0;
		while(5>i) {
			System.out.println("*****");
			i++;
		}
	}

}
