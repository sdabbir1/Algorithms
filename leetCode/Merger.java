package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Merger {

    public List<Interval> merge(List<Interval> intervals) 
    {
    	int n = intervals.size();
    	List<Interval> result = new ArrayList<>();
    	Collections.sort(intervals, new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				// TODO Auto-generated method stub
				if(o1.start != o2.start)
					return o1.start-o2.start;
				else
					return o1.end - o2.end;
				
			}
    		
		});
    	
    	Interval pre = intervals.get(0);
    	for(int i =0; i < n; i++)
    	{
    		Interval curr = intervals.get(i);
    		if(curr.start > pre.end)
    		{
    			result.add(pre);
    			pre = curr;
    		}
    		else
    		{
    			Interval merge = (new Interval(pre.start, Math.max(pre.end, curr.end)));
    			pre = merge;
    		}
    	}
    	result.add(pre);
    	return result;
    }
}
