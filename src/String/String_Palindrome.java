package String;

public class String_Palindrome {
	
	public static void main(String[] args) {
		
		String s = "dabcba";
		
		String rev = "";
		
		
		System.out.println("=========Reverse String=============");
		
		for(int j=s.length()-1;j>=0;j--)
		{
			rev=rev+s.charAt(j);
		}
		System.out.println(rev);
		
		if(s.equals(rev))
		{
			System.out.println("Given String is Palindrome");
		}
		else 
			{
			System.out.println("Given String is Palindrome");
			}
		
	}

}
