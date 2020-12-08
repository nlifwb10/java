package study.sanghoon;

import java.util.Arrays;


import java.util.*;


public class Practice_8장 {

	/*
		8-1
		 정의 - 프로그램에서 발생되는 예외발생에대한것
		 목적 - 비정상적인 종료를 막기위해 
		 
		8-2
		 d
		
		8-3
		  d
		
		8-4
		  c
		  
		8-5
		   1
		   3
		   5
		   ------
		   1
		   2
		   5
		   6
		   
		 8-6
		    3
		   	5
		  
		 8-7
		 	1
		 
		 8-8
		 	try {
				input = new Scanner(System.in).nextInt();
			} catch (InputMismatchException e) {
				System.out.println("유효하지 않은 값입니다 다시 값을 입력해주세요");
				continue;
			}
		
		  8-9
		    	public static void main(String[] args) {
						try {
							throw new UnsupportedFuctionException(" 지원하지 않는 기능입니다 .",100);
						} catch (UnsupportedFuctionException e) {
							e.printStackTrace();
						}
						
						
					}
					
				
				}
				
				class UnsupportedFuctionException extends RuntimeException{
					final private int ERR_CODE = 100;
					private String detailMessage;
					
					public UnsupportedFuctionException(String errMsg , int errCode) {
						this.detailMessage = errMsg;
					}
					
					public int getErrorCode() {
						return this.ERR_CODE;
					}
					
					@Override
					 public String getMessage() {
						return "[" + ERR_CODE +"]" + this.detailMessage;
					}
				}
				
			8-10
				2
				4
				7
				
				
		 	
		   
		
	*/
	public static void main(String[] args) {
		
	}		
	


} 


