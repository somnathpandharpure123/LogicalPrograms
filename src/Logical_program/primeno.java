package Logical_program;

import java.util.Scanner;

public class primeno {
	
	
	public static void main(String[] args) {
		int i,count=0;
		 System.out.println("Enter any Number");
		 
		 Scanner sc = new Scanner(System.in);
		 int num =sc.nextInt();
		 
		 
		 for( i =2;i<num;i++) {
			 if(num%i==0)  
				 break;
		 }
		 if(i==num) {
			 System.out.println("It is Prime No.");
		 }
		 else {
			 System.out.println("It is not Prime No.");
		 }
	}

}
