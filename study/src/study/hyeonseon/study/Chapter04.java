package study.hyeonseon.study;

public class Chapter04 {
	public static void main(String[] args) {
		// 조건문
		
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
		practice14();
		practice15();
	}
	
	// [4-1] 다음의 문장들을 조건식으로 표현하라.
	public static void practice1() {
		System.out.println("\n[4-1] 다음의 문장들을 조건식으로 표현하라.");
		System.out.println("1.int 변수 x가 10보다 크고 20보다 작을 때 true인 조건식");
		int x = 11;
		
		if(x > 10 && x < 20) {
			System.out.println(" : x는 10보다 크고 20보다 작습니다");
		}
		
		System.out.println("2.char 형 변수 ch 가 공백이나 탭이 아닐 때 true인 조건식");
		char ch = '1';
	
		/**
		 * char가 공백이나 탭을 어떻게 저장할 수 있지?
		 */
		
		System.out.println("3.char 형 변수 ch 가 ‘x' 또는 ’X'일 때 true인 조건식");
		char ch2 = 'x';
		
		if(ch2 == 'x' || ch2 == 'X') {
			System.out.println(" : ch2는 'x' 또눈 'X' 입니다.");
		}
		
		System.out.println("4.char 형 변수 ch 가 숫자(‘0’~‘9’)일 때 true인 조건식");
		char ch3 = '1';
		
		for(int i = 48; i < 58; i++) {
			if(ch3 == i) {
				System.out.println(" : ch3의 값은 숫자 '" + (char)i +ch + "' 와 같습니다.");
			}
		}
		
		System.out.println("5.char 형 변수 ch 가 영문자(대문자 또는 소문자) 일 때 true인 조건식");
		char ch4 = 'c';
		
		for(int i = 65; i < 123; i++) {
			if(ch4 == i) {
				System.out.println(" : ch는 영문자입니다.");
			}
		}
		
		System.out.println("6.int 형 변수 year 가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true인 조건식");
		int year = 0;
		
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println(" : year는 true 입니다.");
		}else {
			System.out.println(" : year는 false입니");
		}
		
		System.out.println("7.boolean 형 변수 powerOn가 false일 때 true인 조건식");
		boolean powerOn = false;
		
		if(!powerOn) {
			System.out.println(" : powerOn는 false입니다.");
		}
	
		System.out.println("8.문자열 참조변수 str이 “yes”일 때 true인 조건식");
		String str = "yes";
		
		if(str.equals("yes")) {
			System.out.println(" : str 은 yes 입니다.");
		}
		/*
		 * 참조변수란?
		 */
	}
	
	public static void practice2() {
		System.out.println("\n[4-2] 1 부터 20 까지의 정수 중에서 2 또는 3 의 배수가 아닌 수의 총합을 구하시오");
		int sum = 0;
		for(int i = 1; i <= 20; i++) {
			if(i % 2 != 0 || i % 3 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	public static void practice3() {
		System.out.println("\n[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오");
		int result = 0;
		int temp = 0;
		
		for(int i = 1; i <= 10; i++) {
			temp += i;
			result += temp;
		}
		/*
		 1 - 1
		 2 - 1 + 2
		 3 - 3 + 3
		 4 - 6 + 4
		 */
		
		System.out.println(result);
	}
	
	public static void practice4() {
		System.out.println("\n[4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.");
		int result = 0;
		int num = 1;
		
		while(result <= 100) {
			if(num % 2 == 0) {
				result -= num;
			}else {
				result += num;				
			}
			
			num++;
		}
		System.out.println(num);
	}
	
	public static void practice5() {
		System.out.println("\n[4-5] 다음의 for 문을 while 문으로 변경하시오.");
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void practice5_answer() {
		System.out.println("\n[4-5] 다음의 for 문을 while 문으로 변경하시오.");
		int i = 0;
		
		while(i <= 10) {
			int j = 0;
			
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public static void practice6() {
		System.out.println("\n[4-6] 두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.");
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i + j == 6) {
					System.out.println(i + "와 " + j + "를 더했을 때 " + (i+j) + "이 출력됩니다.");
				}
			}
		}
	}
	
	public static void practice7() {
		System.out.println("\n[4-7] Math.random() 을 이용해서 1 부터 6 사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라. (1)에 알맞은 코드를 넣으시오.");
		
		//int value = ( /* (1) */ );
		//System.out.println("value:"+value);
		
		int value = (int) Math.floor(Math.random() * 6);
		System.out.println("value: " + value);
	}
	
	public static void practice8() {
		System.out.println("\n[4-8] 방정식 2x+4y=10의 모든 해를 구하시오. 단 x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.");
		
		int result = 0;
		
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= 10; j++) {
				if((2*i) + (4*j) == 10) {
					System.out.println("2x+4y=10의 모든 해는 x: " + i + ", y: " + j);
				}
			}	
		}
	}
	
	public static void practice9() {
		System.out.println("\n[4-9] 숫자로 이루어진 문자열 이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.");
		System.out.println("만일 문자열이 '12345'라면, '1+2+3+4+5'의 결과인 15를 출력이 되어야한다. (1)에 알맞은 코드를 넣으시오.");
		
		String str = "12345";
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			// (1) 알맞은 코드를 넣어 완성하시오
			
			sum += (str.charAt(i) - 48);
			
		}
		System.out.println("sum = " + sum);
	}
	
	public static void practice10() {
		System.out.println("\n[4-10] int타입의 변수 num이 있을 때, 자리의 합을 더한 결과를 출력하는 코드를 완성하라");
		System.out.println("만일 변수 num의 값이 12345라면, '1+2+3+4+5'의 결과인 15를 출력하라. (1)에 알맞은 코드를 넣으시오.");
		
		int num = 12345;
		int sum = 0;
		int idx = 1;
		
		// (1) 알맞은 코드를 넣어 완성하시오
		while(true) {
			sum += idx;
			idx++;
			
			if(sum == 15) {
				break;
			}
		}
		
		System.out.println("sum = " + sum);
	}
	
	public static void practice11() {
		System.out.println("\n[4-11] 피보나치 수열은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다.");
		System.out.println("예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 1과 2를 더해서 3이 되어서");
		System.out.println("1,1,2,3,5,8,13,21,..과 같은 식으로 진행된다.");
		System.out.println("1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.");
		
		// Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 세번째 값
		System.out.println(num1 + ", " + num2);
		
		for (int i = 0 ; i < 8 ; i++ ) {
			//(1) 알맞은 코드를 넣어 완성하시오
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
		
		System.out.println("10번째 수: " + num3);
	}
	
	public static void practice12() {
		System.out.println("\n[4-12] 구구단의 일부분을 다음과 같이 출력하시오.");
		/*
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 3; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));	
			}
		}
		*/
		//답 
		for (int i = 1 ; i <= 9 ; i++) {
			for (int j = 1; j <= 3; j++) {
				int x = j+1+(i-1)/3*3;
				int y = i%3==0? 3 : i%3 ;
				
				if(x > 9) // 9 . 10 . 단까지만 출력한다 이 코드가 없으면 단까지 출력된다
					break;
				System.out.print(x+"*"+y+"="+x*y); //println이 아님에 주의
				System.out.print(" ");
				System.out.print(" ");
				System.out.print(" ");
			}
			System.out.println();
			if(i%3==0) System.out.println(); //
		}
	}
	
	public static void practice13() {
		System.out.println("\n[4-13] 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.");
		
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		// charAt(int i) 반복문과 를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
		for(int i=0; i < value.length() ;i++) {
			// (1) 알맞은 코드를 넣어 완성하시오
			for(int j = 48; j <= 57; j++) {
				ch = value.charAt(i);
				if(ch == j) {
					isNumber = true;
				}else {
					isNumber = false;
				}
			}
		}
		
		if (isNumber) {
			System.out.println(value + "는 숫자입니다."); 
		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}
	}
	
	// 틀림!
	public static void practice14() {
		System.out.println("\n[4-14] 다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다."); 
		System.out.println("사용자가 값을 입력하면 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다 사용자가 컴퓨터가 생각한 숫자를 맞추면"); 
		System.out.println("게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. (1)~(2) 에 알맞은 코드를 넣어 프로그램을 완성하시오.");
		
		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다
		int answer = (int) Math.floor(Math.random()*100); //(1)
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수
		/*
		// Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
			count++;
			
			System.out.print("1과 100사이의 값을 입력하세요 :"); 
			input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다
			
			// (2) 알맞은 코드를 넣어 완성하시오
			if(input == answer) {
				System.out.println("시도횟수는 " + count + "입니다.");
				break;
			}else {
				System.out.println("더 큰 수를 입력하세요.");
			}
		} while(true); // 무한반복문
		*/
	}
	
	public static void practice15() {
		System.out.println("\n[4-15] 다음은 회문수를 구하는 프로그램이다 회문수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말한다.");
		System.out.println("예를 들면 ‘12321’이나 ‘13531’같은 수를 말한다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.");
		System.out.println("[hint] 나머지 연산자를 이용하세요.");
		
		int number = 12321;
		int tmp = number;
		int result = 0; // number 변수 를 거꾸로 변환해서 담을 변수
		
		//while(tmp !=0) {
			// (1) 알맞은 코드를 넣어 완성하시오
			
		//}
		
		int a = 0;
		String stmp = "";
		while(tmp !=0) {				
			a = tmp%10;
			stmp += Integer.toString(a);				
			//result = tmp%10;				
			tmp = tmp/10;				
			System.out.println("result: " + result);
		}
		
		result = Integer.parseInt(stmp);
		
		if(number == result)
			System.out.println( number + "는 회문수 입니다"); 
		else
			System.out.println( number + "는 회문수가 아닙니");
	}
}
