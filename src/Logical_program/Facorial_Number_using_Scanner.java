package Logical_program;

import java.util.Scanner;

public class Facorial_Number_using_Scanner {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any Number");
		
		int Num = scanner.nextInt();
		
		int fact = 1;
		
		for(int i=1;i<=Num;i++)
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
