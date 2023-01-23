package array;

public class reversearray {
	public static void main(String[] args) {
		int a[]= {15,20,45,90,110};
		System.out.println(a.length);
		System.out.println("origional array");
		
		for(int i =0;i<a.length;i++)
		{
			System.out.print(a[i]+",");//origional array
		}
		System.out.println();
		System.out.println("Reverse array");
		
		for(int i=4;i>=0;i--)
		{
			System.out.print(a[i]+",");
		}
		
		
	}

}
