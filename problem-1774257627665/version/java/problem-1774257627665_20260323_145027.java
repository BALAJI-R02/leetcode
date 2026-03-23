// Last updated: 3/23/2026, 2:50:27 PM
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
12    public boolean isPalindrome(ListNode head) {
13        ListNode slow=head;
14        ListNode fast=head;
15        while(fast!=null && fast.next!=null){
16            slow=slow.next;
17            fast=fast.next.next;
18        }
19        ListNode fh=head;
20        ListNode sh=slow;
21        ListNode curr=sh;
22        ListNode pre=null,next=null;
23        while(curr!=null){
24            next=curr.next;
25            curr.next=pre;
26            pre=curr;
27            curr=next;
28        }
29        sh=pre;
30        while(sh!=null){
31            if(fh.val!=sh.val)
32            return false;
33            sh=sh.next;
34            fh=fh.next;
35        }
36        return true;
37    }
38}