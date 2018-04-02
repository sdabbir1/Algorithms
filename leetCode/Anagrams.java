package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams 
{

    Map<Character,Integer> dict = new HashMap<Character,Integer>();
    Map<Integer,List<String>> anagram = new HashMap<Integer,List<String>>();
    List<List<String>> result = new ArrayList<List<String>>();
    public List<List<String>> groupAnagrams(String[] strs) {
        dict.put('a',2);
        dict.put('b',3);
        dict.put('c',5);
        dict.put('d',7);
        dict.put('e',11);
        dict.put('f',13);
        dict.put('g',17);
        dict.put('h',19);
        dict.put('i',23);
        dict.put('j',29);
        dict.put('k',31);
        dict.put('l',37);
        dict.put('m',41);
        dict.put('n',43);
        dict.put('o',47);
        dict.put('p',53);
        dict.put('q',59);
        dict.put('r',61);
        dict.put('s',67);
        dict.put('t',71);
        dict.put('u',73);
        dict.put('v',79);
        dict.put('w',83);
        dict.put('x',89);
        dict.put('y',93);
        dict.put('z',97);
        
        for(int i =0; i<strs.length; i++)
        {
            int temp =calculateHashVal(strs[i]);
            if(anagram.containsKey(temp))
            {
            	anagram.get(temp).add(strs[i]);
            }
            else
            {
            	List<String> t = new ArrayList<>();
            	t.add(strs[i]);
            	anagram.put(temp, t);
            }
        }
        
        for(Map.Entry<Integer,List<String>> entry : anagram.entrySet())
        {
            result.add(entry.getValue());
        }
        
        return result;
        
    }
    
    public int calculateHashVal(String s)
    {
        int value = 1;
        for(int i =0 ; i<s.length(); i++)
        {
            value*= dict.get(s.charAt(i));
        }
        
        return value;
    }
}
