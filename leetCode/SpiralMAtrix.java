package leetCode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMAtrix 
{

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        
        int i, k=0,l=0;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        while(k<m && l<n)
        {
            for(i = l; i<n; ++i)
            {
                result.add(matrix[k][i]);
            }
            k++;
            
           for (i = k; i < m; ++i)
            {
                result.add(matrix[i][n-1]);
            }
            n--;
  
            
            if(k<m)
            {
                for(i=n-1;i>=l; --i)
                {
                    result.add(matrix[m-1][i]);
                }
                m--;
                
            }
            
            if (l < n)
            {
                for (i = m-1; i >= k; --i)
                {
                    result.add(matrix[i][l]);
                }
                l++;    
            }  
                               
        }
        
        return result;
    }
}
