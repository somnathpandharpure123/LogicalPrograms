package Logical_program;

import java.util.Scanner;

public class Mltiplication_Without_Using_Multiply_Scanner {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		
		int a = sc.nextInt();
		
		System.out.println("Enter First Number");

		int b = sc.nextInt();
		
		int sum=0;
		
		for(int i=0;i<b;i++)
		{
			sum=sum + a;
		}
		
		System.out.println("Multiplication of Two Number "+sum);

		
	}

}
