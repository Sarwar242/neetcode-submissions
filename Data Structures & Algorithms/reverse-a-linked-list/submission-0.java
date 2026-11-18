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
    public ListNode reverseList(ListNode head) {
              ListNode temp = head;
        Stack<ListNode> s = new Stack<ListNode>();
        if(temp==null) return head;
        while (temp != null) {
            s.push(temp);
            temp = temp.next;
        }
        if(!s.isEmpty()) {
            head = s.pop();
            temp = head;
            while (!s.isEmpty()) {
                temp.next = s.pop();
                temp = temp.next;
            }

            temp.next = null;
        }
        
        return head;
    }
}
