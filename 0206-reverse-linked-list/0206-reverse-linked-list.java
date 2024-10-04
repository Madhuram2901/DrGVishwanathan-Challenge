/*public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
     ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }*/
 
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode before = null; 
        ListNode temp = head; 
                
        while (temp != null) {
            ListNode after = temp.next; 
            temp.next = before; 
            before = temp; 
            temp = after;
        }
        return before;
        }
}