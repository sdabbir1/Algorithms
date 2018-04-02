package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FourSum
{

	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> finalList  = new ArrayList<List<Integer>>();
		List<Integer> tempList = new ArrayList<Integer>();
		Set<String> strings = new TreeSet<String>();
		Arrays.sort(nums);
		int n = nums.length;
		for(int i=0; i < n-3; i++)
		{
			for(int j =i+1; j<n-2; j++)
			{
				int k = j+1;
				int l = n - 1;
				
				while(k < l)
				{
					int tempRes = nums[i] + nums[j] + nums[k] + nums[l] ;
					if(tempRes == target)
					{

						String str = nums[i] +":"+nums[j]+":"+nums[k]+":" + nums[l];
						if(!strings.contains(str))
						{
							finalList.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k],nums[l])));
							strings.add(str);
						}
						k++;
						l--;

					}
					else if( tempRes < target)
					{
						k++;
					}
					else
						l--;
				}

			}
		}
		return finalList;
	}
}
