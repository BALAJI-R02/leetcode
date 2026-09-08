// Last updated: 9/8/2026, 3:00:35 PM
1class Solution {
2    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
3        ListNode dummy = new ListNode();
4        ListNode res = dummy;
5        int total = 0, carry = 0;
6        while (l1 != null || l2 != null || carry != 0) {
7            total = carry;
8
9            if (l1 != null) {
10                total += l1.val;
11                l1 = l1.next;
12            }
13            if (l2 != null) {
14                total += l2.val;
15                l2 = l2.next;
16            }
17            int num = total % 10;
18            carry = total / 10;
19            dummy.next = new ListNode(num);
20            dummy = dummy.next;
21        }
22        return res.next;        
23    }
24}