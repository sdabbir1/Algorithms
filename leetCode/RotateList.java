package leetCode;

import java.util.ArrayList;
import java.util.List;

public class RotateList 
{

    public ListNode rotateRight(ListNode head, int k) {
        int counter = 1;
        List<Integer> result = new ArrayList<>();
          ListNode dummy = new ListNode(0);
          dummy.next=head;
          ListNode lp = head;
        
        while(counter < k)
        {
            lp = lp.next;
            counter++;
        }
        
        while(lp.next!=null)
        {
            result.add(head.val);
            head = head.next;
            dummy.next = head;
            lp = lp.next;
        }
        
        
        //lp = lp.next;
        
        for(int i=0; i < result.size(); i++)
        {
            lp.next = new ListNode(result.get(i));
            lp = lp.next;
        }
        return head;
    }
}
