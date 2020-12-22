package study.sanghoon;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Practice_10장 {

	
	
	/*
	 10-1
	 
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		cal.set(Calendar.YEAR, 2010);
		for(int i = Calendar.JANUARY; i <= Calendar.DECEMBER; i++){

			cal.set(Calendar.MONTH, i);
			
			cal.set(Calendar.WEEK_OF_MONTH, 3); //현재 월의 몇째 주 0부터라서그런듯?

			cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY); 

			System.out.println(sdf.format(cal.getTime())+"은 2번째 일요일입니다.");

		}
	  
	  10-2
	  	static int paycheckCount(Calendar from, Calendar to) {
			if(from == null || to == null) {
				return 0;
			}
			if(from.equals(to) || (from.get(Calendar.DATE) == 21 && to.get(Calendar.DATE) == 21)) {
				return 1;
			}
			int fromYear = from.get(Calendar.YEAR);
			int fromMon = from.get(Calendar.MONTH);
			int fromDay = from.get(Calendar.DAY_OF_MONTH);
			int toYear = to.get(Calendar.YEAR);
			int toMon = to.get(Calendar.MONTH);
			int toDay = to.get(Calendar.DAY_OF_MONTH);
	
			int monDiff = (toYear * 12+ toMon) -  (fromYear * 12+fromMon);
			
			if(monDiff < 0) { return 0;}
			
			if(fromDay <= 21 && toDay >= 21) {
				monDiff --;
			}
			
			if(fromDay > 21 && toDay < 21) {
				monDiff--;
			}
				
			return monDiff;
		}
		
		10-3
		
		
			DecimalFormat df = new DecimalFormat("###,###,###.#");
			DecimalFormat df2 = new DecimalFormat("#,###,####,####");
			String str = "123,456,789.5";
			
			
			Number p;
			try {
				p = df.parse(str);
				Double d = p.doubleValue();
				System.out.println("data :" + str);
				System.out.println("반올림 : " + Math.round(d));
				System.out.println("만단위 :" +df2.format(d));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		10-4
			
		  	DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
			DateFormat df2 = new SimpleDateFormat("입력하신날짜는 E요일입니다");
	
			Scanner sc = new Scanner(System.in);
			Date dt = null;
			while(true) {
					System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예 : 2007/05/11");
					System.out.printf(">>>");
					try {
						dt = df.parse(sc.nextLine());
						break;
					} catch (ParseException e) {
					}
			}
			
			System.out.println("입력하신 날짜는" + df2.format(dt));
			
		
		  10-5
		 	static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
				int diff = 0;
				try {
					int year1 = Integer.parseInt(yyyymmdd1.substring(0,4));
					int month1 = Integer.parseInt(yyyymmdd1.substring(4,6)) - 1;
					int day1 = Integer.parseInt(yyyymmdd1.substring(6,8));
					int year2 = Integer.parseInt(yyyymmdd2.substring(0,4));
					int month2 = Integer.parseInt(yyyymmdd2.substring(4,6)) - 1;
					int day2 = Integer.parseInt(yyyymmdd2.substring(6,8));
					Calendar date1 = Calendar.getInstance();
					Calendar date2 = Calendar.getInstance();
					date1.set(year1, month1, day1);
					date2.set(year2, month2, day2);
					diff = (int)((date1.getTimeInMillis()-date2.getTimeInMillis())/(24*60*60*1000));
				} catch(Exception e) {
					diff = 0;
				}
				return diff;
			}
			
			
		    10-6
					String strStartDate = "20000101";
			        String strEndDate = "20160129";
			        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
					try {
						Date startDate = sdf.parse(strStartDate);
						Date endDate = sdf.parse(strEndDate);
						long diffDay = Math.abs((startDate.getTime() - endDate.getTime()) / (24*60*60*1000));
				        System.out.println(diffDay+"일");
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
        
			10-7
				
			10-8
			//해설지 작성 ...솔직히 잘안써서 그때그때 보면서 사용해도될듯?
			ZonedDateTime zdt = ZonedDateTime.now();
			ZoneId nyId = ZoneId.of("America/New_York");
			ZonedDateTime zdtNY = ZonedDateTime.now().withZoneSameInstant(nyId);
			System.out.println(zdt);
			System.out.println(zdtNY);
			long sec1 = zdt.getOffset().getTotalSeconds();
			long sec2 = zdtNY.getOffset().getTotalSeconds();
			long diff = (sec1 - sec2)/3600;
			System.out.println("sec1="+sec1);
			System.out.println("sec2="+sec2);
			System.out.printf("diff=%d hrs%n",diff);
	  
	 */
	
	
	
	
	
	
	public static void main(String[] args) {
		
		ZonedDateTime zdt = ZonedDateTime.now();
		ZoneId nyId = ZoneId.of("America/New_York");
		ZonedDateTime zdtNY = ZonedDateTime.now().withZoneSameInstant(nyId);
		System.out.println(zdt);
		System.out.println(zdtNY);
		long sec1 = zdt.getOffset().getTotalSeconds();
		long sec2 = zdtNY.getOffset().getTotalSeconds();
		long diff = (sec1 - sec2)/3600;
		System.out.println("sec1="+sec1);
		System.out.println("sec2="+sec2);
		System.out.printf("diff=%d hrs%n",diff);
		
	}
	
	


}
