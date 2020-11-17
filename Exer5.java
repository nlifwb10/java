import java.util.Arrays;

public class Exer5 {

	public static void main(String[] args) {
		
		//5-1
		/*
		 a.(옳은 것)
		 
		 정답 : d,e
		 
		 //5-2
		 답 : 2
		 		 
		 */
		
		//5-3
//		int[] arr = {10, 20, 30, 40, 50};
//		int sum = 0;
//		
//		for(int i=0;i<arr.length;i++) {
//			sum += arr[i];
//		}
//	
//		System.out.println("sum="+sum);
		
		//5-4
//		int[][] arr={
//				{5,5,5,5,5},
//				{10,10,10,10,10},
//				{20,20,20,20,20},
//				{30,30,30,30,30}
//		};
//		
//		int total = 0;
//		float average =0;
//		
//		int num = 0;
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				total += arr[i][j];
//				num++;
//			}
//		}
//		average = total/((float)num);
//		
//		System.out.println("total="+total);
//		System.out.println("average="+average);
		
				
		//5-5
//		int[] ballArr= {1,2,3,4,5,6,7,8,9};
//		int[] ball3 = new int[3];
//		
//		//배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
//		for(int i=0;i<ballArr.length;i++) {
//			int j = (int)(Math.random()*ballArr.length);
//			int tmp= 0;
//			
//			tmp = ballArr[i];
//			ballArr[i] =ballArr[j];
//			ballArr[j] = tmp;
////			System.out.println(Arrays.toString(ballArr));
//			
//		}
//		ball3=Arrays.copyOf(ballArr, 3);
//		
//		for(int i=0;i<ball3.length;i++) {
//			System.out.print(ball3[i]);
//		}
	
		
		//5-6
		//큰 금액의 동전을 우선적으로 거슬러 줘야한다.
//		int[] coinUnit = {500, 100,  50, 10	};
//		
//		int money = 2680;
//		System.out.println("money="+money);
//		
//		for(int i=0;i<coinUnit.length;i++) {
//			int j = money/coinUnit[i];
//			money =  money%coinUnit[i];
//			System.out.println(coinUnit[i]+"원:"+j);
//		}
	
		//5-7
//		if(args.length!=1) {
//			System.out.println("USAGE: java Exer5 3120");
//			System.exit(0);
//		}
//		 int money = Integer.parseInt(args[0]);
//		  System.out.println("money="+money);
//		  
//		  int[] coinUnit = {500,100,50,10};
//		  int[] coin = {5,5,5,5};
//		  
//		  for(int i=0;i<coinUnit.length;i++) {
//			  int coinNum = 0;
//			  coinNum = money/coinUnit[i]; //금액에서 동전단위로 나눠서 필요한 동전의 개수를 구한다.
//			  
//			  if(coinNum>5) {
//				 coinNum = 5;
//				  coin[i] =0;
//			  }else {
//			  coin[i] = coin[i]-coinNum; //배열 coin에서 coinNum만큼의 동전을 뺀다.
//			  }
//			  
//			  money = money-(coinUnit[i]*coinNum);//금액에서  동전의 개수와 동전단위를 곱한 값을 뺀다.
//			  
//			  
//			  System.out.println(coinUnit[i]+"원:"+coinNum);
//			  
//		  }
//		  
//		  if(money>0) {
//			  System.out.println("거스름돈이 부족합니다.");
//			  System.exit(0);
//		  }
//		  
//		  System.out.println("=남은 동전의 개수=");
//		  
//		  for(int i=0;i<coinUnit.length;i++) {
//			  System.out.println(coinUnit[i]+"원:"+coin[i]);
//		  }
		  
		//5-8
//		int[] answer = {1,4,4,3,1,4,4,2,1,3,2,};
//		int[] counter = new int[4];
//		
//		for(int i=0;i<answer.length;i++) {
//			if(answer[i]==1) {
//				counter[0]++;
//			}else if(answer[i]==2) {
//				counter[1]++;
//			}else if(answer[i]==3) {
//				counter[2]++;
//			}else if(answer[i]==4) {
//				counter[3]++;
//			}
//		}
//		
//		for(int i=0;i<counter.length;i++) {
//			System.out.print(counter[i]);
//			for(int j=0;j<counter[i];j++) {
//			System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//5-9
//		char[][] star  = {
//				{'*','*',' ',' ',' '},
//				{'*','*',' ',' ',' '},
//				{'*','*','*','*','*'},
//				{'*','*','*','*','*'}
//		};
//		
//		char[][] result = new char[star[0].length][star.length];
//		
//		for(int i=0;i<star.length;i++) {
//			for(int j=0; j<star[i].length;j++) {
//				System.out.print(star[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++) {
//				 result[j][3-i] = star[i][j];
//			}
//		}
//		
//		for(int i =0; i<result.length;i++) {
//			for(int j=0;j<result[i].length;j++) {
//				System.out.print(result[i][j]);
//			}
//			System.out.println();
//		}
		
		//5-10
//		char[] abcCode ={ '`','~','!','@','#','$','%','^','&','*',
//				'(',')','-','_','+','=','|','[',']','{',
//				'}',';',':',',','.','/'};
//		
//							//        0    1  2	3	~  					9
//		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
//		
//		String src = "abc123";
//		String result = "";
//		
//		for(int i=0;i<src.length();i++) {
//			char ch = src.charAt(i);
//			
//			if('a'<=ch&&ch<='z') {
//				result+=abcCode[ch-'a'];
//			}else if('0'<=ch&&ch<='9') {
//				result+=numCode[ch-'0'];
//			}
//		}
//		
//		System.out.println("src:"+src);
//		System.out.println("result:"+result);

		//5-11
//		int[][] score = {
//				{100, 100, 100},
//				{20, 20, 20},
//				{30, 30, 30},
//				{40, 40, 40},
//				{50, 50, 50}
//		};
//		
//		int[][] result = new int[score.length+1][score[0].length+1];
//		
//		for(int i=0;i<score.length;i++){
//			for(int j=0;j<score[i].length;j++) {
//				result[i][j]= score[i][j];
//				
//				
//				result[i][3] += score[i][j];
//				result[5][j] += score[i][j];
//				
//				result[5][3]+=score[i][j];
//			}
//		}
//		
//		for(int i=0; i < result.length;i++) {
//			for(int j=0; j < result[i].length;j++) {
//			System.out.printf("%4d",result[i][j]);
//			}
//			System.out.println();
//		}
	
		//5-12
//		String[][] words = {
//				{"chair","의자"},
//				{"computer","컴퓨터"},
//				{"integer","정수"}
//		};
//		
//		java.util.Scanner scanner = new java.util.Scanner(System.in);
//		
//		int num =0;
//		
//		for(int i=0;i<words.length;i++) {
//			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
//			
//			String tmp = scanner.nextLine();
//			
//			if(tmp.equals(words[i][1])) {
//				System.out.printf("정답입니다.%n%n");
//				num++;
//			}else {
//				System.out.printf("틀렸습니다. 정답은 %s입니다%n%n",words[i][1]);
//			}
//		}
//		System.out.println("전체 3문제 중 "+num+"문젲 맞추셨습니다.");
//		
		
		//5-13
//		String[] words = {"television","computer","mouse","phone"};
//		
//		java.util.Scanner scanner = new java.util.Scanner(System.in);
//		
//		for(int i=0;i<words.length;i++) {
//			char[] question = words[i].toCharArray();
//				
//			for(int j=0;j<question.length;j++) { 
//					int x = (int)(Math.random()*question.length);
//					char tmp;
//					tmp = question[j];
//					question[j] = question[x];
//					question[x] =tmp;
//				}//for j
//				
//			System.out.printf("Q%d. %s의 정답을 입력하세요>", i+1, new  String(question));
//	  
//			String answer = scanner.nextLine();
//			
//			if(words[i].equals(answer.trim())) {
//				System.out.printf("맞았습니다.%n%n");
//			}else {
//				System.out.printf("틀렸습니다.%n%n");
//			}
//		
//		}
		
		
	
	}//main

}
