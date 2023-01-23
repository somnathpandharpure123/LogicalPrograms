package array;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class multidim {
	public static void main(String[] args) {
	
	String arr[][]= {{"Sr.No.","1","2","3","4"},{"Country Name","India","US","UK","Pak"}};
	
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.print(arr[j][i]);
		}
		System.out.println();
	}
	
	
	}

}
