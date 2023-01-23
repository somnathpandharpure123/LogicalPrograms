package array;

public class sumofarray {
	
	public static void main(String[] args) {
		
		int a[]= {-20,25,12,10,40,48,90};
		
		double Avarage;
		
		double sum=0;
		
		int len=a.length;
		
		System.out.println("Size of ARRAY = "+len);
		
		for(int i=0;i<len;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of all number of Array = "+sum);
		
		Avarage =sum/len;
		
		System.out.println("Avarage Value of array = "+Avarage);
	}

}
