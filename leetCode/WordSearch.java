package leetCode;

import java.util.Arrays;

public class WordSearch 
{
	public boolean exist(char[][] board, String word) 
	{
		boolean flag = false;
		int n = board.length;
		int m = board[0].length;
		String w1="";
		String w2 ="";
		char[] a1 = new char[m];
		char[] a2 = new char[n];
		int i,j=0;
		for( i =0; i <n; i++)
		{
			j = i;
			while(j <m)
			{
				if(board[i][j] == word.charAt(0))
				{
					break;
				}
				
				else if(board[j][i] == word.charAt(0))
				{
					break;
				}
			}
		}
		
		System.out.println(i+"\t"+j);
		
		return flag;
		
		
	}
}
