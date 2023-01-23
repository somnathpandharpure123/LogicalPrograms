package String;

public class String_Reverse_Each_word {
	
	public static void main(String[] args) {
		
		String str="Tomorrow";
		String a="";
		
		for(int i=0;i<=str.length()-1;i++)
		{
			
			if(str.charAt(i)=='o')
			{
			    a=a+'&';
			
			System.out.print(a);	
			
			}
			
			else
			{
				System.out.print(str.charAt(i));
			}
	}

	}
}
