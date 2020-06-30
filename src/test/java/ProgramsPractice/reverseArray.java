package ProgramsPractice;

import org.testng.annotations.Test;

public class reverseArray {
	@Test
	public static void revarray()
	{
		
		
		
		int[] array = {1,2,3,4,5,6,7};
		
		
		
		int length = array.length;
		
		for(int i=0;i<=3;i++)
			
		{
			
			for(int j=length-1;j>0;j--)
				
			{
				
				
				int temp = array[j];
				
				array[j] = array[j-1];
				
				array[j-1] = temp;
				
				
				
			}
		}
		
		for(int i=0;i<length;i++)
			
		{
			
			System.out.println(array[i]);
			
		}
	}

}
