package String;

import Logical_program.if_else_abc;

public class String_Numbers {
	
	public static void main(String[] args) {
		
		String name = "Somnath88My &$%L oNG59";
		
		int c;
		int UpperCase_Char=0;
		int LowerCase_Char =0;
		int Number_Count =0;
		int space=0;
		int charactor =0;
		
		int size = name.length();
		
		System.out.println("Size of String = "+size);
		
		for(int i=0;i<size;i++)
		{
			 c=name.charAt(i);
			 
			 if(c>='A' && c<='Z')
				 UpperCase_Char++;
			 else if(c>='a' && c<='z')
				 LowerCase_Char++;
			 else if(c>='0' && c<='9')
				 Number_Count++;
			 else if(c==' ')
				 space++;
			 else {
				charactor++;
			}
		}
		System.out.println("UpperCase_Char = "+UpperCase_Char++);
		System.out.println("LowerCase_Char = "+LowerCase_Char++);
		System.out.println("Number_Count = "+Number_Count++);
		System.out.println("Space = "+space++);
		System.out.println("charactor = "+charactor++);

	}

}
