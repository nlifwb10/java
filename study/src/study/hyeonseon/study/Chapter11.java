package study.hyeonseon.study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

public class Chapter11 {

	static ArrayList record = new ArrayList(); // 성적데이터를 저장할 공간
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		System.out.println("PDF 91 ~");
		
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
		System.out.println("\n문제11-1 ========================================");
		
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList(); // 교집합
		ArrayList cha = new ArrayList(); // 차집합
		ArrayList hap = new ArrayList(); // 합집합
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		kyo.addAll(list1);
		kyo.retainAll(list2);
		
		cha.addAll(list1);
		cha.removeAll(kyo);
		
		hap.addAll(list1);
		hap.removeAll(kyo);
		hap.addAll(list2);
		
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		System.out.println("kyo="+kyo);
		System.out.println("cha="+cha);
		System.out.println("hap="+hap);
	}
	
	public static void practice2() {
		System.out.println("\n문제11-2 ========================================");
		System.out.println(3);
		System.out.println(6);
		System.out.println(2);
		System.out.println(2);
		System.out.println(2);
		System.out.println(7);
	}
	
	public static void practice3() {
		System.out.println("\n문제11-3 ========================================");
		System.out.println("d");
	}
	
	public static void practice4() {
		System.out.println("\n문제11-4 ========================================");
		System.out.println("첫번째, 마지막째 요소");
	}
	
	public static void practice5() {
		System.out.println("\n문제11-5 ========================================");
		
		ArrayList list = new ArrayList();
		list.add(new Student("홍길동",1,1,100,100,100)); 
		list.add(new Student("남궁성",1,2,90,70,80)); 
		list.add(new Student("김자바",1,3,80,80,90)); 
		list.add(new Student("이자바",1,4,70,90,70)); 
		list.add(new Student("안자바",1,5,60,100,80)); 
		
		Collections.sort(list);
		Iterator it = list.iterator();
		/**/
		while(it.hasNext())
			System.out.println(it.next());
		
		/*
		 발생 에러
		 ComparableTimSort.countRunAndMakeAscending(Object[], int, int) line: 320
		 
		 참고 링크
		 - https://makemethink.tistory.com/179
		 - https://includestdio.tistory.com/35
		 */
	}
	
	static int getGroupCount(TreeSet tset, int from, int to) {
		int result = 0;
		
		/*
		TreeSet set = (TreeSet)tset;
		
		System.out.println(set.subSet(from, to));
		//result = numList.size();
		 */
		return result;
	}	
	
	public static void practice6() {
		System.out.println("\n문제11-6 ========================================");

		TreeSet set = new TreeSet(new Comparator() {
			public int compare(Object o1, Object o2) {
				return 0;
			}
		});
		set.add(new Student("홍길동", 1, 1, 100, 100, 100));
		set.add(new Student("남궁성", 1, 2, 90, 70, 80));
		set.add(new Student("김자바", 1, 3, 80, 80, 90));
		set.add(new Student("이자바", 1, 4, 70, 90, 70));
		set.add(new Student("안자바", 1, 5, 60, 100, 80));
		
		Iterator it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		
		System.out.println("[60~69] :" + getGroupCount(set, 60, 70));
		System.out.println("[70~79] :" + getGroupCount(set, 70, 80));
		System.out.println("[80~89] :" + getGroupCount(set, 80, 90));
		System.out.println("[90~100] :" + getGroupCount(set, 90, 101));
	}
	
	
	
	public static void practice7() {
		System.out.println("\n문제11-7 ========================================");
		
		ArrayList list = new ArrayList();
		list.add(new Student("이자바",2,1,70,90,70));
		list.add(new Student("안자바",2,2,60,100,80)); 
		list.add(new Student("홍길동",1,3,100,100,100)); 
		list.add(new Student("남궁성",1,1,90,70,80)); 
		list.add(new Student("김자바",1,2,80,80,90));
		
		Collections.sort(list, new BanNoAscending());
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}
	
	// 문제8
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // list . 먼저 를 총점기준 내림차순으로 정렬한다
		int prevRank = -1; // 이전 전교등수
		int prevTotal = -1; // 이전 총점
		int length = list.size();
		
		for(int i=0; i<length; i++) {
			Student3 s = (Student3)list.get(i);
			
			if(s.total == prevTotal) {
				s.schoolRank = prevRank;
			}else {
				s.schoolRank = i+1;
			}
			prevRank = s.schoolRank;
			prevTotal = s.total;
		}
	}
	
	public static void practice8() {
		System.out.println("\n문제11-8 ========================================");
		/**/
		ArrayList list = new ArrayList();
		list.add(new Student3("이자바",2,1,70,90,70));
		list.add(new Student3("안자바",2,2,60,100,80)); 
		list.add(new Student3("홍길동",1,3,100,100,100)); 
		list.add(new Student3("남궁성",1,1,90,70,80)); 
		list.add(new Student3("김자바",1,2,80,80,90));
		
		calculateSchoolRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
	}
	
	// 문제9
	public static void calculateSchoolRank09(List list) {
		Collections.sort(list); // list . 먼저 를 총점기준 내림차순으로 정렬한다
		int prevRank = -1; // 이전 전교등수
		int prevTotal = -1; // 이전 총점
		int length = list.size();

		for (int i = 0; i < length; i++) {
			Student4 s = (Student4) list.get(i);

			if (s.total == prevTotal) {
				s.schoolRank = prevRank;
			} else {
				s.schoolRank = i + 1;
			}
			prevRank = s.schoolRank;
			prevTotal = s.total;
		}
	}
	
	public static void calculateClassRank(List list) {
		// 먼저 반별 총점기준 내림차순으로 정렬한다
		Collections.sort(list, new ClassTotalComparator());
		
		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		for(int i=0, n=0; i<length; i++, n++) {
			Student4 s = (Student4)list.get(i);
			
			if(s.ban != prevBan) {
				prevRank = -1;
				prevTotal = -1;
				n = 0;
			}
			if(s.total == prevTotal) {
				s.classRank = prevRank;
			}else {
				s.classRank = n + 1;
			}
			
			prevBan = s.ban;
			prevRank = s.classRank;
			prevTotal = s.total;
		}
	}
	
	public static void practice9() {
		System.out.println("\n문제11-9 ========================================");
		/**/
		ArrayList list = new ArrayList();
		System.out.println("이름/반/번호/국어/영어/수학/총점/평균/전교등수/반등수");
		list.add(new Student4("이자바",2,1,70,90,70));
		list.add(new Student4("안자바",2,2,60,100,80)); 
		list.add(new Student4("홍길동",1,3,100,100,100)); 
		list.add(new Student4("남궁성",1,1,90,70,80)); 
		list.add(new Student4("김자바",1,2,80,80,90));
		
		calculateSchoolRank09(list);
		calculateClassRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
	}
	
	public static void practice10() {
		System.out.println("\n문제11-10 ========================================");
		System.out.print("이유: ");
		System.out.println("???");
		System.out.print("방법: ");
		System.out.println("Set 인터페이스를 구현한 클래스 중 Hashset과 다른 특징을 가진 클래스를 사용하면 다른 결과가 나올 것 같아서..");
		
		//Set set = new HashSet();	//고치기 전 코
		TreeSet set = new TreeSet(); //고친코드 
		int[][] board = new int[5][5];
		
		for (int i = 0; set.size() < 25; i++) {
			set.add((int) (Math.random() * 30) + 1 + "");
		}
		
		Iterator it = set.iterator();
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String) it.next());
				System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void practice11() {
		System.out.println("\n문제11-11 ========================================");
		
		SutdaCard3 c1 = new SutdaCard3(3,true);
		SutdaCard3 c2 = new SutdaCard3(3,true);
		SutdaCard3 c3 = new SutdaCard3(1,true);
		
		HashSet set = new HashSet();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		
		System.out.println(set);
	}
	
	public static void practice12() throws Exception {
		System.out.println("\n문제11-12 ========================================");
		System.out.println("???");
	
		/*
		SutdaDeck2 deck = new SutdaDeck2();
		deck.shuffle();
		
		Player p1 = new Player("타짜", deck.pick(), deck.pick()); 
		Player p2 = new Player("고수", deck.pick(), deck.pick()); 
		System.out.println(p1+" "+deck.getPoint(p1));
		System.out.println(p2+" "+deck.getPoint(p2));
		*/
	}
	
	public static void practice13() {
		System.out.println("\n문제11-13 ========================================");
		System.out.println("???");
	}
	
	
	
	public static void practice14() {
		System.out.println("\n문제11-14 ========================================");
		
		while (true) {
			switch (displayMenu()) {
			case 1:
				inputRecord();
				break;
			case 2:
				displayRecord();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}
	
	// menu를 보여주는 메서드
	static int displayMenu() {
		System.out.println("**************************************************");
		System.out.println("* 성적 관리 프로그램 *");
		System.out.println("**************************************************");
		System.out.println();
		System.out.println(" 1. 학생성적 입력하기");
		System.out.println();
		System.out.println(" 2. 학생성적 보기");
		System.out.println();
		System.out.println(" 3. 프로그램 종료");
		System.out.println();
		System.out.print("(1~3) : 원하는 메뉴를 선택하세요. ");
		
		int menu = 0;
		/*
		 * (1) 아래의 로직에 맞게 코드를 작성하시오 
		 * 1. 화면으로부터 메뉴를 입력받는다 메뉴의 값은 사이의 1~3 값이어야 한다 
		 * 2. 1~3 사이의 값을 입력받지 않으면 메뉴의 선택이 잘못되었음을 알려주고 
		 * 	다시 입력받는다 유효한 값을 입력받을 때까지 반복해서 입력받는다.
		 */
		
		do {
			menu = s.nextInt();
			
			if(menu > 0 && menu <= 3) {
				break;
			}else {
				System.out.println("잘못된 메뉴입니다.");
				System.out.print("(1~3) : 원하는 메뉴를 선택하세요. ");
			}
		}while(menu < 1 || menu > 3);
		
		return menu;
	}
	
	// 데이터를 입력받는 메서드
	static void inputRecord() {
		System.out.println("1. 학생성적 입력하기");
		System.out.println("이름 반 번호 국어성적 영어성적 수학성적 의 순서로 공백없이 입력하세요.");
		System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다");
		
		while (true) {
			System.out.print(">>");
			
			try {
				String str = s.next();
				
				if(str.equals("q") || str.equals("Q")) {
					return;
				}else {
					Scanner s2 = new Scanner(str).useDelimiter(",");
					
					record.add(new Student5(s2.next(), s2.nextInt(), s2.nextInt()
							, s2.nextInt(), s2.nextInt(), s2.nextInt()));
				}
			} catch (Exception e) {
				System.out.println("입력 오류입니다.");
			}
		} // end of while
	}
	
	// 데이터 목록을 보여주는 메서드
	static void displayRecord() {
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total = 0;
		int length = record.size();
		if (length > 0) {
			System.out.println();
			System.out.println("이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수");
			System.out.println("====================================================");
			for (int i = 0; i < length; i++) {
				Student5 student = (Student5) record.get(i);
				System.out.println(student);
				
				koreanTotal += student.kor;
				mathTotal += student.math;
				englishTotal += student.eng;
				total += student.total;
			}
			System.out.println("====================================================");
			System.out.println("총점 : " + koreanTotal + " " + englishTotal + " " + mathTotal + " " + total);
			System.out.println();
		} else {
			System.out.println("====================================================");
			System.out.println("데이터가 없습니다.");
			System.out.println("====================================================");
		}
	}
}

// 문제5 
class Student implements Comparable {
	String name;
	int ban;
	int no;
	int kor, eng, math;

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

	@Override
	public int compareTo(Object o) {
		return name.compareTo(((Student)o).name);
	}
}

//문제6
class Student2 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

	public int compareTo(Object o) {
		if (o instanceof Student) {
			Student tmp = (Student) o;
			return name.compareTo(tmp.name);
		} else {
			return -1;
		}
	}
}


//문제7
class BanNoAscending implements Comparator {
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student && o2 instanceof Student) {
			Student s1 = (Student)o1;
			Student s2 = (Student)o2;
			
			int result = s1.ban - s2.ban;
			
			if(result == 0) {
				return s1.no - s2.no;
			}
			
			return result;
		}
		return -1;
	}
}

//문제8
class Student3 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total; // 총점
	int schoolRank; // 전교등수

	Student3(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public int compareTo(Object o) {
		if (o instanceof Student3) {
			Student3 tmp = (Student3) o;
			
			return tmp.total - this.total;
		} else {
			return -1;
		}
	}

	public String toString() {
		return name
		+","+ban
		+","+no
		+","+kor
		+","+eng
		+","+math
		+","+getTotal()
		+","+getAverage()
		+","+schoolRank // 새로추가
		;
	}
} // class Student


//문제9
class ClassTotalComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Student4 s1 = (Student4) o1;
		Student4 s2 = (Student4) o2;

		int result = s1.ban - s2.ban; // 오름차순

		if (result == 0) {
			result = s2.ban - s1.ban;
		}

		return result;

	}
}

//문제9
class Student4 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total; // 총점
	int schoolRank; // 전교등수
	int classRank; // 반등수

	Student4(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public int compareTo(Object o) {
		if (o instanceof Student4) {
			Student4 tmp = (Student4) o;
			
			return tmp.total - this.total;
		} else {
			return -1;
		}
	}

	public String toString() {
		return name
		+","+ban
		+","+no
		+","+kor
		+","+eng
		+","+math
		+","+getTotal()
		+","+getAverage()
		+","+schoolRank 
		+","+classRank // 새로추가
		;
	}
} // class Student

// 문제11 
class SutdaCard3 {
	int num;
	boolean isKwang;
	
	SutdaCard3() {
		this(1, true);
	}
	
	SutdaCard3(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof SutdaCard3) {
			SutdaCard3 c = (SutdaCard3) obj;
			return num == c.num && isKwang == c.isKwang;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
	
	public int hashCode() {
		//return (num+isKwang).hashCode(); // String hashCode() . 클래스의 를 호출한다
		return Objects.hash(num, isKwang);
	}
}

//문제12
class SutdaDeck2 {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	int pos = 0; // 다음에 가져올 카드의 위치
	HashMap jokbo = new HashMap(); // HashMap 족보를 저장할

	SutdaDeck2() {
		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = i < 10 && (num == 1 || num == 3 || num == 8);
			cards[i] = new SutdaCard(num, isKwang);
		}

		registerJokbo(); // . 족보를 등록한다
	}

	void registerJokbo() {
		/*
		 * (1) . 아래의 로직에 맞게 코드를 작성하시오 1. jokbo(HashMap) . 에 족보를 저장한다 두 카드의 값을 문자열로 붙여서 로
		 * 점수를 로 저장한다 key , value .
		 */
	}

	int getPoint(Player p) {
		if (p == null)
			return 0;
		SutdaCard c1 = p.c1;
		SutdaCard c2 = p.c2;
		Integer result = 0;
		/*
		 * (2) . 아래의 로직에 맞게 코드를 작성하시오 1. , jokbo "KK" . 카드 두 장이 모두 광이면 에서 키를 로 해서 점수를
		 * 조회한다 2. (num) jokbo . 두 카드의 숫자 로 에서 등급을 조회한다 3. , . 해당하는 등급이 없으면 아래의 공식으로 점수를
		 * 계산한다 (c1.num + c2.num) % 10 + 1000 4. Player (point) . 의 점수 에 계산한 값을 저장한다
		 */
		return result.intValue();
	}

	SutdaCard pick() throws Exception {
		SutdaCard c = null;
		if (0 <= pos && pos < CARD_NUM) {
			c = cards[pos];
			cards[pos++] = null;
		} else {
			throw new Exception("남아있는 카드가 없습니다.");
		}
		return c;
	}

	void shuffle() {
		for (int x = 0; x < CARD_NUM * 2; x++) {
			int i = (int) (Math.random() * CARD_NUM);
			int j = (int) (Math.random() * CARD_NUM);
			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
}
//문제12
class Player {
	String name;
	SutdaCard c1;
	SutdaCard c2;
	int point; // - 카드의 등급에 따른 점수 새로 추가

	Player(String name, SutdaCard c1, SutdaCard c2) {
		this.name = name;
		this.c1 = c1;
		this.c2 = c2;
	}

	public String toString() {
		return "[" + name + "]" + c1.toString() + "," + c2.toString();
	}
} // class Player

//문제12
class SutdaCard4 {
	int num;
	boolean isKwang;

	SutdaCard4() {
		this(1, true);
	}

	SutdaCard4(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

//문제14
class Student5 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	int schoolRank;
	int classRank; // 반등수

	Student5(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor + eng + math;
	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public int compareTo(Object o) {
		if (o instanceof Student5) {
			Student5 tmp = (Student5) o;
			return tmp.total - this.total;
		} else {
			return -1;
		}
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage()
				+ "," + schoolRank + "," + classRank;
	}
}
