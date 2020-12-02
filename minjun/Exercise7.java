import java.util.Arrays;

public class Exercise7 {

	public static void main(String[] args) {
		//7-1
//		SutdaDeck deck = new SutdaDeck();
//		
//		for(int i=0;i<deck.cards.length;i++) {
//			System.out.print(deck.cards[i]+",");
//		}
//	}
		
		//7-2
//		SutdaDeck deck = new SutdaDeck();
//		
//		System.out.println(deck.pick(0));
//		System.out.println(deck.pick());
//		deck.shuffle();
//		
//		for(int i =0;i<deck.cards.length;i++) {
//			System.out.print(deck.cards[i]+",");
//		}
//		
//		System.out.println();
//		System.out.println(deck.pick(0));
		
		//7-10
//		MyTv2 t = new MyTv2();
//		
//		t.setChannel(10);
//		System.out.println("CH:"+t.getChannel());
////		t.setVolume(20);
////		System.out.println("VOL:"+t.getVolume());
//		t.setChannel(20);
//		System.out.println("CH:"+t.getChannel());
//		t.gotoPrevChannel();
//		System.out.println("CH:"+t.getChannel());
//		t.gotoPrevChannel();
//		System.out.println("CH:"+t.getChannel());
		
		//7-18
//		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
//		
//		for(int i=0;i<arr.length;i++) {
//			action(arr[i]);
//		}
		
		
		//7-19
//		Buyer b = new Buyer();
//		b.buy(new Tv());
//		b.buy(new Computer());
//		b.buy(new Tv());
//		b.buy(new Audio());
//		b.buy(new Computer());
//		b.buy(new Computer());
//		b.buy(new Computer());
//		b.summary();
		
		//7-23
//		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
//		System.out.println("면적의 합:"+sumArea(arr));
		
		
		//7-25
//		Outer o = new Outer();
//		Outer.Inner ic = o.new Inner();
//		System.out.println(ic.iv);
		
		
		//7-26
//		Outer.Inner iic = new Outer.Inner();
//		System.out.println(iic.iv);
		
		//7-27
		Outer o = new Outer();
		Outer.Inner ic = o.new Inner();
		ic.method1();
		
	}//main
	
	//7-18
	static void action(Robot r) {
		if(r instanceof DanceRobot) {
			((DanceRobot) r).dance();
		}else if(r instanceof SingRobot) {
			((SingRobot) r).sing();
		}else if(r instanceof DrawRobot) {
			((DrawRobot) r).draw();
		}
	}//action
	
	//7-23
	static double sumArea(Shape[] arr) {
		double j = 0;
		for(int i=0;i<arr.length;i++) {
			j+=arr[i].calcArea();
		}
		return j;
	}
}
	//7-1
class SutdaDeck{
	final int CARD_NUM=20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	
	SutdaDeck() {
		for(int i = 0;i<CARD_NUM;i++) {
			if(i+1==1||i+1==3||i+1==8) {
				cards[i]=new SutdaCard(i+1, true);
			}else if(i>=10) {
				cards[i]=new SutdaCard(i-9,false);
			}else {
				cards[i]=new SutdaCard(i+1,false);
			}
		}
	}
	
	void shuffle() {
		for(int i=0;i<cards.length;i++) {
			int j = (int)(Math.random()*cards.length);
			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] =tmp;			
		}
	}
	
	SutdaCard pick(int index) {
		return cards[index];
	}
	
	SutdaCard pick() {
		int i = (int)(Math.random()*cards.length);
		return cards[i];
	}

}

class SutdaCard{
	final int NUM;
	boolean ISKWANG;
	
	SutdaCard(){
		this(1, true);
	}
	
	
	SutdaCard(int num, boolean isKwang){
		this.NUM = num;
		this.ISKWANG = isKwang;	
	}
	
	public String toString() {
		return NUM+(ISKWANG ? "K":"");
	}

}

//7-10
class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	boolean getIsPowerOn() {
		return isPowerOn;
	}
	
	void setIsPowerOn(boolean power) {
		this.isPowerOn = power;
	}
	
	int getChannel() {
		return channel;
	}
	
	void setChannel(int channel) {
		prevChannel = this.channel;
		this.channel = channel;
	}
	
	int getVolume() {
		return volume;
	}
	
	void setVolume(int vol) {
		this.volume = vol;
	}
	
	void gotoPrevChannel() {
		setChannel(prevChannel);
	}
	
}

//7-18
class Robot{ }

class DanceRobot extends Robot{
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot{
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot{
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

//7-19
class Buyer{
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0; //product 배열 cart에 사용될 index

	void buy(Product p ) {
		if(p.price > money) {
			System.out.println("잔액이 부족하여"+p+"을/를 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		add(p);
	}
	
	void add(Product p ) {
		if(cart.length <= i ) {
			Product[] cart1 = new Product[cart.length*2];
			cart1 = Arrays.copyOf(cart, cart1.length);
			this.cart = cart1;
		}
		
		cart[i] = p;
		i++;
		
	}//add
	
	void summary() {
		System.out.print("구입한 물건:");
		for(int i=0;i<cart.length;i++) {
			System.out.print(cart[i]+", ");
		}
		
		System.out.println();
		int j=0;
		for(int i=0;i<cart.length;i++) {
			j += cart[i].price;
		}
		System.out.println("장바구니에 담긴 물들의 총합:"+j);
		System.out.println( "잔액:"+money);
	}
	
	
}

class Product{
	int price;
	
	Product(int price){
		this.price = price;
	}
}

class Tv extends Product {

	Tv() { super(100); }

	public String toString() { return "Tv"; }
}

class Computer extends Product {

	Computer() { super(200); }

	public String toString() { return "Computer";}

}
class Audio extends Product {

	Audio() { super(50); }

	public String toString() { return "Audio"; }

}

//7-22

abstract class Shape {
	Point p;
	
	Shape() {

		this(new Point(0,0));
}

	Shape(Point p) {
		this.p = p;

	}
	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
	Point getPosition() {
		return p;
}
	
	void setPosition(Point p) {
		this.p = p;
	}
}

class Circle extends Shape{
	double r;
	
	Circle(){
		super();
	}
	
	Circle(double r){
		this.r= r;
	}
	@Override
	double calcArea() {
		return Math.PI*(this.r*this.r);
	}
	
}//circle

class Rectangle extends Shape{
	double width;
	double height;
	
	Rectangle(){
		super();
	}
	
	Rectangle(double wi, double he){
		this.width = wi;
		this.height = he;
	}
	@Override
	double calcArea() {
		return width * height;
	}
	
	boolean isSquare() {
		if(width == height) {
			return true;
		}else {
			return false;
		}
	}
}

class Point {
	int x;
	int y;
	
	Point() {
		this(0,0);
	}
	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString()	{
		return "{"+x+","+y+"}";
	}
}

//7-25~27
class Outer{
	int value = 10;
	//7-25
//	class Inner{
//		int iv =100;
//	}

	//7-26
//	static class Inner{
//		int iv =200;
//	}

	class Inner{
		int value = 20;
		
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer.this.value);
		}
	}


}
/*
 7-3
 조상클래스로부터 상속받은 내용을 변경하는 것.
 자손클래스에 맞게 변경해야하는 경우 사용한다.
 
 7-4
 c,d
 오버라이딩의 조건
 자손클래스에서 오버라이딩하는 메서드는 조상 클래스의 메서드와
 -이름이 같아야한다
 -매개변수가 같아야한다.
 -반환타입이 같아야 한다.
 7-5
Tv클래스의 Tv()생성자에서 자동으로 super()생성자를 컴파일러가 자동으로 추가
시켜주기 때문에 Product 클래스의 기본생성자를 작성해야한다.

 Product(){
 	this(100) //예시
 }
 
 7-6
 자손 클래스의 인스턴스 생성시 자손의 멤버와 조상의 멤버가 모두 합쳐진 하나의 인스턴스가 생성되기 때문에
 조상클래스의 멤버의 초기화 작업이 수행되야 한다.
 
 -생성자의 첫줄에서 조상클래스의 생성자를 호출해야하는 이유는 자손 클래스의 멤버가 조상 클래스의 멤버를 사용 할
 수도 있으므로 조상의 멤버들이 먼저 초기화되어 있어야 하기 때문이다. 
 
 7-7
 순서 : Child() > Chile(int x) >Parent() > Parent(int x)
 
 결과 : x=200
 
 7-8 답:  a 
 7-9 답:  b
 7-12 답: c
 7 -13
 Math 클래스는  몇 개의 상수와 static 메서드만으로 구성되어 있기 때문에
 인스턴스를 생성할 필요가 없다.
 
 7-15
 다 되는줄
 
 7-16
  e
  
 7-17
 class Unit{
 	int x, y;
 	void move(int x, int y){ }
 	void stop(){ }
 }
 
 7-20
 p.x=100
 c.x=200
 Child Method
 Child Method
 
 7-21
  Movable을 구현한 클래스,인터페이스
  
 7-24
 e
 
 7-28
 
 
 7-29
 
 
 
 
*/