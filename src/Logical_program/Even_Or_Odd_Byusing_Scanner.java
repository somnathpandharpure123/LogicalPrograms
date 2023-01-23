package Logical_program;

import java.util.Scanner;

public class Even_Or_Odd_Byusing_Scanner {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any Number");
		
		int num = scanner.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Given no is Even");
		}
		else {
			System.out.println("Given no is odd");
		}
	}

}
