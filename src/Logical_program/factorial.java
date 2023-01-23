package Logical_program;

public class factorial {
	public static void main(String[] args) {
		int a =1;
		int b =4;
		
		for(int i=1;i<=b;i++)
		{
			
			a = a*i;// a is the previous value of factorial which can be incremental
			System.out.print(a);//for 1 to 10 no.
		}
		System.out.println();
		System.out.println(a);//for single no.
	}

}
