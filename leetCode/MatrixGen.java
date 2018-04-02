package leetCode;

public class MatrixGen 
{

	public int[][] generateMatrix(int n) {

		int[][] result = new int[n][n];
		int counter = 1;
		int p = n;
		int q =n;
		int i, k=0,l=0;

		while(k < p && l < q)
		{
			for( i=l ; i <q; ++i)
			{
				result[k][i] = counter;
				counter++;
			}
			k++;

			for(i=k; i <q ; ++i)
			{
				result[i][q-1] = counter;
				counter++;
			}
			q--;

			if(k < p)
			{
				for(i=q-1; i>=l;--i)
				{
					result[p-1][i] = counter;
					counter++;
				}
				p--;
			}

			if(l<q)
			{
				for(i=p-1; i>=k; --i)
				{
					result[i][l] = counter;
					counter++;
				}
				l++;
			}
		}

		return result;
	}
}
