package Testhere;

public class mergedArray {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] arr3 = new int[l1+l2];
        int i=0,j=0,k=0;
        
        if(l1 ==0)
        {
            arr3 = nums2;
        }
        else if(l2 ==0)
        {
            arr3 = nums1;
        }
        else
        {
            while(i<l1 && j <l2)
        {
            if(nums1[i] < nums2[j])
            {
                arr3[k] = nums1[i];
                i++;
            }
            else
            {
                arr3[k] = nums2[j];
                j++;
            }
            k++;
        }
        
        if(i<l1)
        {
            System.arraycopy(nums1,i,arr3,k,l1-i);
        }
        
        if(j<l2)
        {
            System.arraycopy(nums2,j,arr3,k,l2-i);
        }
        }
        
        int f1 = arr3.length;
        double res = 0;
        if(f1 == 1)
        {
            res = arr3[f1-1];
        }
        else
        {
            switch (f1%2) {
		case 1:
			res = arr3[(f1-1)/2];
			break;
        case 0:
        	double a = (double)arr3[(f1/2)-1];
        	double b = (double)arr3[(f1/2)];
            res =  ((a+b)/2) ;     
		default:
			break;
		}
        }
        
        return res;
    }
}
