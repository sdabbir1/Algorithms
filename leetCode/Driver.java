package leetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Driver {

	public static void main(String[] args) 
	{
		MergeSort ms = new  MergeSort();
		int[] arr = {1,4,3,5,2};
		int[] ans = ms.sort(arr);
		
		for(int i=0; i < ans.length; i++)
		{
			System.out.println(ans[i]);
		}
	}

}

