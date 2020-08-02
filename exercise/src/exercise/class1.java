package exercise;

public class class1 {
	
	public static void main(String[] args) {
		 printSquareStar(5);
	}
	
	public static void printSquareStar(int number) {
		
		if(number>=5) {
			for(int i=1;i<=number;i++) {
			
					
					System.out.print("*");
			for(int j=2;j<=number;j++) {	
				if(i==1||i==number||j==number||j==i||i==j||j==number-i+1)
				
				System.out.print("*");
				
			else 
				System.out.print(" ");
			}
			System.out.println();
		}}
		else {
			System.out.print("Invalid Value");
		}
	}}