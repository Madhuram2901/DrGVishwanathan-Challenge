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
class Solution {
    public ListNode Reverse(ListNode head){
        ListNode temp = head;
        ListNode before = null;

        while(temp != null){
            ListNode after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
        return before;
    }



    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = Reverse(slow.next);

        while(second != null){
            if(head.val != second.val){
            return false;
            }

            head = head.next;
            second = second.next;
        }
        return true;
        
        
    }  
}