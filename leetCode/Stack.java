package Testhere;

import java.util.ArrayList;
import java.util.List;

public class Stack 
{
	List<Integer> mainStack = new ArrayList<>();
	List<Integer> stdbyStack = new ArrayList<>();
	
	int min = Integer.MIN_VALUE;
	
	public void push(int x)
	{
		mainStack.add(x);
		if(stdbyStack.isEmpty())
		{
			stdbyStack.add(x);
			min = x;
		}
		else
		{
			if(stdbyStack.get(stdbyStack.size() - 1) >= x)
			{
				stdbyStack.add(x);
				min = x;
			}
		}
	}
	
	public void pop()
	{
		if(!mainStack.isEmpty())
		{
			int t = mainStack.get(mainStack.size() - 1);
			mainStack.remove(mainStack.size() - 1);
			
			if(stdbyStack.get(stdbyStack.size() - 1) == t)
			{
				stdbyStack.remove(stdbyStack.size() - 1);
				min = stdbyStack.get(stdbyStack.size() - 1);
			}
		}
	}
	
	public int peek()
	{
		if(!mainStack.isEmpty())
			return mainStack.get(mainStack.size() - 1);
		
		return 0;
	}
	
	public int getMin()
	{
		System.out.println(min);
		return min;
	}
}
