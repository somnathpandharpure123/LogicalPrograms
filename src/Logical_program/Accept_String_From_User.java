package Logical_program;

import java.util.Scanner;

public class Accept_String_From_User {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any String");
		
		String text	= sc.nextLine();
		
		System.out.println("You Enter a String : " + text);
	}

}
