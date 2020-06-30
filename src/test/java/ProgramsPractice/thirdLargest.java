package ProgramsPractice;

import java.util.Arrays;

import org.testng.annotations.Test;

public class thirdLargest {
	
	@Test
	public static void thirdLartestNumber() {
		
		int[] array = {1,2,2,1};
		
		Arrays.sort(array);
		
		int length = array.length-1;
			
		System.out.println(length);
		
		
		int largest = array[0];
		int secondlargest = array[0];
		int thirdlargest = array[0];
		
		int smallest = array[length];
		int secondsmallest = array[length];
		int thirdsmallest = array[length];
		
		
		for(int i=0;i<array.length;i++)
			
		{
			
			if(array[i]>largest)
				
			{
					thirdlargest = secondlargest;
					secondlargest = largest;
					largest = array[i];	
				
			}
			
			
		}
		
		System.out.print("Largest : " +  largest +";  Second Largest : " + secondlargest + ";  Third Largest : " + thirdlargest);
		
		System.out.println();
		
		for(int j=length;j>=0;j--)
			
		{
			if(array[j]<smallest)
			{
				
				thirdsmallest = secondsmallest;
				secondsmallest = smallest;
				smallest = array[j];
								
			}
		
		}
		
		System.out.print("Smallest : " +  smallest +";  Second Smallest : " + secondsmallest + ";  Third Smallest : " + thirdsmallest);
		System.out.println();
	}
	
	

}
