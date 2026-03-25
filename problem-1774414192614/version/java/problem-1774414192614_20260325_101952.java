// Last updated: 3/25/2026, 10:19:52 AM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node prev;
6    public Node next;
7    public Node child;
8};
9*/
10
11class Solution {
12    public Node flatten(Node head) {
13        if(head==null)
14        return head;
15        Node curr=head;
16        while(curr!=null){
17            if(curr.child!=null){
18                Node up=curr.next;
19        curr.next=flatten(curr.child);
20        curr.next.prev=curr;
21        curr.child=null;
22        while(curr.next!=null){
23            curr=curr.next;
24        }
25        if(up!=null){
26            curr.next=up;
27            up.prev=curr;
28        }
29        }
30        curr=curr.next;
31        }
32        return head;
33           
34        
35    }
36    
37}