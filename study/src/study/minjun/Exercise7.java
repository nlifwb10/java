package study.minjun;

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
//		System.out.println("������ ��:"+sumArea(arr));
		
		
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
/*
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
*/

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
		System.out.println("���� ��ϴ�.");
	}
}

class SingRobot extends Robot{
	void sing() {
		System.out.println("�뷡�� �մϴ�.");
	}
}

class DrawRobot extends Robot{
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}

//7-19
class Buyer{
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0; //product �迭 cart�� ���� index

	void buy(Product p ) {
		if(p.price > money) {
			System.out.println("�ܾ��� �����Ͽ�"+p+"��/�� �� �� �����ϴ�.");
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
		System.out.print("������ ����:");
		for(int i=0;i<cart.length;i++) {
			System.out.print(cart[i]+", ");
		}
		
		System.out.println();
		int j=0;
		for(int i=0;i<cart.length;i++) {
			j += cart[i].price;
		}
		System.out.println("��ٱ��Ͽ� ��� ������ ����:"+j);
		System.out.println( "�ܾ�:"+money);
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
	abstract double calcArea(); // ������ ������ ����ؼ� ��ȯ�ϴ� �޼���
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
 ����Ŭ�����κ��� ��ӹ��� ������ �����ϴ� ��.
 �ڼ�Ŭ������ �°� �����ؾ��ϴ� ��� ����Ѵ�.
 
 7-4
 c,d
 �������̵��� ����
 �ڼ�Ŭ�������� �������̵��ϴ� �޼���� ���� Ŭ������ �޼����
 -�̸��� ���ƾ��Ѵ�
 -�Ű������� ���ƾ��Ѵ�.
 -��ȯŸ���� ���ƾ� �Ѵ�.
 7-5
TvŬ������ Tv()�����ڿ��� �ڵ����� super()�����ڸ� �����Ϸ��� �ڵ����� �߰�
�����ֱ� ������ Product Ŭ������ �⺻�����ڸ� �ۼ��ؾ��Ѵ�.

 Product(){
 	this(100) //����
 }
 
 7-6
 �ڼ� Ŭ������ �ν��Ͻ� ������ �ڼ��� ����� ������ ����� ��� ������ �ϳ��� �ν��Ͻ��� �����Ǳ� ������
 ����Ŭ������ ����� �ʱ�ȭ �۾��� ����Ǿ� �Ѵ�.
 
 -�������� ù�ٿ��� ����Ŭ������ �����ڸ� ȣ���ؾ��ϴ� ������ �ڼ� Ŭ������ ����� ���� Ŭ������ ����� ��� ��
 ���� �����Ƿ� ������ ������� ���� �ʱ�ȭ�Ǿ� �־�� �ϱ� �����̴�. 
 
 7-7
 ���� : Child() > Chile(int x) >Parent() > Parent(int x)
 
 ��� : x=200
 
 7-8 ��:  a 
 7-9 ��:  b
 7-12 ��: c
 7 -13
 Math Ŭ������  �� ���� ����� static �޼��常���� �����Ǿ� �ֱ� ������
 �ν��Ͻ��� ������ �ʿ䰡 ����.
 
 7-15
 �� �Ǵ���
 
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
  Movable�� ������ Ŭ����,�������̽�
  
 7-24
 e
 
 7-28
 
 
 7-29
 
 
 
 
*/