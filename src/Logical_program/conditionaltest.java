package Logical_program;

public class conditionaltest {
	public static void main(String[] args) {
		
	int a = 58;
	int b = 98;
	int c = 90;
	
	if(a>b)
	{
		if (a>c)
		{
		     System.out.println("a is largest");
		     System.out.println(a);
		}
		else 
		{
			System.out.println("c is largest");
			System.out.println(c);
		}
	}
	else
	{
		if (b>c)
		{
			System.out.println("b is largest");
			System.out.println(b);
		}
		else
		{
			System.out.println("c is largest");
			System.out.println(c);
			
		}
	}
	
	}
	
	}
	