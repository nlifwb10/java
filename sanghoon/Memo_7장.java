package sanghoon;

//import java.util.Date;

//import java.util.Date;

public class Memo_7장 {
	
	
	/*	
	  
	  ▶ 상속
	  - 기존의 클래스로 새로운 클래스를 작성하는것 (코드의 재사용)
	  - 부모 자식관계
	  
	  ▶ 포함
	  - 클래스의 멤버로 참조변수를 선언하는것
	   ex) 클래스안에서 인스턴스를 생성하는것.
	   ex) class Circle{ Point c = new Pint(); }
	   
	  ▶ 상속 / 포함
	  - ~ 은 ~이다. -> 상속관계
	  - ~ 은 ~ 을 가지고 있다 -> 포함관계
	  
	  ▶ 단일상속
	  - Java는 단일상속만을 허용한다!(중요)
	     
	  ▶ Object 클래스 - 모든 클래스의 조상
	  - 부모가 없는 클래스는 자동적으로 Obeject 클래스를 상속받게 된다.
	  - toString(),equals() , hashCode()....
	  
	  ▶ 오버라이딩
	  - 상속받은 조상의 메서드를 자신에 맞게 변경하는것
	  - 1. 오버라이딩을 하려면 선언부는 똑같아야함! ( 반환타입 , 메서드이름,매개변수목록)
	  - 2. 접근제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할수 없다.
	  - 3. 예외는 조상 클래스의 메서드 보다 많이 선언할 수 있다.
	 
	  ▶ 참조변수 super
	  - 조상꺼.
	  - 조상에는 변수가 x 자식에는 x 변수가 없으면 자식에서 this.x 하면 조상꺼 바라보게됨..
	 
	  ▶ super() - 조상의 생성자
	  - 조상의 생성자를 호출할 떄 사용
	  - 조상의 멤버는 조상의 생성자를 호출해서 초기화
	  - 생성자의 첫 줄에는 반드시 생성자를 호출해야 한다.!!!!!중요
	        그렇지 않으면 컴파일러가 생성자의 첫 줄에 super()를 삽입 
	  
	  ▶ 패키지
	  - 서로 관련된 클래스의 묶음
	  - rt.jar는 ->runtime 실행할때 ! java9부터 없어짐 !
	  
	  ▶ 클래스 패스
	  - 클래스 파일 (*.class)의 위치를 알려주는 경로(path)
	  - 환경변수 classpath로 관리하며 ,경로간의 구분자는 ';' 를사용 
	    classpath(환경변수)에 패키지의 루트를 등록해줘야함
	
	  ▶ import 문
	  - 클래스를 사용할 때 패키지 이름을 생략할수있다.
	  ex) java.util.Date today = new java.util.Date(); -> import java.util.Data;
	  - java.lang 패키지 클래스는 import하지 않고도 사용할수있도록 해놨음(생략가능)!!!이건 예외
	  ex) String,Object,System,Thread...
		
	  ▶ static import문
	  - static멤버를 사용할떄 클래스 이름을 생략할 수 있게 해준다.
	  ex) import static java.lang.Math.random; -> random();이렇게사용가능.	
	  - 꼭필요할때만쓰자! 구분이안되기때문
	  
	  ▶ 제어자  
	  -접근제어자 : public,protected,(default),private
	  -그외제어자 : static,final,abstract,native,transient,synchronized,volatile,stricftp
	  
	  ▶ abstract - 추상의,미완성의
	  - 클래스 : 클래스 내에 추상 메서드가 선언되어 있음을 의미 
	  - 메서드 : 선언부만 작성하고 구현부는 작성하지 않은 추상 메서드임을 알린다.
	  - new 해서 클래서 생성안됨 - 인스턴스 생성불가!
	  
	   ▶ 캡슐화 와 접근제어자
	   - 접근제어자를 사용하는이유
	    ->외부로부터 데이터를 보호하기 위해
	   
	   ▶ 다형성 ★★★★★★
	   - 조상 타입 참조 변수로 자손 타입 객체를 다루는것
	   ex) Tv t = new SmartTv();
	   - 무조건 왼쪽 부모가 오는건 괜찮음!
	   
	  ▶ 참조변수의 형변환
	  - 사용할수 있는 멤버의 갯수를 조절하는 것
	  - 조상 자손 관계의 참조변수는 서로 형변환 가능
	  
	  ▶ instanceof 연산자
	  - 참조변수의 형변환 가능여부 확인에 사용 , 가능하면 true반환
	  - 형변환 전에 반드시 instanceof로 확인해야함!!!
	  - 해당 조상까지 true
	  
	  ▶ Vector 조상이  Object
	  - 모든종류의 객체저장가능!
	  - 길이도 변경가능! -> 배열은 변경이 안됨!
	  
	  ▶ 추상클래스
	  - 미완성 설계도. 미완성 메서드를 갖고 있는 클래스 
	  - 상속을통해 추상메서드를 구현해야함
	   ->만약 상속을통해 모든 메서드를 구현안할시 상속한클래스에 abstract를 붙여야함
	 
	  ▶ 인터페이스
	   - 추상메서드의 집합
	   - 구현된 것이 전혀 없는 설계도 . 껍데기(모든멤버가 public)
	   - 그러면 추상클래스와 인터페이스의 차이는?
	    => 추상클래스는 일반적인 클래스에 추상메서드가있는거고 / 인터페이스는 추상메서드만!!있다.
	   - 변수 가질수 x (iv,cv 가질수없다) 
	   - 상수만가질수있음 ex)public static final 타입상수이름 = 값;
	   - public 이랑 abstract 생략할수있다. 왜? 모든지 인터페이스는 public이랑 추상메서드이니까..
	   - int a =1; -> 이러면 public static final int a = 1;이거임!!!생략된거임!!!
	   - 인터페이스의 조상은 인터페이스만 가능(Object가 최고조상아님)
	   - 다중상속이 가능!
	  
	   ▶ 내부클래스
	   - 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다.
	   - 코드의 복잡성을 줄일수 있다.
	   - iv 클래스 , cv클래스 , 메서드안에(내부클래스) 이렇게 되어있음
	   - 내부클래스 변수 접근제어자는 public,protect,default,private 다됨... 
	   - 내부클래스에 static이 필요하면 static 클래스에서만 됨!!
	   - But 상수인경우에는 (final) static이 static메서드에서만 되는게아님! 인스턴스메서드에서도 사용가능!
	   - 지역내부 클래스에서 메서드의 지역변수중에 상수만 사용할수있음
	   - 외부클래스를 먼저 생성하고 사용해야함
	   
	   
	   ▶ final 
	  -상수는 constant pool에서 따로 관리하고있음.
	  
	   ▶ 익명 클래스
	   - 이름이 없는 일회용 클래스. 정의와 생성을 동시에
	      
	    
	*/

	public static void main(String[] args) {
		System.out.println(Outer.StaticInner.cv);
		Outer.StaticInner si = new Outer.StaticInner();		
		System.out.println(si.iv);
	}
}


class Outer{
	class InstanceInner{
		int iv = 100;
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
}

