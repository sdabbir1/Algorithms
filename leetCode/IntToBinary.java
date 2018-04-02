package Testhere;

public class IntToBinary 
{
	public void int2Binary(int x)
	{
		long t = Integer.toUnsignedLong(x);
		
		String res = Long.toBinaryString(t | 0x100000000L).substring(1);
		
		StringBuilder sb = new StringBuilder();
		sb.append(res);
		
		sb = sb.reverse();
		
		res = sb.toString();
		
		char[] ch = res.toCharArray();
		int n =ch.length;
		int val =0;
		for(int i= n - 1; i >=0; i--)
		{
			if(ch[i] == '1')
			{
				 val++;
			}
		}
		
		System.out.println(val);
	}
}
