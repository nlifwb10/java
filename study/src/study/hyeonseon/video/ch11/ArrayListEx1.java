package study.hyeonseon.video.ch11;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();	//길이를 지정하지 않으면 기본적으로 길이가 10인 배열로 생성된다.
		
		/* 
		  - 객체 배열은 참조변수 배열이기 때문에 배열의 길이를 저장할 길이의 2배정도로 지정해도 별 차이가 없다.
			  - 참조변수의 크기
				  - 32bit JVM: 4byte
				  - 64bit JVM: 8byte
		  - ArrayList에는 객체만 저장할 수 있기 때문에 숫자를 저장할 수 없다. 
		  	- 하지만 래퍼 클래스인 Integer를 쓰면 저장가능하다.
		  	- 이 부분을 보완하고자 jdk1.5에서 오토박싱 기능이 추가되면서 컴파일러가 자동으로 변환해준다.
		   		list.add(123) -> list.add(new Integer(123)) 
		  
		 */
		
	}
}
