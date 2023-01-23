package Logical_program;

public class armstrong1 {
	//no is armstrong or not
	
	public static void main(String[] args) {
		int a =1;
		int b =5;
		int c =3;
		
		int d = a*a*a;
		int e = b*b*b;
		int f = c*c*c;
		
		int g = d+e+f;
		
		if(g==153)
		{
			System.out.println("no.is armstrong");
		}
		else
		{
			System.out.println("no is not armstrong");
		}
	}

}
