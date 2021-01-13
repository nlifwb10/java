package study.sanghoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Practice_11장 {
	
	
	/*
		11-1
			//교집합
			Iterator it1 = list1.iterator();
			
			while(it1.hasNext()) {
				int number = (int) it1.next();
				if(list2.contains(number)) {
					kyo.add(number);
				}
			}
	
			//차집합
			it1 = list1.iterator();
			
			while(it1.hasNext()) {
				int number = (int) it1.next();
				if(!(list2.contains(number))) {
					cha.add(number); 
				}
			}
			
			//합집합
			it1 = list1.iterator();
			Iterator it2 = list2.iterator();
			HashSet set = new HashSet();
			
			while(it1.hasNext()) { 
				set.add(it1.next());
			}
			while(it2.hasNext()) {
				set.add(it2.next());
			}
			//set으로 중복제거후 list에 넣음
			hap.addAll(set);
			
		11-2
		
			3 6 2 2 2 7
			3 6 2 7 
			2 3 6 7 
			답 : 7 6 3 2
			
		11-3
			d
		
		11-4
			6번째(가운대요소)
		
			
		11-5 -> (해설참조)
		public int compareTo(Object o) {
			if(o instanceof Student) {
				Student tmp = (Student)o;
				return name.compareTo(tmp.name); // String compareTo() 클래스의 를 호출
			} else {
				return -1;
			}
		}	
		
		11-6 
			?
		
		11-7
			public int compare(Object o1, Object o2) {
				if(o1 instanceof Student && o2 instanceof Student) {
					Student s1 = (Student)o1;
					Student s2 = (Student)o2;
					int result = s1.ban - s2.ban; 
					
					if(result ==0) {//반이 같을시, 번호비교
						return s1.no - s2.no; //음수나올시 오른쪽이 더큼
											  //양수나올시 왼쪽이더큼
					}
					return result;
				}
				
				return 100;
			}
			
		 11-8
		 	/
			(2) . 아래의 로직에 맞게 코드를 작성하시오
			1. list Student . 반복문을 이용해서 에 저장된 객체를 하나씩 읽는다
			1.1 (total) (prevTotal) 총점 이 이전총점 과 같으면
			이전 등수 를 등수 로 한다 (prevRank) (schoolRank) .
			1.2 , 총점이 서로 다르면
			등수 의 값을 알맞게 계산해서 저장한다 (schoolRank) .
			이전에 동점자 였다면 그 다음 등수는 동점자의 수를 고려해야 한다 , .
			( ) 실행결과 참고
			1.3 (prevTotal) (prevRank) 현재 총점과 등수를 이전총점 과 이전등수 에
			저장한다.
			/
			for(int i=0 ; i< list.size() ;i ++) {
				Student st = (Student) list.get(i);
				if(st.total == prevTotal) {
					st.schoolRank = prevRank;
				}else {
					st.schoolRank = i + 1 ;
				}
				prevRank = st.schoolRank;
				prevTotal = st.total;
			}
			
			public int compareTo(Object o) {
				if(o instanceof Student) {
					Student tmp = (Student)o;
					return tmp.total - this.total;
				} else {
					return -1;
				}
			}
			
		 11-9
		 public int compare(Object o1, Object o2) {
				int result =0;
				if(o1 instanceof Student && o2 instanceof Student) {
					Student st1 = (Student)o1;
					Student st2 = (Student)o2;
					result = st1.ban - st2.ban;
					
					if(result == 0) { // 같을시
						result = st2.total - st1.total; 
					}
				}
				
				return result;
			}
			
			// 해설 참고함
			for(int i=0, n=0 ; i < list.size() ; i ++ ,n++) {
				Student st = (Student)list.get(i);
				if(st.ban != prevBan) {
					prevRank = -1;
					prevTotal = -1;
					n=0;
				}
				
				if(st.total == prevTotal) {
					st.classRank = prevRank;
					
				}else {
					st.classRank = n + 1;
				}
				prevBan = st.ban;
				prevRank = st.classRank;
				prevTotal = st.total;
				
			}
		 
		 11-10
		 	Set은 중복허용안해서?
		 	ArrayList list = new ArrayList(set);
			Collections.shuffle(list); // 섞이는
			Iterator it = list.iterator()
			
		 11-11
		 	@Override
			public int hashCode() {
				return Objects.hash(num,isKwang);
			}
			
		  11-12
		  	jokbo.put("KK", 4000);
			jokbo.put("1010",3100);
			jokbo.put("99", 3090);
			jokbo.put("88", 3080);
			jokbo.put("77", 3070);
			jokbo.put("66", 3060);
			jokbo.put("55", 3050);
			jokbo.put("44", 3040);
			jokbo.put("33", 3030);
			jokbo.put("22", 3020);
			jokbo.put("11", 3010);
			jokbo.put("12", 2060);
			jokbo.put("21", 2060);
			jokbo.put("14", 2050);
			jokbo.put("41", 2050);
			jokbo.put("19", 2040);
			jokbo.put("91", 2040);
			jokbo.put("110", 2030);
			jokbo.put("101", 2030);
			jokbo.put("104", 2020);
			jokbo.put("410", 2020);
			jokbo.put("46", 2010);
			jokbo.put("64", 2010);
		  	
		  	if(c1.isKwang && c2.isKwang) {
			result = (Integer)jokbo.get("KK");
			} else {
				//아래 해설 참조
				result = (Integer)jokbo.get(""+c1.num+c2.num);
				
				if(result==null) {
					result = new Integer((c1.num + c2.num) % 10 + 1000);
				}
			}
	
			p.point = result.intValue();
			
		  11-13
		  
		  
		  11-14
		  	
		  
	 */

	public static void main(String[] args) {
		
		
	}
}
	