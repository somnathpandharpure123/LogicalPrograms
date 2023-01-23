package Logical_program;

import java.util.Scanner;

public class Accept_Boolean_from_User {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter true/false");
		
		boolean words =	scanner.nextBoolean();
		
		System.out.println("It is boolean Words : " + words);
	}

}
