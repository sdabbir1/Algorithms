package leetCode;

import java.util.ArrayList;
import java.util.List;

public class ReorderList 
{

	public void reorderList(ListNode head) {
		List<ListNode> nodes_1 = new ArrayList<ListNode>();
		List<ListNode> nodes_2 = new ArrayList<ListNode>();
		ListNode p = head;
		while(p.next != null)
		{
			nodes_1.add(p);
			p = p.next;
		}
		nodes_1.add(p);
		int n = nodes_1.size();

		for(int i = n/2; i < n; i++)
		{
			nodes_2.add(nodes_1.get(i));
		}
		
		nodes_1 = nodes_1.subList(0, n/2);
		
		for(int i = 0; i < nodes_1.size()-1; i++)
		{
			nodes_1.get(i).next = nodes_1.get(i+1);
		}
		for(int i = 0; i < nodes_2.size()-1; i++)
		{
			nodes_2.get(i).next = nodes_2.get(i+1);
		}
		
		ListNode p1 = nodes_1.get(0);;
		ListNode p2 = nodes_2.get(0);
		int i=0;
		while(p2!=null)
		{
			 ListNode t1 = p1.next;
			 ListNode t2 = p2.next;
			 p1.next = p2;
			 p2.next = t1;
			 
			 p1 = t1;
			 p2= t2;
			 
		}
		
	}
}
