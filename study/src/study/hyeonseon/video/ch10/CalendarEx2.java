package study.hyeonseon.video.ch10;

import java.util.Calendar; 

class  CalendarEx2
{
	public static void main(String[] args) 
	{
		// 요일은 1부터 시작하기 때문에, DAY_OF_WEEK[0]은 비워두었다.
		final String[] DAY_OF_WEEK = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();

		// month의 경우 0부터 시작하기 때문에 8월인 경우, 7로 지정해야한다.
		date1.set(2005, 7, 15); // 2004년 8월 15일로 날짜를 설정한다. set(int year, int month, int date) 
		System.out.println("date1은 "+ toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"이고,");
		System.out.println("오늘(date2)은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"입니다.");

		// 두 날짜간의 차이를 얻으려면, getTimeInMillis()를 이용해서 천분의 일초 단위로 변환해야한다.
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println("그 날(date1)부터 지금(date2)까지 "+ difference +"초가 지났습니다.");
		System.out.println("일(day)로 계산하면 "+ difference/(24*60*60) +"일 입니다.");	// 1일 = 24 * 60 * 60
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1) +"월 " + date.get(Calendar.DATE) + "일 ";
	}
}

/*
---------- java ----------
date1은 2005년 8월 15일 월요일이고,
오늘(date2)은 2006년 2월 28일 화요일입니다.
그 날(date1)부터 지금(date2)까지 17020800초가 지났습니다.
일(day)로 계산하면 197일 입니다.

Output completed (1 sec consumed) - Normal Termination
*/
