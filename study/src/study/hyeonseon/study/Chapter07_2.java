package study.hyeonseon.study;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//7-17
class Unit{
	// 현재 위치
	int x, y;	
	//지정된 위치로 이동
	void move(int x, int y) {}
	//현재 위치에 정지
	void stop() {} 
}

class Marine extends Unit { // 보병
	//스팀팩을 사용한다
	void stimPack() {}	
}

class Tank extends Unit { // 탱크
	//공격모드를 변환한다
	void changeMode() {}	
}

class Dropship extends Unit { // 수송선
	//선택된 대상을 태운다
	void load() {}
	//선택된 대상을 내린다
	void unload() {}
}

//7-18
class Robot {
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

//7-20
class Parent2 {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Child2 extends Parent2 {
	int x = 200;

	void method() {
		System.out.println("Child Method");
	}
}


public class Chapter07_2 {
	public void action(Robot param){
		//Robot robot = param;
		
	}
	public static void main(String[] args) {
		// 객체지향 프로그래밍 
		practice13();
		practice14();
		practice15();
		practice16();
		practice17();
		practice18();
		practice19();
		practice20();
		practice21();
		practice22();
		practice23();
		practice24();
		practice25();
		practice26();
		practice27();
		practice28();
		practice29();
	}
	

	public static void practice13() {
		System.out.println("\n문제7-13 ========================================");
		System.out.println("Math 클래스의 생성자는 접근 제어자가 private이다. 그 이유는 무엇인가?");
		System.out.println("private으로 지정하지 않으면 외부의 값으로 인해 독립적인 계산을 방해받을 수 있기 때문");
	}

	public static void practice14() {
		System.out.println("\n문제7-14 ========================================");
	}

	public static void practice15() {
		System.out.println("\n문제7-15 ========================================");
		System.out.println("클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은?(모두 고르시오)");
		System.out.println(
				"class Unit {}\n" + 
				"class AirUnit extends Unit {}\n" + 
				"class GroundUnit extends Unit {}\n" + 
				"class Tank extends GroundUnit {}\n" + 
				"class AirCraft extends AirUnit {}\n" + 
				"Unit u = new GroundUnit();\n" + 
				"Tank t = new Tank();\n" + 
				"AirCraft ac = new AirCraft();");
		System.out.println();
		System.out.println("a. u = (Unit)ac;");
		System.out.println("b. u = ac;");
		System.out.println("c. GroundUnit gu = (GroundUnit)u;");
		System.out.println("d. AirUnit au = ac;");
		System.out.println("e. t = (Tank)u;");
		System.out.println("f. GroundUnit gu = t;");
		System.out.println("답: a, c");
	}

	public static void practice16() {
		System.out.println("\n문제7-16 ========================================");
		System.out.println("다음 중 연산결과가 true가 아닌 것은?(모두 고르시오)");
		System.out.println(
				"class Car {}\n" + 
				"class FireEngine extends Car implements Movable {}\n" + 
				"class Ambulance extends Car {}\n" + 
				"FireEngine fe = new FireEngine();");
		System.out.println();
		System.out.println("a. fe instanceof FireEngine");
		System.out.println("b. fe instanceof Movable");
		System.out.println("c. fe instanceof Object");
		System.out.println("d. fe instanceof Car");
		System.out.println("e. fe instanceof Ambulance");
		System.out.println("답: c, e");
	}

	public static void practice17() {
		System.out.println("\n문제7-17 ========================================");
		System.out.println("답: 클래스 참조");
	}

	public static void practice18() {
		System.out.println("\n문제7-18 ========================================");
		
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		/*
		for(int i=0; i< arr.length;i++){
			action(arr[i]);
		}
		 */
	}
	
	public static void practice19() {
		System.out.println("\n문제7-19 ========================================");
	}

	public static void practice20() {
		System.out.println("\n문제7-20 ========================================");
		/*
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
		*/
		System.out.println("p.x = 200");
		System.out.println("Child Method");
		System.out.println("p.x = 200");
		System.out.println("Child Method");
	}

	public static void practice21() {
		System.out.println("\n문제7-21 ========================================");
		System.out.println("다음과 같이 attack 메서드가 정의되어 있을 때 이 메서드의 매개변수로 가능한 것 두 가지를 적으시오.");
		System.out.println(
				"interface Movable {\n" + 
				"void move(int x, int y);\n" + 
				"}\n" + 
				"void attack(Movable f) {\n" + 
				"/* 내용 생략 */\n" + 
				"}");
		System.out.println("답: 1. 인터페이스, 2. 인터페이스 상속 클래스");
	}

	public static void practice22() {
		System.out.println("\n문제7-22 ========================================");
	}

	public static void practice23() {
		System.out.println("\n문제7-23 ========================================");
	}
	
	public static void practice24() {
		System.out.println("\n문제7-24 ========================================");
		System.out.println("다음 중 인터페이스의 장점이 아닌 것은?");
		System.out.println();
		System.out.println("a. 표준화를 가능하게 해준다");
		System.out.println("b. 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다");
		System.out.println("c. 독립적인 프로그래밍이 가능하다");
		System.out.println("d. 다중상속을 가능하게 해준다");
		System.out.println("e. 패키지간의 연결을 도와준다"); 
		System.out.println("답: b, e");
	}
	public static void practice25() {
		System.out.println("\n문제7-25 ========================================");
		
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		
		System.out.println(in.iv);
	}
	public static void practice26() {
		System.out.println("\n문제7-26 ========================================");
		
		Outer2.Inner in = new Outer2.Inner();
		System.out.println(in.iv);
	}
	public static void practice27() {
		System.out.println("\n문제7-27 ========================================");
		
		Outer3 out = new Outer3();
		Outer3.Inner inner = out.new Inner();
		inner.method1();
	}
	public static void practice28() {
		System.out.println("\n문제7-28 ========================================");
		
		Frame f = new Frame();
		f.addWindowListener(new EventHandler() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}			
		});
		
	}
	public static void practice29() {
		System.out.println("\n문제7-29 ========================================");
		System.out.println("지역 클래스에서 외부 클래스의 인스턴스 멤버와 static 멤버에 모두 접근할 수 있지만, "
				+ "지역변수는 final 이 붙은 상수만 접근할 수 있는 이유 무엇인가?");
		
	}
}

//7-25
class Outer {
	class Inner {
		int iv = 100;
	}
}

//7-26
class Outer2{
	static class Inner {
		int iv = 200;
	}
}

//7-27
class Outer3 {
	int value = 10;

	class Inner {
		int value = 20;

		void method1() {
			int value = 30;
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer3.this.value);
		}
	} // Inner클래스의 끝
} // Outer클래스의 끝

//7-28
class EventHandler extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
	}
}
