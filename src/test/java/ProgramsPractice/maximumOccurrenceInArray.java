package ProgramsPractice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class maximumOccurrenceInArray {
	
	@Test
	public static void dupelementsarray()
	{
	
	int[] numarray = {1,1,2,3,4,4,3,2,2};
	

	
	int maxnum[] = new int[numarray.length];
	
	int maxcounter[] = new int[numarray.length];
	
	int num = 1;
	
	int counter = 1;
	
	for(int i=0;i<numarray.length;i++)
	{ 
		
		
		counter = 1;
		
		for(int j=i+1;j<numarray.length;j++)
			
		{
			if(numarray[i]==numarray[j])
			{
				
				counter = counter +1;
				
				num = numarray[i];
				
			}
			
			if(counter>maxcounter[i])
			{
				
				maxcounter[i] =	counter;
				maxnum[i] = num;
			}
			
		}
		
		
		//System.out.println(maxnum[i] +" and its occurrence is " + maxcounter[i] );
		
	}
	
	for(int i = 0;i<maxcounter.length;i++)
		
	{
		
		System.out.println(maxcounter[i]);
	}
	
	
	
	int numval = maxnum[0];
	
	int counval = maxcounter[0];
	
	System.out.println(maxnum.length);
	
	System.out.println(maxcounter.length);
	
	for(int k=0;k<maxnum.length;k++)
		
	{
		
		if(maxcounter[k]>counval)
			
		{
			
			counval = maxcounter[k];
			
			numval = maxnum[k];
			
			System.out.print(numval +" ");
			
		}
		
		else if(maxcounter[k]==counval)
			
		{
			
			counval = maxcounter[k];
			
			numval = maxnum[k];
			
			System.out.print(numval +" ");
			
		}
		
	
		
		
	}
	
System.out.print(  " occurred " + counval + " times ");
	
	System.out.println();
	
	
	}
	


}
