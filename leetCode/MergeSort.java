package leetCode;

public class MergeSort {
	
	public int[] sort(int[] arr)
	{
		helper(arr,0,arr.length-1);
		
		return arr;
	}

	private void helper(int[] arr , int l, int r) {
		// TODO Auto-generated method stub
		if(l < r)
		{
			int m  = (l+r)/2;
			
			helper(arr,l,m);
			helper(arr, m+1,r);
			
			merger(arr,l,m,r);
			
		}
	}

	private void merger(int[] arr, int l, int m, int r) {
		// TODO Auto-generated method stub
		
		int n1 = m-l +1;
		int n2 = r-m;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
		
		int k =l;
		int i=0,j=0;
		while(i < n1 && j < n2)
		{
			if(L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		if(i < n1)
		{
			for(int p = i; p<n1; p++)
			{
				arr[k] = L[p];
				p++;
				k++;
			}
		}
		
		if(j < n2)
		{
			for(int p = j; p<n2; p++)
			{
				arr[k] = R[p];
				p++;
				k++;
			}
		}
		
	}

}
