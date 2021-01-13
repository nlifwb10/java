package study.hyeonseon.video.ch10;

import java.util.Calendar; 

class  CalendarEx1
{
	public static void main(String[] args) 
	{
		Calendar today = Calendar.getInstance();		// 기본적으로 현재날짜와 시간으로 설정된다.
		System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
		System.out.println("월(0~11, 0:1월): " + (today.get(Calendar.MONTH))); // 0: 1월, 1:2월, ... 11:12월
		System.out.println("이 해의 몇 째 주: " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 째 주: " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이 달의 몇 일: " + today.get(Calendar.DATE));	// DATE와 DAY_OF_MONTH는 같다.
		System.out.println("이 달의 몇 일: " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 몇 일: " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1~7, 1:일요일): " + today.get(Calendar.DAY_OF_WEEK));	// 1:일요일, 2:화요일, ... 7:토요일
		System.out.println("이 달의 몇 째 요일: "	+ today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전_오후(0:오전, 1:오후): " + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11): " + today.get(Calendar.HOUR));
		System.out.println("시간(0~23): " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59): " + today.get(Calendar.MINUTE));
		System.out.println("초(0~59): " + today.get(Calendar.SECOND));
		System.out.println("1000분의 1초(0~999): " + today.get(Calendar.MILLISECOND));
		System.out.println("TimeZone(-12~+12): " + (today.get(Calendar.ZONE_OFFSET)/(60*60*1000))); // 천분의 1초를 시간으로 표시하기 위해 3600000으로 나누었다.(1시간 = 60 * 60초)
		System.out.println("이 달의 마지막 날: " + today.getActualMaximum(Calendar.DATE) ); // 이 달의 마지막일을 찾는다.
	}
}

/*
---------- java ----------
이 해의 년도 : 2005
월(0~11, 0:1월): 8		<-- 9월
이 해의 몇 째 주: 37
이 달의 몇 째 주: 2
이 달의 몇 일: 4
이 달의 몇 일: 4
이 해의 몇 일: 247
요일(1~7, 1:일요일): 1	<-- 일요일
이 달의 몇 째 요일: 1		<-- 이달의 첫번째 일요일
오전_오후(0:오전, 1:오후): 1	
시간(0~11): 3
시간(0~23): 15
분(0~59): 10
초(0~59): 42
1000분의 1초(0~999): 965
TimeZone(-12~+12): 9
이 달의 마지막 날: 30

Output completed (0 sec consumed) - Normal Termination
*/

