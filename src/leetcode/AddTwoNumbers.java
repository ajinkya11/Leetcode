/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author Ajinkya
 */

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}


public class AddTwoNumbers 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode result = new ListNode(0);
        ListNode head = result;
        int carry = 0;
        while(l1 != null && l2 != null)
        {
            ListNode inner = new ListNode((l1.val + l2.val + carry)%10);
            carry = (l1.val + l2.val + carry)/10;
            result.next = inner;
            l1 = l1.next;
            l2 = l2.next;
            result = result.next;
        }
        while(l1 != null)
        {
            ListNode inner = new ListNode((l1.val + carry)%10);
            carry = (l1.val + carry)/10;
            result.next = inner;
            l1 = l1.next;
            result = result.next;
        }
        while(l2 != null)
        {
            ListNode inner = new ListNode((l2.val + carry)%10);
            carry = (l2.val + carry)/10;
            result.next = inner;
            l2 = l2.next;
            result = result.next;
        }
        if(carry > 0)
        {
            ListNode inner = new ListNode(carry);
            result.next = inner;
        }
        return head.next;
    }

}
