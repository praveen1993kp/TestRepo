package ProgramsPractice;

import org.testng.annotations.Test;

public class maxArray2 {
	
	@Test
	public static void maxarray()
	{
		
		int[] array = {1,2,3,4,4,3,2,2};
		
		int maxcount[] = new int[array.length];
		
		int maxnum[] = new int[array.length];
		
		int counter = 1;
		
		int num = 1;
		
		for(int i=0;i<array.length;i++)
		{
			
			counter = 1;
			
			for(int j=i+1;j<array.length;j++)
			{
				
				if(array[i]==array[j])
				{
					
					counter = counter +1;
					num = array[i];
					
				}
				
				if(counter>maxcount[i])
				{
					maxcount[i] = counter;
					maxnum[i] = num;
					
				}
				
			}
			
			
		}
		
		for(int i = 0;i<maxcount.length;i++)
			
		{
			
			System.out.println(maxcount[i]);
		}
		
		int countnum = maxcount[0];
		int numnum = maxnum[0];
		
		System.out.println( "a " + maxcount.length);
		
		System.out.println(maxnum.length);
		
		for(int j=0;j<maxnum.length;j++)
		{
			if(maxcount[j]>=countnum)
			{
				countnum = maxcount[j];
				
				numnum = maxnum[j];
				
				System.out.print(numnum + " ");
			
			}
			
			
			
			
		}
		
		System.out.print(" occurs " + countnum + " times");
		
		System.out.println();
	}

}
