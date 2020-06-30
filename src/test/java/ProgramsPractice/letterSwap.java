package ProgramsPractice;

import org.testng.annotations.Test;

public class letterSwap 

	{
	
	@Test
	
	public static void testmethod()
	
	{
	
	String name = "My name is Praveen";
		
	String[] splitnam = name.split(" ");
	
	String rev1 = "";
	
	
	
	String[] splitname = new String[splitnam.length];
	
	for(int i =splitnam.length-1;i>=0;i--)
	{
	
		rev1 = rev1 +  splitnam[i] + " ";
			
	}
	
	System.out.println("a");
	
	System.out.print(rev1);

	splitname = rev1.split(" ");
	
	System.out.println();
	
	String test = "";
	
	for(int j=0;j<splitname.length;j++)
		
	{
		
		String currstr = splitname[j];
		
		System.out.println(currstr);
		
		String revstr = "";
		
		if(j%2==0)
		{
		for(int k=currstr.length()-1;k>=0;k--)
			{
			
				revstr = revstr + currstr.charAt(k);
			
			}
				
		}
		
		else
			
		{
			
			revstr = revstr + currstr;
			
		}
	
		test +=  revstr + " ";
		
	}

	System.out.println(test);
}
	
	
	
	}