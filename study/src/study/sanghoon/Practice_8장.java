package study.sanghoon;

import java.util.Arrays;


import java.util.*;


public class Practice_8�� {

	/*
		8-1
		 ���� - ���α׷����� �߻��Ǵ� ���ܹ߻������Ѱ�
		 ���� - ���������� ���Ḧ �������� 
		 
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
				System.out.println("��ȿ���� ���� ���Դϴ� �ٽ� ���� �Է����ּ���");
				continue;
			}
		
		  8-9
		    	public static void main(String[] args) {
						try {
							throw new UnsupportedFuctionException(" �������� �ʴ� ����Դϴ� .",100);
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


