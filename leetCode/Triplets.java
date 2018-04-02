package leetCode;
import java.util.*;
public class Triplets 
{

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> finalList = new ArrayList<List<Integer>>();
		Set<String> strings = new TreeSet<String>();
		Arrays.sort(nums);
		//List<Integer> tempList = new ArrayList<Integer>();
		int n = nums.length;
		//int k =0,j=0;
		for(int i=0; i < n-2; i++)
		{
			int j = i+1;
			int k =n-1;

			while(j < k)
			{
				if(nums[i]+nums[j]+nums[k] == 0)
				{
					String str = nums[i]+":"+nums[j]+":"+nums[k];
					if(!strings.contains(str))
					{
						finalList.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
						strings.add(str);
					}

					j++;
					k--;
				}
				else if(nums[i]+nums[j]+nums[k] < 0)
				{
					j++;
				}
				else
					k--;
			}
			
			
			
		}

		return finalList;
		}
}
