package leetCode;

import java.util.ArrayList;
import java.util.List;

public class SoS 
{

    public int[] twoSum(int[] numbers, int target)
    {
        int n = numbers.length;
        
        int[][] matrix = new int[n][target+1];
        
        for(int i=0; i < n; i++)
        {
            matrix[i][0] = 1;
        }
        
        for(int j=0; j<target; j++)
        {
            if(j!= numbers[0])
            {
                matrix[0][j] = 0;
            }
            else
            {
                matrix[0][j] = 1;
            }
            matrix[0][0] = 1;
        }
        
        
        for(int i=1; i< n; i++)
        {
            for(int j = 1; j <= target; j++)
            {
                if(numbers[i] > j)
                {
                    matrix[i][j] = matrix[i-1][j];
                }
                else 
                {
                    matrix[i][j] = matrix[i-1][j-numbers[i]];
                }
            }
        }
        
        int p = n-1;
        int k = target;
        List<Integer> res = new ArrayList<Integer>();
        while(k >0 && p >0)
        {
            if(matrix[p][k] != matrix[p-1][k])
            {
                res.add(p);
                k = k-numbers[p];
                p--;
            }
            else
            {
                p--;
            }
        }
        if(matrix[p][k] ==1)
        {
        	res.add(p);
        }
        
        int l = res.size();
        int[] result = new int[l];
        
        for(int i=l - 1; i >=0; i--)
        {
            result[l-i-1] = res.get(i);
        }
        
        return result;
    }
}
