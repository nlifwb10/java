package sanghoon;

import java.util.Arrays;


public class Practice_7�� {

	/*
		7-1
		   for(int i = 0 ;i<cards.length;i++) {
				int num = i%10 + 1;
				
				boolean check_T_F = false;
				
				if(i < 10 && (num == 1|| num ==3 || num ==8)) {
					check_T_F = true;
				}
				
				cards[i] = new SutdaCard(num, check_T_F);
			}
		
		7-2
		
		7-3
		  �θ��� �޼��带 �ڼ� Ŭ�������� �������ϴ°�
		  
		7-4
		   c
		
		7-5
		   class Product
			{
				int price; // ��ǰ�� ����
				int bonusPoint; // ��ǰ���� �� �����ϴ� ���ʽ�����
				Product(){} -->�� : �⺻������ �߰�
				Product(int price) {
					this.price = price;
					bonusPoint =(int)(price/10.0);
				}
			}
		
		7-6
		  ������ �ν��Ͻ������� �ʱ�ȭ�ϱ�����
		
		7-7 
		 Child() -> Child(int x) -> Parent() ->Parent(int x)
   		  �� : x=200
   		 
   		7-8
   		    a
   		
   		7-9
   		   ?
   		 
   		7-10
   		private boolean isPowerOn;
		private int channel;
		private int volume;
		
		public void setChannel(int channel){
			this.channel = channel;
		}
		
		public void setVolume(int volume){
			this.volume = volume;
		}
		
		public int getChannel(){
			return this.channel;
		}
		
		public int getVolume(){
			return this.volume;
		}
		
		7-11
			private int channel;
			private int prev_channel;
			
			public void setChannel(int channel){
				this.channel = channel;
				this.prev_channel = this.channel;
				
			}
			
			public void gotoPrevChannel(int volume){
				
				this.channel; = this.prev_channel;
			}
			
		7-12
			c�ۿ����µ�? �ٵ� ���������ȿ��� ���������ھȾ���?
			
	    7-13
	    	��ü������ �ʿ䰡 ���..?
	    7-14
	    	final int NUM;
			final boolean IS_KWANG;
		7-15
			e
		7-16
			e
		7-17
			class Unit{
				int x, y; // ���� ��ġ
				void move(int x, int y) { } 
				void stop() {  } 
				
			}
			
			class Marine extends Unit{ // ����
				void stimPack() { }
			}
			class Tank extends Unit{ // ��ũ
				void changeMode() {} 
			}
			class Dropship extends Unit{ // ���ۼ�
				void load() {  } 
			}
		
		7-18
			public static void action(Robot r) {
				if(r instanceof DanceRobot) {
					((DanceRobot) r).dance();
				}else if(r instanceof SingRobot) {
					((SingRobot) r).sing();
				}else {
					((DrawRobot) r).draw();
				}
			}
		
		7-19
			
			
		7-20
			 100
			Child Method
			 200
			Child Method
			
		7-21
			Movable , Movable�� ������ Ŭ����
		
		7-22  -->�ϴٰ� �������..
			class Circle extends Shape{
			double r;
			
			public double calcArea() {
				return Math.PI * this.r * this.r; 
			}
		
		7-23 
			
			
		7-24
			e
		7-25
			Outer o= new Outer();
			Outer.Inner i = o.new Inner();
			System.out.println(i.iv);
		7-26
			Outer.Inner oi = new Outer.Inner();
			
			System.out.println(oi.iv); Q-> STATIC�� IV���� ����?
		
		7-27
		
		Outer o = new Outer();
		Outer.Inner inner = o.new Inner();
		inner.method1();
		
		class Outer {
			int value=10;
			class Inner {
				int value=20;
				void method1() {
					int value=30;
					System.out.println(value);
					System.out.println(this.value);
					System.out.println(Outer.this.value);
				}
			} // InnerŬ������ ��
		} // OuterŬ������ ��
		
		7-28
			Frame f = new Frame();
			f.addWindowListener(new WindowAdapter{
				public void windowClosing(WindowEvent e) {
					e.getWindow().setVisible(false);
					e.getWindow().dispose();
					System.exit(0);
					}
			});
		
		7-29
		 constant pool ���������Ǳ⋚����
}
		
	*/
	

	
	public static void main(String[] args) {
		

		
		


	}		
	

}
