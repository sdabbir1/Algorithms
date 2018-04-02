package leetCode;

import java.util.*;

public class ValidNum 
{

	public boolean isNumber(String s) {

		List<String> dict = new ArrayList<String>();
		int count =0;
		boolean flag = true;
		for(int i=0; i<10; i++)
		{
			dict.add(Integer.toString(i));
		}
		dict.add(".");
		int n = s.length();

		for(int j =0; j<n; j++)
		{
			if(!dict.contains(Character.toString(s.charAt(j))))
			{
				return false;
			}

			if(s.charAt(j) == '.')
			{
				if(count ==1)
				{
					return false;
				}
				count++;
			}
		}



		return flag;        
	}
}
