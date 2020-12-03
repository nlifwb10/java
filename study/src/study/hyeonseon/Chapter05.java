package study.hyeonseon;

import java.util.Scanner;

public class Chapter05 {
	public static void main(String[] args) {
		// 배열
		practice1();
		practice2();
		practice3();
		practice4();
		practice5();
		practice6();
		practice7();
		practice8();
		practice9();
		practice10();
		practice11();
		practice12();
		practice13();
	}

	public static void practice1() {
		System.out.println("\n[5-1] 다음은 배열을 선언하거나 초기화한 것이다 잘못된 것을 고르고 그 이유를 설명하시오.");
		System.out.println("a, f");
		System.out.println("a : 배열 괄호는 자료형 뒤나 변수명 뒤에 한번만 써주면 된다.");
		System.out.println("f : 배열 선언의 괄호는 자료형 뒤나 변수명 뒤에, 2차원 배열의 크기를 선언해주려면 모두 선언해줘야 한다.");
	}
	
	public static void practice2() {
		System.out.println("\n[5-2] 다음과 같은 배열이 있을 때 arr[3].length의 값은 얼마인가?");
		System.out.println("arr[3].length = " + 4);
	}
	
	public static void practice3() {
		System.out.println("\n[5-3] 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.");
		
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		// (1) 알맞은 코드를 넣어 완성하시오
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum = " + sum);
	}
	
	public static void practice4() {
		System.out.println("\n[5-4] 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오");
		
		int[][] arr = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };
		int total = 0;
		float average = 0;
				
		// (1) 알맞은 코드를 넣어 완성하시오
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
		}
		average = (float)total / (arr.length * arr[0].length);	//int로 자동 형변환되서 계산되기 때문에 최종적으로 float으로 형변환해줘야 한다. 
		
		System.out.println("total = " + total);
		System.out.println("average = " + average);
	}
	
	// 못품, 문제가 난해함;;
	public static void practice5() {
		System.out.println("\n[5-5] 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.\n (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.");
		System.out.println("Math.random()을 사용했기 때문에 실행결과와 다를 수 있다.");
		
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다
		for(int i = 0; i < ballArr.length; i++) {
			int j = (int)(Math.random() * ballArr.length) + 1;
			int tmp = ball3[i];
			
			// (1) 알맞은 코드를 넣어 완성하시오
			if(tmp != j) {
				ball3[i] = j;
			}
			
			if(ball3[2] == 0) {
				break;
			}
		}
		
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다
		// (2)
		for(int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}
		System.out.println();
	}
	
	public static void practice6() {
		System.out.println("\n[5-6] 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.\n" + 
				"변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라.\n" + 
				"단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.");
		System.out.println("[Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.");
		System.out.println();
		
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money = " + money);
		
		for(int i = 0; i < coinUnit.length; i++) {
			//(1) 알맞은 코드를 넣어 완성하시오
			if(money % coinUnit[i] == 0) {
				money /= coinUnit[i];
			}else {
				i++;
				System.out.println(coinUnit[i] + "원: " + Math.floor(money/coinUnit[i]));
			}
			
		}
	}
	
	public static void practice7() {
		System.out.println("\n[5-7] 문제 5-6 에 동전의 개수를 추가한 프로그램이다. 커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산한다.\n" + 
				"보유한 동전의 개수로 거스름돈을 지불할 수 없으면 ‘거스름 돈이 부족합니다.’라고 출력하고 종료한다.\n" + 
				"지불할 돈이 충분히 있으면 거스름돈을 지불한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다.\n" + 
				"(1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.");
		
		// 문자열을 숫자로 변환한다 입력한 값이 숫자가 아닐 경우 예외가 발생한다
		int money = Integer.parseInt("2680");
		
		System.out.println("money="+money);
		
		int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
		int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
		
		for(int i=0;i<coinUnit.length;i++) {
			int coinNum = 0;
			/* (1) 아래의 로직에 맞게 코드를 작성하시오
				1. 금액(money) 을 동전단위로 나눠서 필요한 동전의 개수(coinNum) 를 구한다
				2. 배열 coin 에서 coinNum 만큼의 동전을 뺀다
					(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다)
				3. 금액에서 동전의 개수(coinNum) 와 동전단위를 곱한 값을 뺀다
			*/
			System.out.println(coinUnit[i] + "원 : " + coinNum); 
		}
		if(money > 0) {
			System.out.println("거스름돈이 부족합니다."); 
			//System.exit(0); // . 프로그램을 종료한다
		}
		
		System.out.println("= 남은 동전의 개수 ="); 
		
		for(int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원 :" + coin[i]); 
		}
	}
	
	// 이것도 문제가 난해...
	public static void practice8() {
		System.out.println("\n[5-8] 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’을 찍어서\n" + 
				"그래프를 그리는 프로그램이다 (1)~(2)에 알맞은 코드를 넣어서 완성하시오.");
		
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		for(int i=0; i < answer.length;i++) {
			// (1) 알맞은 코드를 넣어 완성하시오
			int num = (int)Math.random();
		}
		for(int i=0; i < counter.length;i++) {
			// (2) 알맞은 코드를 넣어 완성하시오
			System.out.println();
		}
	}
	
	// 풀엇다링!
	public static void practice9() {
		System.out.println("\n[5-9] 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.");
		
		char[][] star = { 
				{ '*', '*', ' ', ' ', ' ' }, 
				{ '*', '*', ' ', ' ', ' ' }, 
				{ '*', '*', '*', '*', '*' },
				{ '*', '*', '*', '*', '*' } }
		;
		char[][] result = new char[star[0].length][star.length];
		
		/*
		 char[][] star = new char[4][5];
		 char[][] result = new char[5][4];
		 */
		
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				// (1) 알맞은 코드를 넣어 완성하시오
				
				if(star[i][j] != ' ') {
					result[j][i] = star[i][j];					
				}
			}
		}
		/* 
		 { '*', '*', '*', ' '},
		 { '*', '*', '*', ' '},
		 { ' ', ' ', '*', ' '},
		 { ' ', ' ', ' ', ' '},
		 { ' ', ' ', ' ', ' '}
		 */
		
		/*
		int[][] score = new int[5][3];
		int[][] result = new int[score.length + 1][score[0].length + 1];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				// (1) 알맞은 코드를 넣어 완성하시오
				int tmp = score[i][j];
				
				result[i][j] = tmp;
				result[i][score[i].length] += tmp;
				result[score.length][j] += tmp;
			}
			result[score.length][score[i].length] += result[i][score[i].length];
		}
		 */
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
	
	// ㅠ풀엇다
	public static void practice10() {
		System.out.println("[5-10] 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다. (1) 에 알맞은 코드를 넣어서 완성하시오.");
		
		char[] abcCode = { 
				'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', 
				'-', '_', '+', '=', '|', '[', ']', '{', '}', ';', ':', ',', '.', '/' 
		};
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		String src = "abc123";
		String result = "";
		
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			// (1) 알맞은 코드를 넣어 완성하시오
			
			int num = (int)ch;
			for(int j = 0; j < abcCode.length; j++) {
				if((num - 97) == j) {
					result += abcCode[j];
				}
			}
			for(int j = 0; j < numCode.length; j++) {
				if((num - 48) == j) {
					result += numCode[j];
				}
			}
			
		}
		System.out.println("src:" + src);
		System.out.println("result:" + result);
	}
	
	// 풀엇다링~!
	public static void practice11() {
		System.out.println("\n[5-11] 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열 \n" + 
				"행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다. (1)에 알맞은 코드를 넣어서 완성하시오.");
		
		int[][] score = { 
				{ 100, 100, 100 }, 
				{ 20, 20, 20 }, 
				{ 30, 30, 30 }, 
				{ 40, 40, 40 }, 
				{ 50, 50, 50 } 
		};
		
		int[][] result = new int[score.length + 1][score[0].length + 1];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				// (1) 알맞은 코드를 넣어 완성하시오
				int tmp = score[i][j];
				
				result[i][j] = tmp;
				result[i][score[i].length] += tmp;
				result[score.length][j] += tmp;
			}
			result[score.length][score[i].length] += result[i][score[i].length];
		}
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void practice12() {
		System.out.println("\n[5-12] 예제 5-23을 변경하여 아래와 같은 결과가 나오도록 하시오.");
	}
	
	// 풀었
	public static void practice13() {
		System.out.println("\n[5-13] 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다 실행결과와 같이 동작하도록 예제의 빈 곳을 채우시오.");
		
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray(); // String char[] 을 로 변환
			// (1) 맞은 코드를 넣어 완성하시오 char배열 question에 담긴 문자의 위치를 임의로 바꾼다
			
			for(int j = 0; j < question.length; j++) {
				int num = (int)Math.floor(Math.random() * question.length);
				
				char tmp = question[i]; 
				question[i] = question[num];
				question[num] = tmp;
			}
			System.out.printf("Q%d. %s의 정답을 입력하세요 >", i + 1, new String(question));
			
			String answer = scanner.nextLine();
			
			// trim() answer , equals word[i] 으로 의 좌우 공백을 제거한 후 로 와 비교
			if (words[i].equals(answer.trim()))
				System.out.printf("맞았습니다.%n%n");
			else
				System.out.printf("틀렸습니다.%n%n");
		}
	}
}
