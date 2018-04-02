package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthPerm
{

    public String getPermutation(int n, int k) {
        int counter = 1;
        int[] nums = new int[n];
        for(int i =0; i < n ; i++)
        {
            nums[i] = counter;
            counter++;
        }
        
        List<String> result = new ArrayList<String>();
        
        permute(nums,0,result);
        
        Collections.sort(result);
        
               
        String res = result.get(k-1);
        
        return res;
    }
        public void permute(int[] nums, int start, List<String> result)
        {
            if(start == nums.length)
            {
                String tem = convertAtoS(nums);
                result.add(tem);
            }
            
            for(int i =start; i < nums.length; i++)
            {
                swap(nums,start,i);
                permute(nums,start+1,result);
                swap(nums,start,i);
            }
        }
        
        public String convertAtoS(int[]nums)
        {
            String t ="";
            for(int k =0; k<nums.length; k++)
            {
                t = t+nums[k];
            }
            return t;
        }
        
        public void swap(int[] nums, int i , int j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        
       
   
}
