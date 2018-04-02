package leetCode;

public class WordComb 
{
	public void helper(String s)
	{
		int comb = 1 << s.length();   //the total number of combinations. Left binary shift gives 2^n.

		for (int i=0; i<comb; i++) { // using this as a pivot to generate the combinations.
		  StringBuilder sb = new StringBuilder(s);
		  for (int j=0; j<s.length(); j++) {  //running through the indices to see the compatible combinations.
		    if ((i & 1<<j) != 0) { //bitwise AND. To choose which index to convert to uppercase.
		      String temp = s.substring(j, j+1).toUpperCase(); //Converting the char at an index to uppercase.
		      sb.replace(j, j+1, temp);
		    }
		  }
		  System.out.println(sb);
		}
	}
}
