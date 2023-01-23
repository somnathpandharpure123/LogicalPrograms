package array;

import java.util.Arrays;

public class reverse {
	public static void main(String[] args) {
		int a[]= {12,15,-40,50,100};
		int size = a.length;
		System.out.println(size);
		System.out.println("Origional Array");
		
		for(int i =0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println();
		
		System.out.println("Reverse Array");
		
		
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.print(a[j]+",");
		}
		
		
		
	}

}
