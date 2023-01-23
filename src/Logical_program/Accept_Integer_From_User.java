package Logical_program;

import java.util.Scanner;

public class Accept_Integer_From_User {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Next Number");
		
		int number1 = sc.nextInt();
		
	//	System.out.println(number1);
		
		int number2 = sc.nextInt();
		
	//	System.out.println(number2);
		
		System.out.println("Addition of Two Numbers : " + (number1+number2));
		System.out.println("Substraction of Two Numbers : " + (number1-number2));
		
	}

}
