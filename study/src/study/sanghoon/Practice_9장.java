package study.sanghoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Practice_9장 {

	/*
	 
	 9-1
	 
	 public boolean equals(Object obj) {
	 
		(1) num, isKwang 매개변수로 넘겨진 객체의 과
		멤버변수 을 비교하도록 오버라이딩 하시오 num, isKwang .
		
		if(!(obj instanceof SutdaCard))
			return false;
		
		SutdaCard v = (SutdaCard)obj;		
	
		return (num == v.num && isKwang == v.isKwang ? true : false);
	 }
	 
	 
	 9-2
	 
	 public boolean equals(Object obj) {
		if(!(obj instanceof Point3D))
			return false;
			
		Point3D v = (Point3D)obj;
		return this.x == v.x && this.y == v.y && this.z == v.z;
		
	 }
	 public String toString() {
		return "[" + this.x +"," + this.y + "," + this.z + "]"; 
	 }
	 
	 9-3	
	 	int pos = fullPath.lastIndexOf("\\");			
		path = fullPath.substring(0,pos);
		fileName = fullPath.substring(pos+1);
		
		
	 9-4
	 	for(int i=0;i<dataArr.length;i++) {
			for(int j = 0 ; j < dataArr[i];j++) {
				System.out.print(ch);
			}
			System.out.println(dataArr[i]);
		}
	
		
	 9-5
	 	while(true) {
			pos = src.indexOf(target);
			src = src.substring(pos+target.length());
			if(pos != -1) {
				count++;
			}else {
				break;
			}
		}
		
		
	 9-6
	 	public static String fillZero(String src, int length) {
		
			if("".equals(src) || src.length() == length) {
				return src;
			}
			
			if(length <= 0) {
				return "";
			}
			
			if(src.length() > length) {
				return src.substring(0,length);
			}
			
			char[] chArr = new char[length];
			
			int pos = src.length()+1;
			
			for(int i=0 ; i < chArr.length;i++) {
				chArr[i] = '0';
			}
			
			for(int i=0 ; i < src.length();i++) {
				chArr[length-(pos-i-1)] = src.charAt(i);
			}
		
			return String.valueOf(chArr);

		}
	
	   
	
	  9-7
	  	return src.indexOf(target)!=-1;
	  	
	  9-8
	  	 double z = Math.pow(10, n);
		 return (double) Math.round(d * z) /  z;
	  
	  9-9
	  	 public static String delChar(String src, String delCh) {
		
			 StringBuffer newStr = new StringBuffer();
			 
			 
			 
			 for(int i=0 ; i<src.length(); i++) {
				 String chkCharater = String.valueOf(src.charAt(i));
				 if(!(delCh.contains(chkCharater))) {//허용되지않는 문자열에 포함되면
					 newStr.append(src.charAt(i));
				 }
			 }
			 return newStr.toString();
		}
	  	
	  9-10
	  	 public static String format(String str, int length,int alignment) {
		
		 	StringBuffer sb = new StringBuffer();
		 
		 
		 	if(length < str.length()) {
			 	return str.substring(0,length);
		 	}else {
			 
				 char[] arrStr = str.toCharArray();
				 char[] arrChar = new char[length];
				 
				 for(int i=0; i<arrChar.length;i++) {
					 arrChar[i] = ' ';
				 }
				 
				 char[] resultChar = new char[length];
				 
				 if(alignment ==0) {
					 System.arraycopy(arrStr,0,resultChar,alignment,arrStr.length);
				 }
				 
				 if(alignment ==1) {
					 System.arraycopy(arrStr,0,resultChar,alignment,arrStr.length);
				 }
				 
				 if(alignment ==2) {
					 System.arraycopy(arrStr,0,resultChar,alignment,arrStr.length);
				 }
				 
				 for(int i=0; i< resultChar.length;i++) {
					 sb.append(resultChar[i]);
				 }
			 
		 	}
		 
		 		return sb.toString();
		  }
		  
		  9-11
		  	public static void main(String[] args) {
				int fromDan =0;
				int toDan =0;
				try {
					 fromDan = Integer.parseInt(args[0]) ;
					 toDan = Integer.parseInt(args[1]) ;
					
					if(!(2 <= fromDan && fromDan <= 9 && 2 <= toDan && toDan <= 9))
						throw new Exception("단의 범위는 2와 9 사이의 값이어야 합니다.");			
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("시작 단과 끝 단 두 개의 정수를 입력해주세요");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				
				for(int i=fromDan;i<=toDan;i++) {
					for(int j=1;j<=9;j++) {
						System.out.println(i+"*"+j+"="+i*j);
					}
						System.out.println();
				}
			}
	
			9-12
			
			
			9-13
			static int stringCount(String src, String key, int pos) {
				int count = 0;
				int index = 0;
				if (key == null || key.length() == 0)
				return 0;
				
				
				
				String ar = src.substring(pos+key.length(),src.length());
				
				while(true) {
					if(src.indexOf(key) != -1) {
						pos = src.indexOf(key);
						src = src.substring(pos+key.length(),src.length());
						count ++;
					}else {
						break;
					}
				}
				
				return count;
			}
				
			9-14
			for(int i=0;i<phoneNumArr.length;i++) {
				
				String rplStr = phoneNumArr[i].replace("-","").trim();
				if(rplStr.contains(input)) {
					list.add(phoneNumArr[i]);
				}
			}	
			
	 
	 
	 */
	
	
	public static void main(String[] args) {
			String[] phoneNumArr = {
					"012-3456-7890",
					"099-2456-7980",
					"088-2346-9870",
					"013-3456-7890"
					};
			
			ArrayList list = new ArrayList();
			Scanner s = new Scanner(System.in);
			while(true) {
					System.out.print(">>");
					String input = s.nextLine().trim();
				if(input.equals("")) {
					continue;
				} else if(input.equalsIgnoreCase("Q")) {
					System.exit(0);
				}


				
			for(int i=0;i<phoneNumArr.length;i++) {
				String rplStr = phoneNumArr[i].replace("-","").trim();
				if(rplStr.contains(input)) {
					list.add(phoneNumArr[i]);
				}
			}	
				
				if(list.size()>0) {
					System.out.println(list);
					list.clear();
				} else {
					System.out.println("일치하는 번호가 없습니다 ."); 
				}
			}
		} // main



}
