package array;

public class simplearray {
	public static void main(String[] args) {
		//1.declaration and initilization
		int a[]= {10,45,78,100,49};
		          //OR
		// int []a= {10,45,78,100,49};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		//2.declaration only
		int b[]=new int[a.length];
		int lastindex=(a.length-1);
		for(int i=0;i<a.length;i++)
		{
		b[i]=a[lastindex-i];
		//OR b[i]=a[(a.length-1)-i];
		
		
		}
		a=b;
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		
	}
	

}
