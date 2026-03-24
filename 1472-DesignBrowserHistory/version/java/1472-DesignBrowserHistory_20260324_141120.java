// Last updated: 3/24/2026, 2:11:20 PM
1class BrowserHistory {
2    class Node{
3        String url;
4        Node prev;
5        Node next;
6        Node(String url){
7            this.url=url;
8            prev=null;
9            next=null;
10        }
11    } 
12    Node curr;
13    public BrowserHistory(String homepage) {
14        curr=new Node(homepage);
15    }
16    
17    public void visit(String url) {
18        Node nn=new Node(url);
19        curr.next=nn;
20        nn.prev=curr;
21        curr=nn;
22    }
23    
24    public String back(int steps) {
25        while(curr.prev!=null && steps>0){
26            curr=curr.prev;
27            steps-=1;
28        }
29        return curr.url;
30    }
31    
32    public String forward(int steps) {
33       while(curr.next!=null && steps>0){
34        curr=curr.next;
35        steps-=1;
36       } 
37       return curr.url;
38    }
39}
40
41/**
42 * Your BrowserHistory object will be instantiated and called as such:
43 * BrowserHistory obj = new BrowserHistory(homepage);
44 * obj.visit(url);
45 * String param_2 = obj.back(steps);
46 * String param_3 = obj.forward(steps);
47 */