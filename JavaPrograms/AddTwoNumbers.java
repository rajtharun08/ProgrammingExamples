public class AddTwoNumbers {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        int carry=0;
        while(t1!=null || t2!=null)
        {
            int sum=carry;
            if(t1!=null) sum+=t1.val;
            if(t2!=null) sum+=t2.val;
            carry=sum/10;
            temp.next=new ListNode(sum%10);
            temp=temp.next;
            if(t1!=null) t1=t1.next;
            if(t2!=null) t2=t2.next;
        }
        if(carry>0)
        {
            temp.next=new ListNode(carry);
        }
        return dummy.next;
    }
}
