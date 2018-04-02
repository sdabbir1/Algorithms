package leetCode;

public class Jumper
{

    public boolean canJump(int[] nums) {
        
        boolean flag = false;
        
        int n = nums.length;
        int i = 0;
        while(i<n)
        {
            if(nums[i] ==0 && i !=n-1)
            {
                return false;
            }
            else if(i == n-1)
            {
            	break;
            }
            else
            {
                i = i+nums[i];
            }
            
            
        }
         if(i == n-1)
         {
             flag = true;
         }
        else
        {
            flag = false;
        }
        
        return flag;
    }
}
