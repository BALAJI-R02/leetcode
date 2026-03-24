// Last updated: 3/24/2026, 2:41:18 PM
1class Solution {
2    public ListNode oddEvenList(ListNode head) {
3        if(head == null || head.next == null) 
4            return head;
5        ListNode odd = head; 
6        ListNode even = head.next;
7        ListNode evenHead = even;
8        while(even!=null && even.next != null){
9            odd.next = even.next;
10            odd = odd.next;
11            even.next = even.next.next;
12            even = even.next;
13        }
14        odd.next = evenHead;
15        return head;
16    }
17}