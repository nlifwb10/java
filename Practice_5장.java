package java_05_�迭;

import java.util.Scanner;

public class Practice_5�� {

/*
	5-1
 		a -> [] 2��
		f-> []2��

 
	5-2
		�� : 2
 
	5-3
		 ��:
		
		 for(int i = 0; i <arr.length;i++){
		
		   sum += arr[i];
		
		 }

	5-4

		��: 

		int cnt =0;
				
		for(int i =0 ; i<arr.length; i++){
		
		 for(int j = 0; j < arr[i].length;j++){
		
			total += arr[i][j];
		
			cnt += 1 ;
		
		 }
		
		}

 

	5-5

		��:
		
		// ballArr . �迭 �� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�
		
		  for(int i=0; i< ballArr.length;i++) {
		
			int j = (int)(Math.random() * ballArr.length);									
		
			int tmp = 0;			
		
			tmp = ballArr[i];
		
			ballArr[i] = ballArr[j];
		
			ballArr[j] = tmp;
						
		  }
		
		  // ballArr 3 ball3 . �迭 �� �տ��� ���� ���� �迭 �� �����Ѵ�
		
		  for(int i =0 ; i<3 ; i++){
		
			ball3[i] = ballArr[i];
		
		  } -->�̺κ��� System.arraycopy����Ҽ�����		
 
	5-6

	 ��:
 
	 	int[] arrStr = new int[coinUnit.length];		

		for(int i=0;i<coinUnit.length;i++) {			

			int tmpMoney = 0;			

			tmpMoney = money - (coinUnit[i] *	(money/coinUnit[i]));							

			arrStr[i] = money/coinUnit[i];			

			money = tmpMoney;						

		}
		
		for(int i = 0;i < arrStr.length;i++){
	
			System.out.println(coinUnit[i]+"�� :"+arrStr[i]);
	
		}
		
	5-7

		�� :

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

    	��: ������ ���ظ���..
 
	5-9
		��:
		int x = j;
		int y = star.length-1-i;
		result[x][y]=star[i][j];
	
	5-10
		��:
		char ch = src.charAt(i);
				
		if(!(48 <= ch && ch <= 57)) {
			//���ںκ�
			result += abcCode[i];
		}else {
			//���ںκ�
			result += numCode[ch-'0'];
		}
	
	5-11
		��:
				result[i][j] = score[i][j];							
				result[i][score[0].length] += result[i][j];
				
				��������ۿ�..
	5-12
		��:
		
		String[][] words = {
				{"chair","����"},
				{"computer","��ǻ��"},
				{"integer","����"}			
		};
		
		Scanner sc = new Scanner(System.in);
		
		int correctCnt = 0; 
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s�Ƕ���?",i+1, words[i][0]);
			
			String tmp = sc.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.println("�����Դϴ�.");
				correctCnt++;
			}else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������  %s �Դϴ�, %n%n",words[i][1]);
			}
			
		}
		System.out.println("��ü"+words.length + "���� �� "+ correctCnt+ "���� ���߼̽��ϴ�.");
	

 		5-13
 		 	��:
 		 	int ranIndex = (int)(Math.random()*question.length);
			char tmp = ' ';
			
			tmp = question[i];
			question[i] = question[ranIndex];
			question[ranIndex] =tmp;
 		
	 */
	
	public static void main(String[] args) {
		
		

	}
		

}
