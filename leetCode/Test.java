package Testhere;

import javax.lang.model.util.Elements;

public class Test {
	
	static int elements[] = {1,3,4};
	static int S = 4;
	static String  P[][];
 
	
	public static void main(String[] args)
	{
		
		int i,j;
		P[0][0] = "T";
		for (i = 0; i <= elements.length; i++) 
		{
			P[i][0] = "T";		
		}
		for (j = 1; j <= S; j++) 
		{
			P[0][j] = "F";
		}
		
		for (int j2 = 1; j2 <= elements.length; j2++) 
		{
			for (int k = 1; k <= S; k++) 
			{
				if(P[j2-1][k] == "T")
				{
					P[j2][k] = "T";
				}
				else 
				{
					P[j2][k] = P[j2-1][k-elements[j2]];
				}
			}
		}
		
		for (int j2 = 0; j2 < elements.length; j2++) 
		{
			for (int k = 0; k < S; k++) 
			{
				System.out.println(P[j2][k] +"");
			}
			System.out.println();
		}
		
	}
}