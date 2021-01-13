# Chapter08. 예외처리

## 1. 프로그램 오류
- 컴파일 에러: `.java` 파일을 `.class` 파일로 컴파일 할 때 발생하는 에러 
- 런타임 에러: 프로그램이 실행하는 중에 발생하는 에러 
- 논리적 에러: 기대한 코드 결과와 다른 결과를 초래하는 에러 

### 런타임 에러
- 에러(Error): 코드를 수정함으로써 수습될 수 없는 심각한 오류 
- 예외(Exception): 코드를 수정함으로써 수습될 수 있는 미약한 오류
	- NullPointException
	- ArrayIndexOutBoundsException 

## 1.2 예외처리의 정의와 목적
- 정의: 예외 발생에 대비한 코드를 작성하는 것 
- 목적: 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것 

## 1.3 예외처리구문(try-catch)

## 1.4 try-catch문에서의 흐름
- 예외가 발생한 코드줄부터 프로그램이 실행되지 않는다.

```
System.out.println(1);
System.out.println(2);

try{
	System.out.println(3);
	System.out.println(0/0);
	System.out.println(4);
}catch(ArithmeticException ae){
	System.out.println(5);
}
System.out.println(6);
```

실행결과

```
1
2
3
4
```

## 1.5 예외 발생시키기
1. 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든다.
2. 키워드 throw를 이용해서 예외를 발생시킨다.
3. e.printStackTrace()를 사용하여 에러 종류와 메세지, 호출스택을 확인한다.

## 1.6 예외클래스의 계층구조
- RuntimeException 클래스들 : 프로그래머의 실수로 발생하는 예외 ->예외처리 선택 
- Exception 클래스들 : 사용자의 실수와 같은 외적인 요인들에 의해 발생하는 예외 ->예외처리가 필수 

## 1.7 예외의 발생과 catch 블럭

## 1.8 finally 블럭
- 예외 발생시 `try > catch > finally`
- 예외 미발생시 `try > finally`
- 예외가 발생하든 안하든 실행되어야 하는 코드가 있을 경우 사용 

## 1.9 메서드에 예외 선언하기
- throw  : 예외 선언할 때 사용 
- throws : 호출한 메서드에서 예외 선언할 때 사용 

## 1.10 예외 되던지기(re-throwing)
- 예외를 처리한 후 다시 예외를 생성해서 호출한 메서드로 전달하는 것 
- 예외가 발생한 메서드와 호출한 메서드, 양쪽에서 예외를 처리해야 하는 경우에 사용 

## 1.11 사용자정의 예외 만들기

## 메모
- 인스턴스 변수가 상수일 경우 선언시에 바로 초기화하지 않고 생성자를 통해서 단 한번만 초기화 시킬 수 있다. 



