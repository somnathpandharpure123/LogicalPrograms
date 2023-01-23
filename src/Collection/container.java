package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator.OfDouble;

public class container {
	
	public static void main(String[] args) {
		
		//adding list of city in a container
		
		List<String>city=new ArrayList<String>();
		
		city.add("mumbai");
		city.add("Pune");
		city.add("Latur");
		
		System.out.println(city);
		
		city.remove("mumbai");
		
		System.out.println(city);
		
		city.add("Latur");
		city.add("Latur");
		city.add("Latur");
		
		System.out.println(city);
		
	}

}
