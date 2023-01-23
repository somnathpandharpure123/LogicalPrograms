
package Logical_program;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		
		System.out.println("Enter Year");
		
		Scanner Sc = new Scanner(System.in);
		
		int year = Sc.nextInt();
		
		if(year%4==0)
		{
			System.out.println("This is Leap Year");
		}
		else
		{
			System.out.println("This is not Leap Year");
		}
		
		

	}

}
