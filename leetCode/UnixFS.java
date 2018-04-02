package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnixFS 
{
	public String simplifyPath(String path) {
		List<String> fol = new ArrayList<>(Arrays.asList(path.split("/")));
		while(fol.remove(""));
		while(fol.remove("."));
		StringBuilder sb = new StringBuilder();
		sb.append("/");
		for(int i=0; i<fol.size(); i++)
		{
			if(fol.get(i).equals(".."))
			{
				if(i!=0)
				{
					fol.remove(i);
					fol.remove(i-1);
					i-=2;
				}
				else
				{
					return "/";
				}
				
			}

			else if(fol.get(i).equals("/"))
			{
				fol.remove(i);
			}
		}

		for (int i = 0; i < fol.size(); i++) 
		{
			sb.append(fol.get(i));
			sb.append("/");
		}
		if(sb.length()!=1)
		sb.deleteCharAt(sb.length()-1);
		return sb.toString();
	}
}
