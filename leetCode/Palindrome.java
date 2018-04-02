package Testhere;

public class Palindrome
{

    public String longestPalindrome(String s) 
    {
        int n = s.length();
        int ans=0;
        String res="";
        if(n ==0)
        {
            return "";
        }
        else if(n ==1)
        {
            return s;
        }
        else
        {
            for(int i=0; i< n ; i++)
        {
            for(int j=i; j<n; j++)
            {
                if(checkPalindrome(s,i,j))
                {
                    String tem =fetchString(s,i,j);
                    ans = Math.max(ans,j-i+1);
                    if(tem.length() >= ans)
                    {
                        res = tem;
                    }
                }
            }
        }
        }
        
        
            return res;
        
        
    }
     public boolean checkPalindrome(String s, int st, int end)
     {
         String temp = s.substring(st,end+1);
        int n = temp.length();
         for(int i =0; i < n/2 ; i++)
         {
             if(temp.charAt(i) != temp.charAt(n-i -1))
             {
                 return false;
             }
         }
         
         return true;
     }
    
    public String fetchString(String s, int st, int end)
    {
        String t = s.substring(st, end+1);
        return t;
    }
}
