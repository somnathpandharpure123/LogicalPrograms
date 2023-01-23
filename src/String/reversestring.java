package String;

public class reversestring {


public static void main(String[] args) {
	
	String s1 = "Somnath Mahadev Pandharpure";
	
	System.out.println("Given string=====>"+ s1);
	
	String rev="";
	
	int len = s1.length();
	
	for(int i =len-1;i>=0;i--)
	{
		rev=rev+s1.charAt(i);
	}
	
	System.out.println("Reverse String=====>"+ rev);
	
	}	
	
}
