package exercise;

import java.util.Scanner;

public class cla {
	public static void main(String[] args) {
int min=0,max=0,f=0;int  number = 0;
		Scanner scanner=new Scanner(System.in);
		while(true) {
		System.out.println("enter the number");
	
		
	
			 boolean lip= scanner.hasNextInt();
			 if(lip==true) {
				   number = scanner.nextInt();
				   if(f==0) {
			 min=number;
			 f++;
				   min=    Math.min( number,min  );
					max=	Math.max(number,max); 
				   }else {min=    Math.min( number,min  );
					max=	Math.max(number,max); 
					   
				   }
				 
			 }
				
			 else {
				 System.out.println("not good number");

				 System.out.println("max"+Math.max(max, number));
					System.out.println("min"+Math.min(min, number));
		
				 
				 
				 break;
				
			 }
			
			
		
		}
scanner.close();
		
	}}