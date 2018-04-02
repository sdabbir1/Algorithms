package Testhere;

import javax.swing.text.AbstractDocument.LeafElement;

public class IntegerParser 
{
	static int value = 708;
	static String strVal = Integer.toString(value);
	static String[] split = strVal.split("");
	
	public static void main(String[] args)
	{
		int len = split.length;
		//System.out.println(split.length);
		for (int i = 1; i <= split.length; i++) {
			//System.out.println(split[len -i]);
		}
		for(int i=0;i<0;i++)
		{
			System.out.println(i);
		}
		
	}
}
