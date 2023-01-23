package String;

public class RemoveJunkandSpecialChar {
	
	public static void main(String[] args) {
		
		String s1 = "Java Python1*%# Automation_$@";
		
		String s = s1.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		
	}

}
