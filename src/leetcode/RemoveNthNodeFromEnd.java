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
public class RemoveNthNodeFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode firstPass = head;
        int sw = n - 1;
        while (sw != 0) {
            firstPass = firstPass.next;
            sw--;
        }
        if (firstPass.next == null) {
            return head.next;
        }
        ListNode finalPass = head;
        ListNode parent = head;
        while (firstPass.next != null) {
            firstPass = firstPass.next;
            parent = finalPass;
            finalPass = finalPass.next;
        }
        parent.next = finalPass.next;
        return head;
    }
}
