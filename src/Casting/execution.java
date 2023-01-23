package Casting;

public class execution {

	public static void main(String[] args) {
		
		dadar d = new dadar();
		d.test();
		
		thane t = new thane();
		t.test();
		
		dadar x = new thane();//up casting object-sub class property should be UpCast in superclass
		x.test(); 
		
		thane y = (thane) new dadar();//down casting-object can not be execute in down casting so thats why it is shown error
		y.test();
		
		
	}
}
