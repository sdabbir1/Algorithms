package leetCode;

public class DecodeWays 
{
	char[] dict = new char[26];
	int res;
	
	//Map<Integer,Integer> m = new HashM
	public int numDecodings(String s)
	{
		
		/*for(int i=0; i < 26; i++)
		{
			dict[i] = (char)(i+1);
		}*/
		
		int n = s.length();
		if(Integer.parseInt(s.substring(n-2)) < 26)
		{
			res = numDecodings(s.substring(0, n)) + numDecodings(s.substring(0, n-1));
		}
		else
		{
			res = numDecodings(s.substring(0, n-1 ));
		}
		return res;
	}
}
