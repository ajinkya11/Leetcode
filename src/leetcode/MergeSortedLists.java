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
public class MergeSortedLists 
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        ListNode newHead = new ListNode(0);
        ListNode newPointer = newHead;
        
        while(l1 != null && l2 != null)
        {
            if(l1.val < l2.val)
            {
                newPointer.next = l1;
                l1 = l1.next;
                newPointer = newPointer.next;
            }
            else
            {
                newPointer.next = l2;
                l2 = l2.next;
                newPointer = newPointer.next;
            }
        }
        while(l1 != null)
        {
            newPointer.next = l1;
            l1 = l1.next;
            newPointer = newPointer.next;
        }
        while(l2 != null)
        {
            newPointer.next = l2;
            l2 = l2.next;
            newPointer = newPointer.next;
        }
        
        return newHead.next;
    } 

}
