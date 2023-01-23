package String;

public class stringmethod {
	
	public static void main(String[] args) {
		
		String a = "we are getting paid with high package";
		String b = "package";
		
		String c = new String ("package");
		String d = new String ("package"); 
		
		System.out.println(a);
		
		System.out.println(a.endsWith ("paid") );
		System.out.println(a.startsWith("high"));
	
	System.out.println(a.substring(8));
	System.out.println(a.substring(8,12));
	}
	

}
