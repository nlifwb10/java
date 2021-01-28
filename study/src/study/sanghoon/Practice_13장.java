package study.sanghoon;

import java.util.Scanner;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Practice_13장 {
	
	
	/*

	13-1
			Thread t1 = new Thread(new Thread1());
			t1.start();
			
			class Thread1 implements Runnable {
				public void run() {
					for(int i=0; i < 300; i++) {
						System.out.print('-');
					}
				}
			}
			
	 13-2
	 	b -> run호출함!
	 	
	 13-3
	 	b,f
	 
	 13-4
	 	d, ->몰랐음.
	 
	 13-5
	 	실행결과 똑같음..
	 
	 13-6
	 	실행결과 : 5에서 Exceiption나면서 종료 왜냐하면 setDaemon을 하므로서 
	 	메인쓰레드가 종료시 데몬쓰레드도 종료하게되어있다
	 	
	 13-7
	 	public static void main(String[] args)
		{
			Thread5 th1 = new Thread5();
				th1.start();
			try {
				Thread.sleep(6*1000);
			} catch(Exception e) {}
			
			stopped = true; // 쓰레드를 정지시킨다.
			th1.interrupt(); -->추가 잠들어있는 스레드를 꺠움!
			System.out.println("stopped");
		}
		
	   13-8
	   		public void run() {
				while(true) {
					try {
						if(words.size() == data.length) {
							break;
						}else {
							int randomIdx = (int)(Math.random()* data.length);
							words.add(data[randomIdx]);
							Thread.sleep(2000);
							System.out.println(words);
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} // end of run()
			
		13-9
			이해x
		
		
	 */

	
	public static void main(String args[])
	{
	
		Test23 th1 = new Test23();
		th1.start();
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요 ."); 
		System.out.println("입력하신 값은 입니다 " + input + " .");
		th1.interrupt();// . 쓰레드에게 작업을 멈추라고 요청한
	} // main
}

class Test23 extends Thread {
	public void run() {
		int i = 10;
		
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			try {
				Thread.sleep(1000); // 1초 지연
			} catch(InterruptedException e) {
				interrupt();
			}
		}
		System.out.println("카운트가 종료되었습니다 ."); 
	} // main
}
