package Logical_program;

public class fabonacci {
	// fabonacci number-next number is the addition of previous two number
	//example-0,1,1,2,3,5,8,13,21
	//0+1=1;
	//1+1=2;
	//1+2=3;
	//2+3=5;
	//3+5=8;
	//5+8=13;
	//8+13=21
	
	public static void main(String[] args) {
		int a =0;
		int b =1;
		int c;
		
		for(int i=0;i<=10;i++)
		{
			 c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
		}
	}

}
