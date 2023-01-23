package array;

public class copyofarray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		
		int b[] = a;
		
		for(int c:b)
		{
			System.out.print(c+",");
		}
		System.out.println();
		
		a[2]=0;
		
		for(int c:b)
		{
			System.out.print(c+",");
		}
		
		
	}
}
