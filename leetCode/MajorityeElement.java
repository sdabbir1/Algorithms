package Testhere;
import java.util.*;
public class MajorityeElement 
{

    public int majorityElement(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        int n = nums.length/2;
        
        for(int i=0; i < nums.length; i++)
        {
            if(map.get(nums[i]) != null)
            {
                if(map.get(nums[i]) >= n)
                {
                    return nums[i];
                }
            
                else
                {
                    map.put(nums[i],map.get(nums[i]) + 1);
                }
            }
            
            else
            {
                map.put(nums[i],1);
            }
                
            
        }
        
        return map.get(0);
    }

}
