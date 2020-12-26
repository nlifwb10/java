package study.hyeonseon.video.ch10;

import java.util.Calendar; 

class CalendarEx5
{ 
      public static void main(String[] args) 
      { 
            if(args.length !=2) { 
                  System.out.println("Usage : java CalendarTest 2005 9"); 
                  return; 
            } 
            int year = Integer.parseInt(args[0]); 
            int month = Integer.parseInt(args[1]); 

            int START_DAY_OF_WEEK = 0; 
            int END_DAY = 0; 

            Calendar sDay = Calendar.getInstance();       // 시작일 
            Calendar eDay = Calendar.getInstance();       // 끝일 

            // 월의 경우 0부터 11까지의 값을 가지므로 1을 빼줘야한다. 
            // 예를 들어, 2004년 11월 1일은 sDay.set(2004, 10, 1);과 같이 해줘야한다. 
            sDay.set(year, month-1, 1);       
            eDay.set(year, month, 1); 

            // 다음달의 첫날에서 하루를 빼면 현재달의 마지막날이된다. 
            // 12월 1일에서 하루를 빼면 11월 30일이 된다. 
            eDay.add(Calendar.DATE, -1);       

            // 첫번째 요일이 무슨요일인지 알아낸다. 
            START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK); 
            // eDay에 지정된 날짜를 얻어온다. 
            END_DAY = eDay.get(Calendar.DATE); 
            
            System.out.println("      " + args[0] +"년 " + args[1] +"월"); 
            System.out.println(" SU MO TU WE TH FR SA"); 

            // 해당월의 1일이 어느 요일인지에 따라서 공백을 출력한다. 
            // 만일 1일이 수요일이라면 공백을 세번 찍는다.(일요일부터 시작) 
            for(int i=1; i < START_DAY_OF_WEEK; i++) { 
                  System.out.print("   "); 
            } 

            for(int i=1, n=START_DAY_OF_WEEK ; i <= END_DAY; i++, n++) { 
                  System.out.print((i < 10)? "  "+i : " "+i ); 
                  if(n%7==0) System.out.println(); 
            } 
      } 
} 


/* 
C:\j2sdk1.4\work>java CalendarTest 2004 3 
      2004년 3월 
 SU MO TU WE TH FR SA 
     1  2  3  4  5  6 
  7  8  9 10 11 12 13 
 14 15 16 17 18 19 20 
 21 22 23 24 25 26 27 
 28 29 30 31 
C:\j2sdk1.4\work> 
*/


