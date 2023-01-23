package String;

import java.util.Arrays;

public class sortstring {
	
	public static void main(String[] args) {
		
		String s="010011010110";
		
		char[] ch=s.toCharArray();
		
		Arrays.sort(ch);
		
		System.out.print(ch);
		
	}

}
