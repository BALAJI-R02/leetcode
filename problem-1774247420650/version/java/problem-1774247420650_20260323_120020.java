// Last updated: 3/23/2026, 12:00:20 PM
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode dummy=new ListNode(0);
14        ListNode temp=dummy;
15        ListNode c1=list1;
16        ListNode c2=list2;
17        while(c1!=null && c2!=null){
18            if(c1.val>c2.val){
19                temp.next=c2;
20                c2=c2.next;
21            }
22            else{
23                temp.next=c1;
24                c1=c1.next;
25            }
26            temp=temp.next;
27        }
28        if(c1!=null)
29        temp.next=c1;
30        else
31        temp.next=c2;
32        return dummy.next;
33    }
34}