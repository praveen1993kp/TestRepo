package ProgramsPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class hash {

	@Test
	public static void hashtest2()
	
	
	{
	 
		String[] array = {"a","b","c","b","c","b"};
		
		
		
	        String highestRepeatingElement = "";
	        
	        int maxFrequency = 1;
	        
	        HashMap<String, Integer> freqMap = new HashMap<String, Integer>();
	 
	        for (int i = 0; i < array.length; i++) {
	 
	            if (freqMap.containsKey(array[i])) {
         
	                freqMap.put(array[i], 1+ freqMap.get(array[i]));
	                
	                System.out.println(freqMap);
               
	            }
	        
	        else 
	        	
	           {
	                freqMap.put(array[i], 1);
	                
	           }
	            	
	            
	           
	           
	        }
	        
	        for (Entry<String, Integer> entry : freqMap.entrySet()) 
	        	
	        {
	        	
	        	System.out.print(entry.getKey() + entry.getValue());
	        }
	        	
	        	
//	        System.out.print(highestRepeatingElement + " ");
//	        
//	        System.out.print(" repeating times "+ maxFrequency);
	        
	        System.out.println();
	
	        System.out.println("frequency table: " + freqMap);
	       
	        
	        
	}

}
