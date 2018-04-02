package leetCode;

public class InsertionSort 
{
	public int[] sortColors(int[] arr) {
		int i, key, j;
		int n = arr.length;
		for (i = 1; i < n; i++)
		{
			key = arr[i];
			j = i-1;


			while (j >= 0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
		
		return arr;
	}
}
