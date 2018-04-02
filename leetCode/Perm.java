package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Perm 
{
	public List<List<Integer>> permute(int[] num, int k) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		permute(num, 0, result,k);
		return result;
	}
	void permute(int[] num, int start, List<List<Integer>> result, int k) {
		if (start >= num.length) {
			List<Integer> item = convertArrayToList(Arrays.copyOfRange(num, 0, k));
			Collections.sort(item);
			if(!result.contains(item))
			{
				result.add(item);
			}
			
		}
		for (int j = start; j <= num.length - 1; j++) {
			swap(num, start, j);
			permute(num, start + 1, result,k);
			swap(num, start, j);
		}
	}
	private List<Integer> convertArrayToList(int[] num) {
		List<Integer> item = new ArrayList<Integer>();
		for (int h = 0; h < num.length; h++) {
			item.add(num[h]);
		}
		return item;
	}
	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}}
