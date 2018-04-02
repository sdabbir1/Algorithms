package leetCode;

import java.util.Arrays;

public class setZeros 
{

	public int[][] setZeroes(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int[][] res = new int[m][n]; 

		for(int[] row: res)
		{
			Arrays.fill(row,-1);
		}

		for(int i=0; i<m; i++)
		{
			for(int j=0; j< n; j++)
			{
				if(matrix[i][j] ==0)
				{
					convert(res,i,j);
				}
				else if(matrix[i][j] !=0 && res[i][j] ==0)
				{
					res[i][j] = res[i][j];
				}
				else
				{
					res[i][j] = matrix[i][j];
				}
			}
		}

		matrix = res;

		return matrix;
	}

	public void convert(int[][] res, int row, int column)
	{
		int m = res.length;
		int n = res[0].length;
		for(int i=0; i < n; i++)
		{
			res[row][i] =0;
		}

		for(int i=0; i < m; i++)
		{
			res[i][column] =0;
		}
	}


	
}
