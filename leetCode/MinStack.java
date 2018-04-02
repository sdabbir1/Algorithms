package Testhere;

import java.util.ArrayList;
import java.util.List;

public class MinStack 
{


    /** initialize your data structure here. */
    List<Integer> stack = new ArrayList<Integer>();
    int min = Integer.MIN_VALUE;
    int count =0;
    public MinStack() {
        
    }
    
    public void push(int x) {
        stack.add(x);
        calculateMin(x);
    }
    
    public void calculateMin(int x)
    {
        if(stack.size() == 1)
        {
            min = x;
        }
        else
        {
            if(x < min)
            {
                min = x;
            }
        }
    }
    
    public void pop() {
        stack.remove(stack.size() -1);
        min =calculateNewMin();
    }
    
    private int calculateNewMin() {
		// TODO Auto-generated method stub
    	int mini = Integer.MAX_VALUE;
		for(int i=0; i<stack.size()-1; i++)
		{
			if(mini > stack.get(i))
				mini = stack.get(i);
		}
		return mini;
	}

	public int top() {
        return stack.get(stack.size() -1);
    }
    
    public int getMin() {
        return calculateNewMin();
    }
}
