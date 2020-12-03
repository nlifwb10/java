package study.minjun;

import java.util.Arrays;

public class Exercise6 {

	//6-6
	static double getDistance(int  x, int y, int x1, int y1) {
		
		return Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
	}	
	
	//6-20
	static int[] shuffle(int[] x) {
		
		for(int i=0;i<x.length;i++) {
			int j = (int)(Math.random()*x.length);
			int tmp;
		
			tmp = x[i];
			x[i] = x[j];
			x[j] = tmp;
		}
		
		return x;
		
	}
	
	//6-22
	static boolean isNumber(String str) {
		if(str ==null || str.equals("")) {
			return false;
		}
		//�ñ��Ѱ�  �ݺ����̿���  return  ������ �޼������� ??
		boolean a=true;
		for(int i = 0;i<str.length();i++) {
			if('0'<=str.charAt(i) &&str.charAt(i)<='9') {
				a=true;
			}else {
				a = false;
				break;
			}
		}
		return a;
	}
	
	//6-23
	static int max(int[] arr) {
		if(arr==null || arr.length==0) {
			return -999999;
		}
		
		int a = arr[0];
		for(int i=1;i<arr.length;i++) {
			a = arr[i] > a? arr[i] : a;
		}
		
		return a;
	}
	
	//6-24
	static int abs(int value) {
		
		if(value>0) {
			 return value;
		}else if(value  < 0) {
			return -value;
		}
		
		return value;
	}
	public static void main(String[] args) {
		//6-1~2		
//		SutdaCard card1 = new SutdaCard(3, false);
//		SutdaCard card2 = new SutdaCard();
//		
//		System.out.println(card1.info());
//		System.out.println(card2.info());
		
		
		//6-3,4
//		Student s = new Student();
//		s.name = "ȫ�浿";
//		s.ban = 1;
//		s.no = 1;
//		s.kor =100;
//		s.eng = 60;
//		s.math = 76;
//		
//		System.out.println("�̸�:"+s.name);
//		System.out.println("����:"+s.getTotal());
//		System.out.println("���:"+s.getAverage());
		
		//6-5
//		Student s = new Student("ȫ�浿",1,1,100,60,76);
//		
//		System.out.println(s.info());
		
		//6-6
//		System.out.println(getDistance(1,1,2,2));
	
		//6-7
//		MyPoint p= new MyPoint(1,1);
//		
//		System.out.println(p.getDistance(2, 2));
		
		//6-20
//		int[] original = {1,2,3,4,5,6,7,8,9};
//		System.out.println(java.util.Arrays.toString(original));
//		
//		int[] result = shuffle(original);
//		System.out.println(java.util.Arrays.toString(result));
		
		//6-21
//		MyTv t =  new MyTv();
//		
//		t.channel = 100;
//		t.volume = 0;		
//		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
//		
//		t.channelDown();
//		t.volumDown();
//		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
//		
//		t.volume = 100;
//		t.channelUp();
//		t.volumUp();
//		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
		
		//6-22
//		String str = "123";
//		System.out.println(str+"�� �����Դϱ�?  "+isNumber(str));
//		
//		str = "1o23";
//		System.out.println(str+"�� �����Դϱ�?  "+isNumber(str));
		
		//6-23
//		int[]  data = {3,2,9,4,7};
//		System.out.println(java.util.Arrays.toString(data));
//		System.out.println("�ִ�:"+max(data));
//		System.out.println("�ִ�:"+max(null));
//		System.out.println("�ִ�:"+max(new int[] {}));
		
		//6-24
//		int value = 5;
//		System.out.println(value+"�� ���밪:"+abs(value));
//		
//		value = -10;
//		System.out.println(value+"�� ���밪:"+abs(value));
		
	}
}



//6-1~2
class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		num =1;
		isKwang = true;
	}
	
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;	
	}
	
	String info() {
		String result;
		if(isKwang ==true) {
			  return result = num +"K" ;			
		}else {
		return result =num+"";
		}
	}

}

//6- 3~5
class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(){
		
	}
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math =math;
	}
	
	String info() {
		String result = name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
		return result;
	}
	
	int getTotal(){
		int result;
		return result = kor + eng + math;
	}
	
	float  getAverage() {
		float result;
		int total = getTotal();
		return result = (int)(total/3f*100+0.5f) / 100f;		
	}
	
	
}

//6-7
class MyPoint{
	int x;
	int y;
	
	MyPoint(int x, int y ){
		this.x=x;
		this.y=y;
	}
	
	double getDistance(int x, int y) {
		double result;
		int a = (x -this.x)*(x -this.x);
		int b = (y -this.y)*(y -this.y);
		return result = Math.sqrt(a+b);
	}
	
}

//6-21
class MyTv{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
		isPowerOn = !isPowerOn;
		System.out.println(isPowerOn);
	}
	
	void volumUp() {
		volume  = (volume < MAX_VOLUME )? volume+1 : volume;
	}
	
	void volumDown() {
		volume  =(volume  > MIN_VOLUME) ? volume-1 : volume;
	}
	
	void channelUp() {
		channel = channel == MAX_CHANNEL? MIN_CHANNEL :channel+1;
	}
	
	void channelDown() {
		channel = channel == MIN_CHANNEL? MAX_CHANNEL :channel-1;
	}
	
	
}


