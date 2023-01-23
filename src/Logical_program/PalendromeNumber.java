package Logical_program;

import java.util.Scanner;

public class PalendromeNumber {
	
	public static void main(String[] args) {
		
		int OrigionalNumber,num,sum,remainder;
		   
		System.out.println("Enter one Number");
		
		Scanner sc = new Scanner(System.in);
		  num =sc.nextInt();
		 
		 OrigionalNumber = num;
		 
		 for(sum=0;num>0;num=num/10)
		 {
			 remainder=num%10;
			 sum=sum*10+remainder;
		 }
		 
		 if(sum==OrigionalNumber)
		 {
			 System.out.println(OrigionalNumber +": Palindrome Number");
		 }
		 else
		 {
			 System.out.println(OrigionalNumber +": not Palindrome Number");
		 }
		 
	}

}