package String;

public class Find_vovels_index {
	public static void main(String[] args) {
		//String str = new String("Hi Welcome to my world!");
		
		String str = "Hi Welcome to my world a!";
		
	    for(int i=0; i<str.length(); i++) {
	    	
	      if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| 
	          str.charAt(i) == 'i' || str.charAt(i) == 'o' || 
	          str.charAt(i) == 'u')
	        
	        System.out.println("Given string contains " + 
	            str.charAt(i)+" at the index " + i);
	    }
	}

}
