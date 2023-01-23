package String;

import java.awt.Frame;

import Logical_program.if_else_abc;

public class String_Contain_vowels {
	
	public static void main(String[] args) {
		
		String name="Somnath Mahadev Pandharpure";
		
		//String contain the Vovels or not 
		
		if(name.contains("a")||name.contains("e")||name.contains("i")||name.contains("o")||name.contains("u"))
		{
			System.out.println("Vovel is present");
			
		}
		else {
			
			System.out.println("Vovel is not present");

			}
		
		//String contain the how many vovels
		
		int count=0;
		
		int size=name.length();
		System.out.println("Size of Given String======>" + size);
		
		char s[]=name.toCharArray();
		
		for(char vovel:s)
		{
			switch (vovel) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				
				count++;
				//break;
			}
		}
		System.out.println("Number of vovels present in Given String ======>"+ count);
		
	}

}
