// Last updated: 5/1/2026, 10:36:23 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode extra = new ListNode(0, head);
14        ListNode dummy = extra;
15        for (int i = 0; i < n; i++) 
16            head = head.next;
17        while (head != null) {
18            head = head.next;
19            dummy = dummy.next;
20        }
21        dummy.next = dummy.next.next;
22        return extra.next;        
23    }
24}