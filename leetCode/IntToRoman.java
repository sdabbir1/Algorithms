package Testhere;

import java.util.HashMap;
import java.util.Map;

public class IntToRoman {

    public String intToRoman(int num) {
        Map<Integer,String> dict = new HashMap<Integer,String>();
        dict.put(0, "");
        dict.put(1,"I");
        dict.put(2,"II");
        dict.put(3,"III");
        dict.put(4,"IV");
        dict.put(5,"V");
        dict.put(6,"VI");
        dict.put(7,"VII");
        dict.put(8,"VIII");
        dict.put(9,"IX");
       /**/
        dict.put(10,"X");
        dict.put(20,"XX");
        dict.put(30,"XXX");
        dict.put(40,"XL");
        dict.put(50,"L");
        dict.put(60,"LX");
        dict.put(70,"LXX");
        dict.put(80,"LXXX");
        dict.put(90,"XC");
       /**/
        dict.put(100,"C");
        dict.put(200,"CC");
        dict.put(300,"CCC");
        dict.put(400,"CD");
        dict.put(500,"D");
        dict.put(600,"DC");
        dict.put(700,"DCC");
        dict.put(800,"DCCC");
        dict.put(900,"CM");
        /**/
        dict.put(1000,"M");
        dict.put(2000,"MM");
        dict.put(3000,"MMM");
        dict.put(4000,"MMMM");
        
        int div =num;
		int rem =0;
        String finalVal = "";
        int n = (int)(Math.log10(num)+1);
        System.out.println(n);
        for(int i =0; i < n; i++)
        {
        	rem = (int) ((div%10)*Math.pow(10, i));
            div = div/10;
            if(dict.get(rem) !=null)
            finalVal = dict.get(rem)+finalVal;
        }
        return finalVal;
    }

}
