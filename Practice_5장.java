package java_05_배열;

import java.util.Scanner;

public class Practice_5장 {

/*
	5-1
 		a -> [] 2개
		f-> []2개

 
	5-2
		답 : 2
 
	5-3
		 답:
		
		 for(int i = 0; i <arr.length;i++){
		
		   sum += arr[i];
		
		 }

	5-4

		답: 

		int cnt =0;
				
		for(int i =0 ; i<arr.length; i++){
		
		 for(int j = 0; j < arr[i].length;j++){
		
			total += arr[i][j];
		
			cnt += 1 ;
		
		 }
		
		}

 

	5-5

		답:
		
		// ballArr . 배열 의 임의의 요소를 골라서 위치를 바꾼다
		
		  for(int i=0; i< ballArr.length;i++) {
		
			int j = (int)(Math.random() * ballArr.length);									
		
			int tmp = 0;			
		
			tmp = ballArr[i];
		
			ballArr[i] = ballArr[j];
		
			ballArr[j] = tmp;
						
		  }
		
		  // ballArr 3 ball3 . 배열 의 앞에서 개의 수를 배열 로 복사한다
		
		  for(int i =0 ; i<3 ; i++){
		
			ball3[i] = ballArr[i];
		
		  } -->이부분은 System.arraycopy사용할수있음		
 
	5-6

	 답:
 
	 	int[] arrStr = new int[coinUnit.length];		

		for(int i=0;i<coinUnit.length;i++) {			

			int tmpMoney = 0;			

			tmpMoney = money - (coinUnit[i] *	(money/coinUnit[i]));							

			arrStr[i] = money/coinUnit[i];			

			money = tmpMoney;						

		}
		
		for(int i = 0;i < arrStr.length;i++){
	
			System.out.println(coinUnit[i]+"원 :"+arrStr[i]);
	
		}
		
	5-7

		답 :

		int coinNum = 0;
			
		coinNum = money / coinUnit[i];	

		if(coinNum > coin[i] ){

			coinNum = coin[i];

			money = money - (coinUnit[i]*coinNum);

			coin[i] = coinNum -coin[i];

		}else{

			money = money - (coinUnit[i]*coinNum);

			coin[i] =  coin[i] -coinNum;

		}

	5-8

    	답: 문제를 이해못함..
 
	5-9
		답:
		int x = j;
		int y = star.length-1-i;
		result[x][y]=star[i][j];
	
	5-10
		답:
		char ch = src.charAt(i);
				
		if(!(48 <= ch && ch <= 57)) {
			//문자부분
			result += abcCode[i];
		}else {
			//숫자부분
			result += numCode[ch-'0'];
		}
	
	5-11
		답:
				result[i][j] = score[i][j];							
				result[i][score[0].length] += result[i][j];
				
				여기까지밖에..
	5-12
		답:
		
		String[][] words = {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}			
		};
		
		Scanner sc = new Scanner(System.in);
		
		int correctCnt = 0; 
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s의뜻은?",i+1, words[i][0]);
			
			String tmp = sc.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.println("정답입니다.");
				correctCnt++;
			}else {
				System.out.printf("틀렸습니다. 정답은  %s 입니다, %n%n",words[i][1]);
			}
			
		}
		System.out.println("전체"+words.length + "문제 중 "+ correctCnt+ "문제 맞추셨습니다.");
	

 		5-13
 		 	답:
 		 	int ranIndex = (int)(Math.random()*question.length);
			char tmp = ' ';
			
			tmp = question[i];
			question[i] = question[ranIndex];
			question[ranIndex] =tmp;
 		
	 */
	
	public static void main(String[] args) {
		
		

	}
		

}
