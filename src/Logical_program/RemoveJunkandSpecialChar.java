package Logical_program;

public class RemoveJunkandSpecialChar {

	public static void main(String[] args) {

		String x = "Somnath Mahadev123@$%! Pandharpure";
		
		String data = x.replaceAll("[^a-zA-Z0-9]", " ");
	
		System.out.println(data);
		
		
		
	}

}
