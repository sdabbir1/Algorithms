package leetCode;

public class RotatedList 
{

    public boolean search(int[] nums, int target) {
        
        int n = nums.length;
        if(n==0)
        {
            return false;
        }
        
        if(n==1)
        {
            if(nums[0]!= target)
                return false;
            else
                return true;
        }
        int i;
        boolean flag = false;
        for(i=n-1; i >0; i--)
        {
            if(nums[i] < nums[i-1])
            {
                break;
            }
        }
        
        if(i==0)
        {
            for(int k=0; k < n; k++)
            {
                if(nums[k] == target)
                {
                    return true;
                }
            }
        }
        
        if(target > nums[n-1])
        {
            for(int j =0; j <i; j++)
            {
                if(nums[j] == target)
                {
                    return true;
                }
            }
        }
        
        else
        {
            for(int k =i; k <n;k++)
            {
                if(nums[k] == target)
                {
                    return true;
                }
            }
        }
        
        return flag;
    }
}
