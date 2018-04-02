package leetCode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis
{

	public List<String> generateParenthesis(int n) 
	{
		List<String> ans = new ArrayList<String>();
		int count =backTrack(ans,"",0,0,n);
		System.out.println(ans.size());
		return ans;
	}

	public int backTrack(List<String> ans, String cur, int open, int close, int max)
	{
		int count =0;
		if(cur.length() == 2* max)
		{
			count++;
			ans.add(cur);
		}

		if(open < max)
		{
			backTrack(ans,cur+"(",open+1,close,max);
		}
		if(close < open)
		{
			backTrack(ans,cur+")", open,close+1,max);
		}
		return count;
	}
}
