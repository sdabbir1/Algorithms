package leetCode;

public class ReverseLinkedListII 
{
	public ListNode reverseBetween(ListNode head, int m, int n) 
	{
		ListNode dummy = new ListNode(0);
		int[] arr = new int[n-m+1];
		dummy.next = head;
		ListNode p = dummy;
		ListNode q = dummy;
		
		for(int i =1; i <m; i++)
		{
			p= p.next;
			q= q.next;
		}

		for(int i=n-m; i>=0; i--)
		{
			q=q.next;
			p.next = q;
			arr[i] = q.val;
		}
		
		q = q.next;
		p.next = q;
		for(int i=0; i<arr.length; i++)
		{

			p.next = new ListNode(arr[i]);
			p = p.next;
		}

		p.next = q;

		return dummy.next;
	}
}
