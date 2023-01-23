
package Logical_program;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Time {
	
	public static void main(String[] args) {
		
		//How to handle System Date & Time
		DateFormat x=new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
		
		Date y = new Date();
		
		String SystemDateTime=x.format(y);
		
		System.out.println("System Date Time="+SystemDateTime);
	}

}
