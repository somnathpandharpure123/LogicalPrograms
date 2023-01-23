package Logical_program;

import java.util.Scanner;

public class Addition_Substraction_Multiplication_Dividation_with_ScannerClass {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter Two Integer Values");
		
		int First_Num = scanner.nextInt();
		int Second_Num = scanner.nextInt();
		
		System.out.println("Addition of Two Numbers = "+ (First_Num+Second_Num));
		System.out.println("Substraction of Two Numbers = " + (First_Num-Second_Num));
		System.out.println("Multiplication of Two Numbers = " + (First_Num*Second_Num));
		System.out.println("Dividation of Two Numbers = " + (First_Num/Second_Num));
		System.out.println("Dividation of Two Numbers = " + (First_Num%Second_Num));
	}

}
