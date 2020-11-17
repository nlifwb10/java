

public class Exer4 {

	public static void main(String[] args) {
		/*	
		//4-1		
		1.10 < x && x < 20
		2.!(ch =' ' && ch ='/t')
		3. ch ='x'||ch='X'
		4.'0' <= ch && ch <='9'
		5.('a'<=ch && ch <= 'z') ||('A'<=ch && ch <= 'Z')
		 
		6.year%400==0 || year%4==0 || !(year%100==0)
		
		7.powerOn!=false ??
		8.str.equals("yes")
		*/
		
		  //4-2
//		int sum =  0;
//		
//		for(int i=1;i<=20;i++) {
//			if(!(i%2==0 || i %3==0)) {
//				System.out.printf("%d  + %d = ",sum, i); // sum , i 값 확인
//				sum += i;
////				System.out.println("i :"+i);
//				System.out.println(sum);
//			}
//		}
		
		
		//4-3
//		int sum = 0;
//		int  a = 0;
//		
//		for(int i =1;i<=10;i++) {
//			System.out.printf("%d+", sum);
//			sum += a +i;
//			System.out.printf("(%d+%d)=%d%n",a,i,sum);
//			a +=i;
//			System.out.println("--------------------");
//		}
		
		
		//4-4
//		int sum =0;
//		for(int i=1;sum<100;i++) {
//			if(i%2==0) {
//				i = -i;
//			}
//		
//			sum += i;
//			
//			if(i<0) {
//				i=-i;
//			}
//			
//			System.out.println(i);
//			System.out.println(sum);
//			System.out.println("-------------");
//		}
//		
//		System.out.println("합계:"+sum);
		
		
		//4-5
		
//		for(int i = 0;i<=10;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		int i=0;
//		
//		while(i<=10) {
//			int j =0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//4-6
//		for(int i=1;i<=6;i++) {
//			for(int j=1;j<=6;j++) {
//				if(i+j==6) {
//					System.out.printf("%d+%d+%d%n", i,j,i+j);
//				}
//			}
//		}
	
		//4-7
//		for(int i=0;i<20;i++) {
//			int value = (int)(Math.random()*6)+1;
//			System.out.println(value);
//		}
		//4-8
//		for(int x = 0;x<=10;x++) {
//			for(int y = 0;y<=10;y++) {
//				if(2*x+4*y==10) {
//					System.out.println("x="+x+", y="+y);
//				}
//			}
//		}
		
		//4-9
//		String str ="12345";
//		int sum = 0;
//		
//		for(int i=0;i<str.length();i++) {
//			int j = str.charAt(i)-48;
//			sum+=j;
//		}
//		System.out.println("sum="+sum);
		
		//4-10
//		int num =12345;
//		int sum = 0;
//		
//		for(int i=0;num>0;i++) {
//			sum += num%10;
//			num /=10;
//			System.out.println(num);
//		}
//		System.out.println("sum="+sum);
//	
		
		//4-11
//		int num1 = 1;
//		int num2 = 1;
//		int num3 = 0;
//		System.out.print(num1+","+num2);
//		
//		for(int i = 0; i  <8 ; i++) {
//			num3 = num1+num2;
//			System.out.print(","+num3);
//			
//			num1=num2;
//			num2=num3;
//			
//		}
		
		
		// 4-12
//		for(int j=2;j<9;j=j+3) {
//		for(int i=1;i<4;i++) {
//		
//				System.out.printf("%d*%d=%2d     ",j,i,j*i);
//				System.out.printf("%d*%d=%2d     ",j+1,i,(j+1)*i);
//				if(j+2==10) { //10단을 제외하기위해
//					System.out.println();
//				}
//				if(j+2<10) {
//				System.out.printf("%d*%d=%2d%n",j+2,i,(j+2)*i);
//				}
//				if(i==3) {
//				System.out.println();
//				System.out.println();
//			}
//		}	
//		}
		//4-13
//		String  value ="12o34";
//		char ch =  ' ';
//		boolean  isNumber  = true;
//		
//		for(int i=0;i<value.length();i++) {
//			ch = value.charAt(i);
//			
//			if('0'<=ch&&ch<='9') {
//				isNumber = true;
//			}else {
//				isNumber = false;
//				break;
//			}
//		}
//		if(isNumber) {
//			System.out.println(value+"는 숫자입니다.");
//		}else {
//			System.out.println(value+"는 숫자가  아닙니다.");
//		}
		
		//4-14
//		int answer = (int)(Math.random()*100)+1;
//		int input = 0;
//		int count = 0;
////		System.out.println(answer);
//		java.util.Scanner s  = new java.util.Scanner(System.in);
//		
//		do {
//			count++;
//			System.out.print("1과 100사이의 값을 입력하세요 :");
//			input =s.nextInt();
//			
//			if(answer==input){
//				System.out.println("맞췄습니다.");
//				System.out.println("시도회수는 "+count+"번입니다.");
//				break;
//			}else if(answer>input) { //입력값이 더작을때
//				System.out.println("더  큰 수를 입력하세요.");
//			}else if(answer<input) {
//				System.out.println("더  작은 수를 입력하세요.");
//		
//			}
//		}while(true) ;
//		
		
		//4-15
//		int number = 12321;
//		int tmp = number;
//		
//		int result=0; //변수  number를 거꾸로 반환해서 담을 변수
//		 
//		while(tmp != 0) {
//			result = (result *10)+tmp%10;
//			System.out.println(result);
//			tmp /=10;		
//			System.out.println(tmp);
//		}
//		
//		if(number == result) {
//			System.out.println(number+"는 회문수 입니다.");
//		}else {
//			System.out.println(number+"는 회문수가 아닙니다.");
//		}
//		
		
	}//main

}
