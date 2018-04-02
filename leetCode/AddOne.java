package leetCode;

public class AddOne 
{

    public int[] plusOne(int[] digits) {
        int carry = 1;
        int n = digits.length;
        int[] res;
        int i = n;
        for( i =n-1; i >0; i--)
        {
            if(digits[i] != 9)
            {
                break;
            }
            
        }
        
        if(i == 0)
        {
            res = new int[n+1];
            res[0] = 0;
            /*for(int j =1; j < res.length; j++)
            {
                newArr[j] = digits[j-1];
            }*/
            
            for(int k = n-1; k >=0; k--)
            {
                res[k+1] = (digits[k]+carry)%10;
                carry = (digits[k]+carry)/10;
            }
            res[0]+=carry;
            //return newArr;
        }
        
        else
        {
            res = new int[n];
            for(int k = n-1; k >=0; k--)
            {
                res[k] = (digits[k]+carry)%10;
                carry = (digits[k]+carry)/10;
            }
        }
        
        return res;
    }
}
