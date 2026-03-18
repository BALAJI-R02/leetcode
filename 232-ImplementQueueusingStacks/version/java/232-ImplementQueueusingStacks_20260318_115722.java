// Last updated: 3/18/2026, 11:57:22 AM
1class MyQueue {
2Stack<Integer>st;
3Stack<Integer>hst;
4    public MyQueue() {
5      st=new Stack<>();
6      hst=new Stack<>();
7
8    }
9    
10    public void push(int x) {
11        while(!st.isEmpty()){
12            hst.push(st.pop());
13
14        }
15        st.push(x);
16        while(!hst.isEmpty()){
17            st.push(hst.pop());
18        }
19    }
20    
21    public int pop() {
22        return st.pop();
23    }
24    
25    public int peek() {
26        return st.peek();
27    }
28    
29    public boolean empty() {
30        return st.isEmpty();
31    }
32}
33
34/**
35 * Your MyQueue object will be instantiated and called as such:
36 * MyQueue obj = new MyQueue();
37 * obj.push(x);
38 * int param_2 = obj.pop();
39 * int param_3 = obj.peek();
40 * boolean param_4 = obj.empty();
41 */