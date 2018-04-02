package Testhere;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RomanToInt 
{

    public int romanToInt(String s) {
         Map<String,Integer> dict = new HashMap<String,Integer>();
         List<Integer> finalList = new ArrayList<Integer>();	
        dict.put("I",1);
        dict.put("V",5);
        dict.put("X",10);
        dict.put("L",50);
        dict.put("C",100);
        dict.put("D",500);
        dict.put("M",1000);
        String[] roman = s.split("");
        int j =0;
        int res=0;
       
        /*if(s.equals(""))
        {
        	return 0;
        }
        else
        {*/
        	for(int i =0; i < roman.length; i++)
            {
            	j = i+1;
                 if(j != roman.length)
                 {
                	 
                     if(dict.get(roman[i]) < dict.get(roman[j]))
                     {
                         res += (dict.get(roman[j]) - dict.get(roman[i]));
                             i = j;
                     }
                     else
                     {
                         res+=dict.get(roman[i]);
                     }
                 }
                 else{
                	 res = res+dict.get(roman[roman.length-1]);
                 }
                    
                
            }
            
        	
            
        //}
        
        
        return res;
    }
}
