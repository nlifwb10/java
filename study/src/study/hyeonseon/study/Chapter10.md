# Chapter10

- java.util.Date
	- 날짜와 시간을 다루는 클래스(JDK1.0)
	- 해당 클래스는 deprecated되었지만 여전히 사용되고 있다.
- java.util.Calendar
	- Date클래스 개선한 새로운 클래스 제공(JDK1.1)
	- 여전히 단점이 존재 
- java.time 패키지 
	- Date와 Calendar의 단점을 개선한 새로운 클래스 제공(JDK1.8)

## Calendar 클래스

#### Calendar 클래스는 추상 클래스 이므로 getInstance()를 통해 구현된 객체를 얻어야 한다.
```
//Calendar cal = new Calendar(); //error
Calender cal = Calendar.getInstance();
```

### get()
- get()으로 날짜와 시간 필드 가져오기 

```
Calender cal = Calendar.getInstance();	//현재 날짜와 시간으로 세팅된다.
int thisYear = cal.get(Calendar.YEAR);	//올해가 몇년인지 알아낸다. 
int lastDayOfMonth = cal.getActualMaxium(Calendar.DATE);	 //이 달의 마지막날 
```	

- 날짜 Field
	- YEAR : 년
	- MONTH : 월(0부터 시작)
	- WEEK_OF_YEAR : 1월 1일부터 (지금) 몇 번째 주
	- WEEK_OF_MONTH : 그 달의 몇 번째 주
	- DATE : 일 
	- DAY_OF_MONTH : 그 달의 몇 번째 일 
	- DAY_OF_YEAR : (1월 1일부터) 그 해의 몇 번째 일 
	- DAY_OF_WEEK : 요일(일요일(1) ~ 토(7))
	- DAY_OF_WEEK_IN_MONTH : 그 달의 몇 번째 요일 
- 시간 Field
	- HOUR : 시간(0~11)
	- HOUR_OF_DAY : 시간(0~23)
	- MINUTE : 분 
	- SECOND : 초 
	- MILLISECOND : 천분의 일초 
	- ZONE_OFFSET : GMT 기준 시차(천분의 일초 단위) 
	- AM_PM : 오전/오후 
	
### set()
-  set()으로 날짜와 시간 설정하기 
```
void set(int field, int value)
void set(int year, int month, int date)
void set(int year, int month, int date, int hourOfDay, int minute)
void set(int year, int month, int date, int hourOfDay, int minute, int second)
```

- 두 날짜간의 차이를 얻으려면, 천분의 일초 단위로 변환하여 계산해야 한다.
```
final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};

Calendar date1 = Calendar.getInstance();
Calendar date2 = Calendar.getInstance();

date1.set(2019, 3, 29);
System.out.println("date1은" + toString(date1) + "월요일이고, ");
System.out.println("오늘(date2)은" + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일 입니다.");

long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000
System.out.println("그 날(date1)부터 지금(date2)까지 " + difference + "초가 지났습니다.");
System.out.println("일(day)로 계산하면" + difference/(24*60*60) + "일 입니다.");
```
	- getTimeInMillis()는 날짜와 시간을 1/1000초로 계산하여 출력한다.
	- `24*60*60` 은 24시간 60분 60초 


### clear()
- clear()는 Calendar 객체의 모든 필드를 초기화 
```
Calendar cal = Calendar.getInstance();
cal.clear();	//1970년 1월 1일 00:00:00 
```
- clear(int field)는 Calendar 객체의 특정 필드를 초기화 
```
Calendar cal = Calendar.getInstance();
cal.clear(Calendar.SECOND);	//초를 초기화 
```
- Calendar를 사용하고 난 뒤에는 계산에 문제가 없도록 clear() 해줘야 한다. 
```
Calendar date1 = Calendar.getInstance();
Calendar date2 = Calendar.getInstance();

System.out.println(date1);
System.out.println(date2);	
```
	- ms때문에 date1과 date2 사이에 약간의 오차가 발생
	- 때문에 ms단위까지 계산할 것이라면 Calendar 객체 생성하고 난 뒤에 clear()를 해줘야 한다

```
Calendar date1 = Calendar.getInstance();
Calendar date2 = Calendar.getInstance();

System.out.println(date1);
System.out.println(date2);

date1.clear();	
date2.clear();
date1.set(2020, 12, 21);
date2.set(2020, 12, 21);
System.out.println(date1);
System.out.println(date2);
```

### add()
- add() 는 특정 필드의 값을 증가 또는 감소(다른 필드에 영향을 준다) 
- 음수 값을 사용할 수 있다.
```
Calendar date = Calendar.getInstance();
date.clear();
date.set(2020, 7, 31);

date.add(Calendar.DATE, +1);
date.add(Calendar.MONTH, -8);

### roll()
- roll()은 특정 필드의 값을 증가 또는 감소(다른 필드에 영향을 주지 않는다)
```
date.set(2020, 7, 31);

date.roll(Calendar.DATE, 1);
date.roll(Calendar.MONTH, -8);

```
```


## Calendar와 Date
- Calendar를 Date로 변환
```
Calendar cal = Calendar.getInstance();
Date d = new Date(cal.getTimeInMillis());
```
- Date를 Calendar로 변환
```
Date d = new Date();
Calendar cal = Calendar.getInstance();
cal.setTime(d);
```

## 형식화 클래스
- java.text 패키지의 DecimalFormat, SimpleDateFormat
- 숫자와 날짜를 원하는 형식으로 쉽게 출력할 수 있다.(DecimalFormat: 숫자, 날짜 ->형식 문자열)
- 형식 문자열에서 숫자와 날짜를 쉽게 출력할 수 있다.(형식 문자열 ->숫자, 날짜)

### DecimalFormat
- 형식 문자열에서 숫자와 날짜를 쉽게 출력할 수 있다.(형식 문자열 ->숫자, 날짜)
```
DecimalFormat df = new DecimalFormat("#,###.##");
Number num = df.parse("1,234,567.89");
double d = num.doubleValue();	//1234567.89
```
- Integer.parseInt()는 콤마(,)가 포함된 문자열을 숫자로 변환하지 못한다.



