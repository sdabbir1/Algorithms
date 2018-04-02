package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Decimals 
{

    public String fractionToDecimal(int num, int den) {
        
       if(num ==0)
       {
           return "0";
       }
        
        if(den ==0)
        {
            return "";
        }
        
        String result = "";
        
        if((num <0) ^ (den < 0))
        {
            result +="-";
        }
        
        long res = Math.abs(num)/Math.abs(den);
        
        result += String.valueOf(res);
        
        long rem = (Math.abs(num)/Math.abs(den)) * 10;
        
        if(rem ==0)
            return result;
        
        Map<Long,Integer> temp = new HashMap<Long,Integer>();
        result += ".";
        while(rem !=0)
        {
            if(temp.containsKey(rem))
            {
                int beg = temp.get(rem);
                String p1 = result.substring(0,beg);
                String p2 = result.substring(beg,result.length());
                result = p1 + "(" + p2 + ")";
                return result;
            }
            
            temp.put(rem,result.length());
            res = rem / Math.abs(den);
		    result += String.valueOf(res);
		    rem = (rem % Math.abs(den)) * 10;
        }

        return result;
        
    }
    
   
}
