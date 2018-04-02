package leetCode;

public class InterleavingStr
{

    public boolean isInterleave(String s1, String s2, String s3) {
        boolean flag = true;
        for(int i=0; i<s3.length();i++)
        {
            if(s1.length()!=0 && s3.charAt(i) == s1.charAt(0))
            {
                s1 = s1.substring(1);
            }
            
            else if(s2.length()!=0 && s3.charAt(i) == s2.charAt(0))
            {
                s2 = s2.substring(1);
            }
            
            else
            {
                return false;
            }
        }
        
        return flag;
    }
}
