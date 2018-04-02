package Testhere;

public class RotateArray 
{

    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        
        if(n ==0)
        {
            return;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i < n; i++)
        {
            sb.append(String.valueOf(nums[i]));
        }
        
        while(k >= 0)
        {
            char t = sb.charAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
            sb.insert(0,Character.toString(t));
        }
        
        for(int i=0; i < n; i++)
        {
            nums[i] = sb.charAt(i) - '0';
        }
        
    }
}
