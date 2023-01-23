package String;

import Logical_program.if_else_abc;

public class Char_increses_onebyone {
	
	public static void main(String[] args) {
		
		String s1= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			
			if(i<=4)
			{
				System.out.print(s1.charAt(i));
			}
			else if(i>=5 && i<=7)
			{
				System.out.print(s1.charAt(i));
				System.out.print(s1.charAt(i));
			}
			else if(i==8)
			{
				System.out.print(s1.charAt(i));
			}
			else if(i>=9 && i<=13)
			{
				System.out.print(s1.charAt(i));
				System.out.print(s1.charAt(i));
				System.out.print(s1.charAt(i));
			}
			else if(i==14)
			{
				System.out.print(s1.charAt(i));
			}
			else if(i>=15 && i<=19)
			{
				System.out.print(s1.charAt(i));
				System.out.print(s1.charAt(i));
				System.out.print(s1.charAt(i));
				System.out.print(s1.charAt(i));
			}
			else if(i==20)
			{
				System.out.print(s1.charAt(i));
			}
			else if(i>=21 && i<=25)
			{
				System.out.print(s1.charAt(i));
				System.out.print(s1.charAt(i));
				System.out.print(s1.charAt(i));
				System.out.print(s1.charAt(i));
				System.out.print(s1.charAt(i));
			}
			
		}
	}

}
