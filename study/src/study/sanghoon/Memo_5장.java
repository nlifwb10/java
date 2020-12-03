package study.sanghoon;

import java.util.Arrays;

public class Memo_5장 {

	/*
	
	▶배열의 특징!
	 - 배열은 한번 생성하면 그 길이를 바꿀수 없다!!!
	
	▶ int[] score;
	  score = {1,2,3,4,5}; ---> 에러! 줄바꿔쓰면 new int[] 생략불가
	
	▶ 하지만 int[] score = {1,2,3,4,5}; 이렇게쓰면 생략가능!
	
	▶char[] chArr = {'A','B','C'} 
	 System.out.println(chArr)--->하면 그대로 나옴 문자형은..
	 
	▶Arrays.toString() 함수
	 - 배열을 문자열로 출력해줌.
	 
	▶import 단축키 
	  - ctrl + shift + o
	  	
	▶2차원배열
	 - 테이블 형태의 데이터를 저장하기 위한 배열
	 - int[][] score = new int[4][3];
	                  -> 4는 행 3은 열
	 - 마지막 인덱스범위는 [4-1][3-1]
	 - 초기화 할는 테이블 형태로 초기화하자!
	 ex) int[][] score = {
	 						{100,100,100},
	 						{20,20,20},
	 						{30,30,30},
	 						{40,40,40}	                 	
	                 	  }
	                 	  이런식으로..
	  
	▶String 클래스는 내용을 변경할수 없다!!
	 -주요 메서드
	  -> charAt() ->문자위치
	  -> length()  -> 문자열길이
	  -> substring(from ~to) - to는 포함안됨 / 문자열잘라서가져올때
	  -> equals() ->문자열값 비교
	  -> toCharArray() ->문자열 하나씩배열로 저장
	  
	  ▶Arrays
	  - 1차원 배열 비교할때는  Arrays.equals(arr1,arr2)
	  - 2차원 배열 비교할때는  Arrays.deepEquals(arr1,arr2)
	  - int[] arr2 = Arrays.copyOf(arr,arr.length); ->배열 복사/ 어디까지
	  - int[] arr2 = Arrays.copyOfRange(arr,arr.length,from,to); ->배열 복사/어디서부터~어디까지복사할껀지
	  - Arrays.sort(arr) 배열정렬!
	  	  
	  
		
		
	
	*/
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("매개변수");
		
	}

}