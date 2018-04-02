package Testhere;

import java.lang.reflect.Array;
import java.util.Arrays;


public class subsequence 
{
	int[] dict = new int[10];
	int[] res = new int[]{0,0};

	public int[] generateSequence(String s)
	{
		Arrays.fill(dict,-1);
		String[] chars = s.split("");
		for (int i = 0; i < chars.length; i++) 
		{
			for (int j = i-1; j >= 0; j--) 
			{
				if(chars[i].equals(chars[j] ))
				{
					dict[i] =j;
					break;
				}
			}
		}
		return dict;
	}

	public int[] generateSubSequence(int[] indexes)
	{
		int[] stend = new int[2];
		int i = -1;
		for(int j=0;j<indexes.length; j++)
		{
			if(i <= indexes[j] && indexes[j] !=-1)
			{
				if(i == -1)
				{
					stend[0]=0;
				}
				else
				{
					stend[0] = i;
				}
				stend[1]=j;
				int t1 =stend[1]-stend[0];
				int t2 = res[1]-res[0];
				if(t1> t2)
				{
					res[0] = stend[0];
					res[1] = stend[1];
				}
				i = indexes[j]+1;
				
			}
		}
		return res;
	}
}
