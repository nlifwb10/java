package sanghoon;

import java.util.Arrays;


public class Practice_6�� {

	/*
		6-1
			public class SutdaCard{				
				int num;
				boolean isKwang;						
			}
			
		6-2
		
		   class SutdaCard{
	
				int num;
				boolean isKwang;
				
				SutdaCard(){
					this.num = 1;
					this.isKwang =true;
				}
				
				SutdaCard(int num , boolean isKwang ){
					this.num = num;
					this.isKwang = isKwang;
				}
				
				public String info() {
					return  Integer.toString(this.num) + (isKwang == false ? "" : "K") ;   
			}
			
		6-3
			public class Student{
				String name;
				int ban;
				int no;
				int kor;
				int eng;
				int math;					
			}
			
		6-4
		
			class Student {
				String name;
				int ban;
				int no;
				int kor;
				int eng;
				int math;	
				
				public int getTotal() {
					return this.kor + this.eng + this.math;		
				}
				
				public float getAverage() {
					return (getTotal())/3f;	
				}		
			}
			
		6-5
		
		6-6
		
		6-7
		
		6-8
		- Ŭ�������� ���� : width,height
		- �ν��Ͻ����� : kind,num
		- ���� ����  : k ,n ,card , args[]
		
		6-9
		 class Marine {
			
			int x=0, y=0; // Marine (x,y) �� ��ġ��ǥ
			int hp = 60; // ���� ü��
			static int weapon = 6; // ���ݷ�
			static int armor = 0; // ����
			
			static void weaponUp() {
				weapon++;
			}
			static void armorUp() {
				armor++;
			}
			void move(int x, int y) {
				this.x = x;
				this.y = y;
			}
		 }
		 
		 6-10
		 	b,e
		 6-11
		 	b
		 6-12
		 	c,d
		 6-13
		 	b,c,d
		 6-14
		 	e
		 6-15
		 	d
		 6-16
		 	a,e
		 6-17 
		 	b
		 6-18
		 	���� A - cv2�� static �����̹Ƿ�
		 	���� B - static �޼ҵ忡�� �ν��Ͻ� ������ ��������.
		 	���� C - ��������
		 	���� D - static�ȿ��� �ν��Ͻ� �޼��带 ��� x
		 	���� E - ��������
		 
		 6-19
		 	ABC123
		 	ABC123
		 
		 6-20
		 	public static int[] shuffle(int[] arr) {
				for(int i=0; i< arr.length;i++) {
					int j = (int)(Math.random()*arr.length);
				
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
				return arr;
			}
		 
		 6-21
			 public static int[] shuffle(int[] arr) {
					for(int i=0; i< arr.length;i++) {
						int j = (int)(Math.random()*arr.length);
					
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
					return arr;
			}
		
		6-22
		
		void turnOnOff() {
			isPowerOn = !isPowerOn;
		}
		void volumeUp() {
			if(volume < MAX_VOLUME)
			volume++;
		}
		void volumeDown() {
			if(volume > MIN_VOLUME)
			volume--;
		}
		void channelUp() {
			if(channel==MAX_CHANNEL) {
				channel = MIN_CHANNEL;
			} else {
				channel++;
			}
		}
		void channelDown() {
			if(channel==MIN_CHANNEL) {
				channel = MAX_CHANNEL;
			} else {
				channel--;
			}
		}
		
		6-22
			public static boolean isNumber(String str) {
				if(str==null || str.equals(""))
					return false;
				for(int i=0; i< str.length();i++) {
					char ch = str.charAt(i);
					if(ch < '0' || ch > '9') {
						return false;
					}
				} 
				return true;
			}

		6-23
		public static int max(int[] arr) {
			if(arr==null || arr.length==0)
				return -999999;
		int max = arr[0]; 
		for(int i=1; i< arr.length;i++) {
			if(arr[i] > max)
				max = arr[i];
			}
			return max;
		}
		
		6-24
		public static int abs(int value) {
			return value >=0 ? value : -value;
		}


		  
			
 		
	 */
	
	public static void main(String[] args) {
		
			


	}
	
	
		

}

