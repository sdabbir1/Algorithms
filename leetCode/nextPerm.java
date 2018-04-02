package leetCode;

import java.util.Arrays;
import java.util.Collections;

public class nextPerm
{

    public void nextPermutation(int[] nums) {
        
        int[] temp = Arrays.copyOfRange(nums, 1, nums.length);
        temp = sorted(temp);
        for(int i=1; i<nums.length; i++)
        {
            nums[i] = temp[i-1];
        }
    }
    
    public int[] sorted(int[] temp)
    {
    	Arrays.sort(temp);
        return temp;
    }
}
