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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0);
        ListNode new_list_head = temp;

        while(list1 != null & list2 != null){
            if(list1.val < list2.val){
                new_list_head.next = list1;
                list1 = list1.next;
            }
            else{
                new_list_head.next = list2;
                list2 = list2.next;
            }
            new_list_head = new_list_head.next;
        }
        if(list1 != null){
            new_list_head.next = list1;
        }else{
            new_list_head.next = list2;
        }

        return temp.next;
    }
}