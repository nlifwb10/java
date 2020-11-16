package java_04_조건문_반복문;

public class Practice {

	/*
	4-1

		 1. 10 < x && x < 20
		
		 2.
		
		 3. ch =='x' || ch =='X'
		
		 4. '0' <= ch && ch <='9'
		
		 5.  
		
		 6. 
		
		 7. powerOn == false
		
		 8. 

 

	4-2   

        int sum=0;

        for(int i=1;i<=20;i++){          

            if(i%2!=0||i%3!=0){

                sum += i;

            }

        }
      
        System.out.println(sum);

      	답  =>  174

	4-3

        int sum =0;

        int t_sum =0;

        for(int i=1;i<11;i++){

            sum +=i;        

            t_sum += sum;

        }

        System.out.println(t_sum);

    	답 : 220

 

	4-4
		답 :
        int i =1;        

        int booho =1;        

        int sum =0;

        while(true){                                          
        
            sum += i*booho;

            System.out.println(sum+"="+i+"*"+booho);

            if(sum >= 100)

            	break;

            i++;

            booho = booho*-1;

        }

       System.out.println(i);

       System.out.println(sum);

		=> 답 : 199

 

	4-5 
		답	
			int i = 0;

			while (i<=10){
		
				int j = 0;
		
				while(j<=i){
		
					System.out.print("*");				
		
					j++;
		
				}
		
			  System.out.println();
		
			   i++;
		
			}

 

	4-6		
		답 : 		
		for(int i =1;i<=6;i++){
		
		  for(int j=1;j<=6;j++){
		
		   if( i+j == 6){
		
			System.out.println(i+"+"+j+"=6");
		
		   }
		
		 }
		
		}

 

 

	4-7

 	답 : (int)(Math.random()*6)+1

 

	4-8
	답 :
	int x=0;

	for( x=0;x<=10;x++){

		for(int y=0;y<=10;y++){

			if((2*x)+(4*y)==10){

				System.out.println("x="+x+","+"y="+y);

			}

		}

	}

	4-9
	답 :
    String str = "12345";

	int sum = 0;

	for(int i=0; i < str.length();i++){

		sum += str.charAt(i)-'0';

	}

	System.out.println(sum);

	4-10
		답 :
		int str = 12345;		
	
		int sum = 0;

		while(true){
	
			if(str ==0)
	
			  break;
	
			sum += str%10;
	
			str = str/10;

		}

 

	4-11

 

 

 

	4-12
		답 :
		for(int i=2;i<= 9;i++){
	
			for(int j =1;j<=3;j++){
	
				System.out.println(i+"*"+j+"="+i*j);
	
			}
	
		}

 

	4-13
		답 :
		ch = value.charAt(i);
		if(!(0 <=(int)ch && (int)ch <=57)) {
			isNumber = false;
			break;
		}
	
	4-14
		답:
		if(input < answer) {
			System.out.println("더 큰수를 입력하세요");					
		}else if(input > answer) {
			System.out.println("더 작은 수를 입력하세요");
		}else {
			System.out.println("맞췄습니다.");
			System.out.println("시도횟수는"+count+"입니다");
			break;
		}
	
	4-15
		답:
			int a = 0;
			String stmp = "";
			while(tmp !=0) {				
				a = tmp%10;
				stmp += Integer.toString(a);				
				result = tmp%10;				
				tmp = tmp/10;							
			}
			
			result = Integer.parseInt(stmp);
 
	 */
	
	public static void main(String[] args) {
		
		
	}
		

}
