package leetCode;

public class hayStack 
{

    public int strStr(String haystack, String needle) {
        int j =0;
        int h = haystack.length();
        int n = needle.length();
       boolean temp = false;
        for(int i=0; i<h-n; i++)
        {
            
            j = i+n;
            temp = check(haystack.substring(i,j),needle);
            if(temp)
            {
                return i;
            }
        }
        
        return -1;
    }
    
    public boolean check(String s, String n)
    {
        if(s.equals(n))
        {
            return true;
        }   
        
        else
        {
            return false;
        }
        
    }
}
