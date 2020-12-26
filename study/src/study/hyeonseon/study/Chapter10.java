package study.hyeonseon.study;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Chapter10 {

	public static void main(String[] args) {
		System.out.println("PDF 86 ~");
		
		practice1();
		practice2();
		practice3();
		practice4();
		practice5();
		practice6();
		practice7();
		practice8();

	}

	public static void practice1() {
		System.out.println("\n문제10-1 ========================================");
		
		Calendar cal = Calendar.getInstance();
		cal.set(2010, 0, 1);
		
		for(int i = 0; i < 12; i ++) {
			int day = cal.get(Calendar.DAY_OF_WEEK);
			int secondSun = day == 1 ? 8 : 16 - day;
			
			cal.set(Calendar.DAY_OF_MONTH, secondSun);
			Date d = cal.getTime();
			System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 일요일 입니다.").format(d));
			
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH, 1);
		}
	}
	
	public static void practice2() {
		System.out.println("\n문제10-2 ========================================");
		
		Calendar fromCal = Calendar.getInstance();
		Calendar toCal = Calendar.getInstance();
		
		fromCal.set(2010,0,1);
		toCal.set(2010,0,1);
		printResult(fromCal, toCal);
		
		fromCal.set(2010,0,21);
		toCal.set(2010,0,21);
		printResult(fromCal, toCal);
		
		fromCal.set(2010,0,1);
		toCal.set(2010,2,1);
		printResult(fromCal, toCal);
		
		fromCal.set(2010,0,1);
		toCal.set(2010,2,23);
		printResult(fromCal, toCal);
		
		fromCal.set(2010,0,23);
		toCal.set(2010,2,21);
		printResult(fromCal, toCal);
		
		fromCal.set(2011,0,22);
		toCal.set(2010,2,21);
		printResult(fromCal, toCal);
		
	}
	
	public static void practice3() {
		System.out.println("\n문제10-3 ========================================");
		
		/**
		data:123,456,789.5
		반올림:123456790
		만단위:1,2345,6790
		 */
		
		String str = "123,456,789.5";
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#,####");
		
		try {
			Number num = df.parse(str);			
			double d = num.doubleValue();
			
			System.out.println("data: " + str);
			System.out.println("반올림: " + Math.round(d));
			System.out.println("만단위: " + df2.format(d));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static void practice4() {
		System.out.println("\n문제10-4 ========================================");
	
		DateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");
		DateFormat format2 = new SimpleDateFormat("입력하신 날짜는 E요일입니다.");
		Scanner sc = new Scanner(System.in);
		Date tmp  = null;
		/*
		do {
			System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2007/05/11)");
			
			try {
				System.out.println(">>");
				tmp = format1.parse(sc.nextLine());
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}while(true);
		
		System.out.println(format2.format(tmp));*/
	}
	
	public static void practice5() {
		System.out.println("\n문제10-5 ========================================");
		
		System.out.println(getDayDiff("20010103","20010101"));
		System.out.println(getDayDiff("20010103","20010103"));
		System.out.println(getDayDiff("20010103","200103"));
		
	}
	
	public static void practice6() {
		System.out.println("\n문제10-6 ========================================");

		Date today;
		Date birthDay;		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		cal1.set(2016, 0, 29);
		cal2.set(2000, 0, 1);
		today = new Date(cal1.getTimeInMillis());
		birthDay = new Date(cal2.getTimeInMillis());
		
		long difference = (cal1.getTimeInMillis() - cal2.getTimeInMillis()) / 1000;
		int result = (int) (difference/(24*60*60));
		
		System.out.println("birth day = " + format.format(birthDay));
		System.out.println("today = " + format.format(today));
		System.out.println(result + " days");
	}
	
	public static void practice7() {
		System.out.println("\n문제10-7 ========================================");
		
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 11, 1);
		int day = cal.get(Calendar.DAY_OF_WEEK);	//요일 
		int week = cal.get(Calendar.DAY_OF_MONTH);	//몇번째 주  
		
		//System.out.println(day);	//5: 목요일 
		//System.out.println(week);	//1, 첫번째 주 
		
		int t = day == 1 ? 25 - day : 32 - day;
		cal.set(2016, 11, t);
		Date result = cal.getTime();
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(result));
	}
	
	public static void practice8() {
		System.out.println("\n문제10-8 ========================================");
		
		TimeZone koreaTime;
		TimeZone newYorkTime;
		
		koreaTime = TimeZone.getTimeZone("Asia/Seoul");
		newYorkTime = TimeZone.getTimeZone("America/New_York");
		
		//System.out.println(koreaTime);		
		//System.out.println(newYorkTime);
		
		Calendar cal1 = Calendar.getInstance(koreaTime);
	    Calendar cal2 = Calendar.getInstance(newYorkTime);
	    
	    System.out.println("sec1 = " + Math.abs((cal1.getTimeInMillis() - cal2.getTimeInMillis())/1000));
	    System.out.println("sec2 = " + (cal1.getTimeInMillis() - cal2.getTimeInMillis())/1000);
	}
	
	//practice5
	static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
		int result = 0;
		
		DateFormat format = new SimpleDateFormat("yyyyMMdd");
		Date date1 = null;
		Date date2 = null;
		
		try {
			date1 = format.parse(yyyymmdd1);
			date2 = format.parse(yyyymmdd2);
			
			Calendar cal1 = Calendar.getInstance();
			Calendar cal2 = Calendar.getInstance();
			cal1.setTime(date1);
			cal2.setTime(date2);
			
			long difference = (cal1.getTimeInMillis() - cal2.getTimeInMillis()) / 1000;
			result = (int) (difference/(24*60*60));
		} catch (ParseException e) {
			result = 0;
		}
		
		return result;
	}
	
	//practice2
	static int paycheckCount(Calendar from, Calendar to) {
		int monDiff = 0;
		
		int fromDay = from.get(Calendar.DAY_OF_MONTH);
		int toDay = to.get(Calendar.DAY_OF_MONTH);
		
		if(from == null || to == null) {
			return 0;
		}
		if(from == to && fromDay == 21 && toDay == 21) {
			return 1;
		}
		
		monDiff = Math.abs(from.get(Calendar.MONTH) - to.get(Calendar.MONTH));
		
		if(monDiff < 0) {
			return 0;
		}
		
		if(fromDay <= 21 || toDay >= 21) {
			monDiff++;
		}else if(fromDay > 21 || toDay < 21) {
			monDiff--;
		}
		
		return monDiff;
	}
	static void printResult(Calendar from, Calendar to) {
		Date fromDate = from.getTime();
		Date toDate = to.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.print(sdf.format(fromDate)+" ~ "+sdf.format(toDate)+":");
		System.out.println(paycheckCount(from, to));
	}
}

