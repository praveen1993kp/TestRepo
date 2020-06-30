package ProgramsPractice;

import org.testng.annotations.Test;

public class swapString_And_ReverseAlternativeWords {
	
	@Test
	
	public static void swaptest()
	
	{
		
		String input = "Swap String And Reverse Alternative Words";
		
		String[] inputSplit = input.split(" ");
		
		String revInput = "";
		
		for(int i=inputSplit.length-1;i>=0;i--)
			
		{
			
			revInput += inputSplit[i] + " ";
			
		}
		
		System.out.println("Reversed Input is " +revInput);
		
		String[] revSplit = revInput.split(" ");
		
		String rev="";
		
		for(int i=0;i<revSplit.length;i++)
			
		{
			
			String currentWord = revSplit[i];
			
			String tempWord = "";
			
			if(i%2==0)
			{
				
				for(int j=currentWord.length()-1;j>=0;j--)
					
				{
				
				tempWord += currentWord.charAt(j);
				
				}
			}
			else
				
			{
				
				tempWord += currentWord;
				
			}
			
			rev += tempWord + " "; 
			
		}
		
		System.out.println(rev);
		
	}

}
