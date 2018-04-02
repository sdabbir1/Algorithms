package leetCode;

import java.util.Arrays;

public class rotateArr 
{

    public int search(int[] nums, int target) {
       int index = 0;
        int i=1;
        
        if(nums.length ==0)
        {
            return -1;
        }
        while(nums[i] > nums[i-1])
        {
            i++;
        }
        
        int pivot = i-1;
        
        int[] t1 = Arrays.copyOfRange(nums, 0, i);
        int[] t2 = Arrays.copyOfRange(nums,i,nums.length);
        
        if(target < nums[0])
        {
            index = searchInd(t2,target);
        }
        else
        {
            index = searchInd(t1,target);
        }
        return index;
    }
    
    public int searchInd(int[] t,int target)
    {
        int i = 0;
        while(t[i] != target && i <= t.length)
        {
            i++;
        }
        
        if(i == t.length)
        {
        	return -1;
        }
        
        
        return i;
    }
}
