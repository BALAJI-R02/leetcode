// Last updated: 6/5/2026, 12:24:57 PM
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
12    public void reorderList(ListNode head) {
13        ListNode slow=head;
14        ListNode fast=head;
15        while(fast!=null && fast.next!=null){
16            slow=slow.next;
17            fast=fast.next.next;
18        }
19        ListNode curr=slow.next;
20        slow.next=null;
21        ListNode prev=null;
22        ListNode next=null;
23        while(curr!=null){
24            next=curr.next;
25            curr.next=prev;
26            prev=curr;
27            curr=next;
28        }
29        ListNode h1=head;
30        ListNode h2=prev;
31        while(h2!=null){
32            ListNode t1=h1.next;
33            ListNode t2=h2.next;
34            h1.next=h2;
35            h2.next=t1;
36            h1=t1;
37            h2=t2;
38        }
39    }
40}