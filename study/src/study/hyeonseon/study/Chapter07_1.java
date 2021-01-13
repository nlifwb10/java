package study.hyeonseon.study;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	// 7-1
	SutdaDeck() {
		int idx = 0;
		for(int i = 1; i <= cards.length/10; i++) {	//2회 반복 
			for(int j = 1; j <= cards.length/2; j++) {	//10회 반복 
				if(i % 2 != 0) {
					if(j == 1 || j == 3 || j == 8) {
						cards[idx] = new SutdaCard(j, true);
					}else {
						cards[idx] = new SutdaCard(j, false);
					}
					idx++;
				}else {
					cards[idx] = new SutdaCard(j, false);
					idx++;
				}
			}
		}
	}
	
	// 7-2
	// 배열 cards에 담긴 카드의 위치를 뒤섞는다(Math.random() 사용)
	public void shuffle() {
		int num = 0;

		for(int i = 0; i < cards.length; i++) {
			num = (int) (Math.random() * 20);		
			SutdaCard tmp = cards[i];
			cards[i] = cards[num];
			cards[num] = tmp;
		}
	}
	
	// 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.
	public SutdaCard pick() {
		int num = (int) (Math.random() * 20);	
		System.out.println("임의의 위치: " + num);
		return cards[num];
	}
	
	// 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
	public SutdaCard pick(int index) {
		return cards[index];
	}
}

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

// 7-5
class Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}
/**/
class Tv extends Product {
	Tv() {
		super(10000);	//7-5에서 수정하는 위치 
	}

	public String toString() {
		return "Tv";
	}
}

// 7-7
class Parent {
	int x = 100;

	Parent() {
		this(200);
	}

	Parent(int x) {
		this.x = x;
	}

	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;

	Child() {
		this(1000);
	}

	Child(int x) {
		this.x = x;
	}
}

// 7-10
class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prev;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	// 7-11
	public void gotoPrevChannel() {
		this.channel = prev;
	}
	
	public void setIsPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public void setChannel(int channel) {
		if(channel > 0) {
			prev = this.channel;
			this.channel = channel;
		}else {
			this.channel = channel;			
		}
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public boolean getIsPowerOn() {
		return isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
}


public class Chapter07_1 {
	
	public static void main(String[] args) {
		
		// 객체지향 프로그래밍 
		practice1();
		practice2();
		practice4();
		practice5();
		practice7();
		practice8();
		practice9();
		practice10();
		practice11();
		practice12();
		/*		
		practice3();
		practice6();
		*/
	}
	
	public static void practice1() {
		System.out.println("문제7-1 ========================================");
		SutdaDeck deck = new SutdaDeck();
		
		for(int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.println();
	}

	public static void practice2() {
		System.out.println("\n문제7-2 ========================================");
		SutdaDeck deck = new SutdaDeck();
		System.out.println("셔플 전 지정된 위치: " + deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		
		System.out.println();
		System.out.println("셔플 후 지정된 위치: " + deck.pick(0));
	}

	public static void practice3() {
		//Student 클래스 참조 
	}

	public static void practice4() {
		System.out.println("\n문제7-4 ========================================");
		System.out.println("다음 중 오버라이딩의 조건으로 옳지 않은 것은?(모두 고르시오)");
		System.out.println("a. 조상의 메서드와 이름이 같아야 한다");
		System.out.println("b. 매개변수의 수와 타입이 모두 같아야 한다");
		System.out.println("c. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다");
		System.out.println("d. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다");
		System.out.println("답: b, d(?)");
	}

	public static void practice5() {
		System.out.println("\n문제7-5 ========================================");
		Tv t = new Tv();
		System.out.println(t);
	}

	public static void practice6() {

	}

	public static void practice7() {
		System.out.println("\n문제7-7 ========================================");
		Child c = new Child();
		
		//System.out.println("x = " + c.getX());
		System.out.println("답: ");
		System.out.println("Parent -> Parent() -> Child() -> c.getX()");
		System.out.println("c.getX(): 200");
	}

	public static void practice8() {
		System.out.println("\n문제7-8 ========================================");
		System.out.println("다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한 것은?");
		System.out.println("a. public-protected-(default)-private");
		System.out.println("b. public-(default)-protected-private");
		System.out.println("c. (default)-public-protected-private");
		System.out.println("d. private-protected-(default)-public");
		System.out.println("답: a");
	}
	
	public static void practice9() {
		System.out.println("\n문제7-9 ========================================");
		System.out.println("다음 중 제어자 final 을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다. 옳지 않은 것은?(모두 고르시오)");
		System.out.println("a. 지역변수 값을 변경할 수 없다");
		System.out.println("b. 클래스 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다");
		System.out.println("c. 메서드 오버로딩을 할 수 없다");
		System.out.println("d. 멤버변수 값을 변경할 수 없다");
		System.out.println("답: b, c");
	}

	public static void practice10() {
		System.out.println("\n문제7-10 ========================================");
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume());
	}

	public static void practice11() {
		System.out.println("\n문제7-11 ========================================");
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		
		System.out.println("다시 풀기 ");
	}

	public static void practice12() {
		System.out.println("\n문제7-12 ========================================");
		System.out.println("다음 중 접근 제어자에 대한 설명으로 옳지 않은 것은?(모두 고르시오)");
		System.out.println("a. public 은 접근제한이 전혀 없는 접근 제어자이다");
		System.out.println("b. (default) 가 붙으면 같은 패키지 내에서만 접근이 가능하다");
		System.out.println("c. 지역변수에도 접근 제어자를 사용할 수 있다");
		System.out.println("d. protected 가 붙으면 같은 패키지 내에서도 접근이 가능하다");
		System.out.println("e. protected 가 붙으면 다른 패키지의 자손 클래스에서 접근이 가능하다");
		System.out.println("답: c, d");
	}

}
