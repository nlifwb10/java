package study.hyeonseon;

import java.util.ArrayList;
import java.util.Scanner;

//문제1
class SutdaCard2 {
	int num;
	boolean isKwang;

	SutdaCard2() {
		this(1, true);
	}

	SutdaCard2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	/*
	 * public boolean equals(Object obj) { // (1) num, isKwang 매개변수로 넘겨진 객체의 과 멤버변수
	 * 을 비교하도록 오버라이딩 하시오 num, isKwang }
	 */
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

// 문제2
class Point3D {
	int x, y, z;

	Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	Point3D() {
		this(0, 0, 0);
	}
	/*
	 * public boolean equals(Object obj) { // (1) x, y, z . 인스턴스변수 를 비교하도록 오버라이딩하시오
	 * }
	 * 
	 * public String toString() { // (2) x, y, z . 인스턴스변수 의 내용을 출력하도록 오버라이딩하시오 }
	 */
}

public class Chapter09 {
	
	public static void main(String args[]) {
		System.out.println("PDF 73 ~");

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
	}
	
	public static void practice1() {
		System.out.println("\n문제9-1 ========================================");
		System.out.println("공부하고 다시 풀기");
		
		SutdaCard2 c1 = new SutdaCard2(3,true);
		SutdaCard2 c2 = new SutdaCard2(3,true);
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c1.equals(c2):"+c1.equals(c2));
	}
	
	public static void practice2() {
		System.out.println("\n문제9-2 ========================================");
		System.out.println("공부하고 다시 풀기");
		
		Point3D p1 = new Point3D(1,2,3);
		Point3D p2 = new Point3D(1,2,3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1==p2?"+(p1==p2));
		System.out.println("p1.equals(p2)?"+(p1.equals(p2)));
	}
	
	public static void practice3() {
		System.out.println("\n문제9-3 ========================================");
		
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		// 답
		path = fullPath.substring(0, 14);
		fileName = fullPath.substring(15, fullPath.length());
		
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);			//c:\jdk1.8\work
		System.out.println("fileName:"+fileName);	//PathSeparateTest.java
	}
	
	public static void practice4() {
		System.out.println("\n문제9-4 ========================================");
		
		printGraph(new int[]{3,7,1,4},'*');
	}
	
	public static void practice5() {
		System.out.println("\n문제9-5 ========================================");
		
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
	}
	
	public static void practice6() {
		System.out.println("\n문제9-6 ========================================");
		
		String src = "12345";
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
	}
	
	public static void practice7() {
		System.out.println("\n문제9-7 ========================================");
		
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));
	}
	
	public static void practice8() {
		System.out.println("\n문제9-8 ========================================");
		System.out.println("공부하고 다시 풀기");
		
		System.out.println(round(3.1415,1));
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));
	}
	
	public static void practice9() {
		System.out.println("\n문제9-9 ========================================");
		System.out.println("공부하고 다시 풀기");
		
		System.out.println("(1!2@3^4~5)"+" -> "
				+ delChar("(1!2@3^4~5)","~!@#$%^&*()"));
				System.out.println("(1 2 3 4\t5)"+" -> "
				+ delChar("(1 2 3 4\t5)"," \t"));
	}
	
	public static void practice10() {
		System.out.println("\n문제9-10 ========================================");
		
		String str = "가나다"; 
		System.out.println(format(str,7,0)); // 왼쪽 정렬
		System.out.println(format(str,7,1)); // 가운데 정렬
		System.out.println(format(str,7,2)); // 오른쪽 정렬
	}
	
	public static void practice11() {
		System.out.println("\n문제9-11 ========================================");
		System.out.println("숫자를 입력하세요");
	
		Scanner sc = new Scanner(System.in);
		int param1, param2;
		
		while(true) {
			param1 = sc.nextInt();
			param2 = sc.nextInt();
			
			if(param1 == 0 || param2 == 0) {
				System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
			}else if(param1 == 1 || param1 > 9 || param2 == 1 || param2 > 9) {
				System.out.println("단의 범위는 2와 9사이의 값이어야 합니다.");
			}else {
				break;
			}
		}
		//gugudanTest(param1, param2);
	}
	
	public static void practice12() {
		System.out.println("\n문제9-12 ========================================");
		System.out.println("공부하고 다시 풀기");
	
		for(int i=0; i< 20; i++)
			System.out.print(getRand(1,-3)+",");
	}
	
	public static void practice13() {
		System.out.println("\n문제9-13 ========================================");
		System.out.println("공부하고 다시 풀기");
	
		String src = "aabbccAABBCCaa";
		System.out.println(src);
		//System.out.println("aa " + stringCount(src, "aa") +"개 찾았습니다."); 
	}
	
	public static void practice14() {
		System.out.println("\n문제9-14 ========================================");
		System.out.println("공부하고 다시 풀기");

		String[] phoneNumArr = { "012-3456-7890", "099-2456-7980", "088-2346-9870", "013-3456-7890" };
		ArrayList list = new ArrayList();
		
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.print(">>");
			String input = s.nextLine().trim();
			
			if (input.equals("")) {
				continue;
			} else if (input.equalsIgnoreCase("Q")) {
				System.exit(0);
			}
			/*
			 * (1) 알맞은 코드를 넣어 완성하시오
			 */
			if (list.size() > 0) {
				System.out.println(list);
				list.clear();
			} else {
				System.out.println("일치하는 번호가 없습니다.");
			}
		}
	}
	
/*****************************************************************************************/
	
	// 문제4 
	static void printGraph(int[] dataArr, char ch) {
		/*
			 1. 배열의 길이만큼 반복문을 돈다.
			 2. 각 원소의 크기만큼 내부 반복문을 돈다.
			 3. 내부 반복문은 ch를 찍는다.
			 4. 원소의 크기만큼 찍었다면 반복문을 빠져나와 원소 크기를 출력하고 증가값을 증가시킨다. 
		 */
		
		for(int i = 0; i < dataArr.length; i++) {
			for(int j = 0; j < dataArr[i]; j++) {
				System.out.print(ch);
			}
			System.out.print(dataArr[i]);
			System.out.println();
		}
	}
	
	// 문제5 
	public static int count(String src, String target) {
		int count = 0; // 찾은 횟수
		int pos = 0; // 찾기 시작할 위치
		
		while(true) {
			int idx = src.indexOf(target, pos);
			
			if(idx != -1) {
				count++;		
				pos += idx;
			}else {
				return count;				
			}
		}		
	}
	
	// 문제6
	public static String fillZero(String src, int length) {
		/*
		 1. src가 널이거나 src.length()가 length와 같으면 src를 그대로 반환한다.
		 2. length의 값이 0보다 같거나 작으면 빈 문자열("")을 반환한다.
		 3. src의 길이가 length의 값보다 크면 src를 length만큼 잘라서 반환한다.
		 4. 길이가 length 인 char 배열을 생성한다.
		 5. 4에서 생성한 char 배열을 '0'으로 채운다.
		 6. src에서 문자배열을 뽑아내서 4에서 생성한 배열에 복사한다.
		 7. 4에서 생성한 배열로 String을 생성해서 반환한다.
		 */
		
		String result = "";
		
		if(src == null || src.length() == length) {
			result = src;
			return result;
		}else if(length <= 0) {
			result = "";
			return result;
		}else if(src.length() > length) {
			result = src.substring(0, length);
			return result;
		}else {
			char[] arr = new char[length];
			char[] param = new char[src.length()];
		
			for(int i = 0; i < arr.length; i++) {	
				arr[i] = '0';
			}
			for(int i = 0; i < param.length; i++) {	
				param[i] = src.charAt(i);
			}
			
			System.arraycopy(param, 0, arr, 5, param.length);
			result = String.valueOf(arr);
			
			return result;
		}
	}
	
	// 문제7 
	public static boolean contains(String str1, String str2) {
		boolean result = false;
		
		if(str1.indexOf(str2) < 0) {
			result = false;
		}else {
			result = true;
		}
		
		return result;
	}
	
	// 문제8
	public static double round(double d, int n) {
		double result = 0;
		
		return result;
	}
	
	// 문제9
	public static String delChar(String src, String delCh) {
		String result = "";
		
		char[] param = new char[delCh.length()];
		
		for(int i = 0; i < param.length; i++) {
			int idx = src.indexOf(param[i]);
			
		}
		
		return result;
	}
	
	// 문제10
	public static String format(String str, int length, int alignment) {
		String result = "";
		
		if(length < str.length()) {
			result = str.substring(0, length);
		}else {
			char[] arr = new char[length];
			char[] param = new char[str.length()];
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = ' ';
			}
			for(int i = 0; i < param.length; i++) {
				param[i] = str.charAt(i);
			}
			
			if(alignment == 0) {
				System.arraycopy(param, 0, arr, 0, param.length);
				result = String.valueOf(arr);
			}else if(alignment == 1){
				System.arraycopy(param, 0, arr, Math.round(length/2)-1, param.length);
				result = String.valueOf(arr);
			}else {
				System.arraycopy(param, 0, arr, length - str.length(), param.length);
				result = String.valueOf(arr);
			}
		}
		
		return result;
	}
	
	// 문제11
	public static void gugudanTest(int num1, int num2) {
		for(int i = num1; i <= num2; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();
		}
	}
	
	// 문제12
	public static int getRand(int from, int to) {
		int result = 0;
		
		
		return result;
	}
	
	// 문제13
	static int stringCount(String src, String key) {
		return stringCount(src, key, 0);
	}

	static int stringCount(String src, String key, int pos) {
		int count = 0;
		int index = 0;
		
		if (key == null || key.length() == 0)
			return 0;
		
		while(true) {
			int idx = src.indexOf(key, index);
			System.out.println("idx : " + idx);
			
			if(idx != -1) {
				count++;
				index += idx;
			}else {
				return count;
			}
		}
		
	}
}

