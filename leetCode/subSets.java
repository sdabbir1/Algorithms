package leetCode;

import java.util.ArrayList;
import java.util.List;

public class subSets 
{
	public List<List<Integer>> subsets(int[] nums, int k)
	{
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		ArrayList<Integer> temp = new ArrayList<>();
		result.add(temp);
		if(nums.length ==0 || nums.length < k)
		{
			return result;
		}
		for(int i =1; i <=k; i++)
		{
			dfs(nums,i,0,result,temp);
		}
		
		return result;
	}

	private void dfs(int[] nums, int k, int start, List<List<Integer>> result,List<Integer> temp) {
		// TODO Auto-generated method stub
		
		if(temp.size() == k)
		{
			result.add(new ArrayList<Integer>(temp));
			return;
		}
		
		for(int i = start; i <nums.length;i++)
		{
			temp.add(nums[i]);
			dfs(nums,k,i+1,result,temp);
			temp.remove(temp.size()-1);
		}
	}
}
