package leetCode;

import java.util.*;

public class SubsetsII 
{
	public List<List<Integer>> subsetsWithDup(int[] nums) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();

		int n = nums.length;

		for(int i=1; i <=n;i++)
		{
			helper(result,temp,0,i,nums);
		}

		return result;
	}

	private void helper(List<List<Integer>> result, List<Integer> temp, int start, int j, int[] nums) {
		// TODO Auto-generated method stub
		if(temp.size() ==j)
		{
			result.add(temp);
			return;
		}
		
		for(int i=start; i<nums.length; i++)
		{
			temp.add(nums[i]);
			helper(result, temp, start+1, j, nums);
			temp.remove(temp.size()-1);
		}
	}

	
}
