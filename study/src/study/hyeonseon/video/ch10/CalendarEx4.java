// roll, add등의 함수사용법을 보여준다.
package study.hyeonseon.video.ch10;

import java.util.Calendar; 

class  CalendarEx4
{
	public static void main(String[] args) 
	{
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2005, 7, 31);	// 2005년 8월 31일
		date2.set(2005, 7, 31); // 2005년 8월 31일

		date1.add(Calendar.DATE, 1);
		date2.roll(Calendar.DATE, true);

		System.out.println(toString(date1));
		System.out.println(toString(date2));
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1) +"월 " + date.get(Calendar.DATE) + "일";
	}
}

/*

*/
