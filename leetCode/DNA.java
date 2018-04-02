package Testhere;

import java.util.HashMap;
import java.util.List;
import java.util.*;

public class DNA 
{

    public List<String> findRepeatedDnaSequences(String s) {
        
        Map<String,Integer> map = new HashMap<String,Integer>();
        List<String> res = new ArrayList<>();
        int n = s.length();
        
        if(n < 10)
        {
            return res;
        }
        
        for(int i = 0; i <= n-10; i++)
        {
            if(map.get(s.substring(i, i+10)) == null)
            {
                map.put(s.substring(i, i+10), 1);
            }
            else
            {
                if(map.get(s.substring(i, i+10)) == 1)
                {
                    res.add(s.substring(i, i+10));
                }
                else
                {
                    map.put(s.substring(i, i+10), map.get(s.substring(i, i+10)) + 1);
                }
            }
        }
        
        return res;
    }
}
