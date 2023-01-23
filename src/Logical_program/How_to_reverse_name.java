package Logical_program;

import java.util.Scanner;

public class How_to_reverse_name {
	
	public static void main(String[] args) {
		
		String name = "Somnath";
		
		for(int i=0;i<name.length();i++)
		{
			
			System.out.print(name.charAt(i));
		}
		System.out.println();
		
		for(int j=name.length()-1;j>=0;j--)
		{
			System.out.print(name.charAt(j));
		}
	}

}
