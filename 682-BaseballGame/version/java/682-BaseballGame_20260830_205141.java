// Last updated: 8/30/2026, 8:51:41 PM
1class Solution {
2    public int calPoints(String[] operations) {
3        Stack<Integer> stack=new Stack<>();
4        for(String a:operations){
5            if(a.equals("C"))
6            stack.pop();
7            else if(a.equals("D"))
8            stack.push(stack.peek()*2);
9            else if(a.equals("+")){
10                int l=stack.pop();
11                int sl=stack.peek();
12                stack.push(l);
13                stack.push(l+sl);
14            }
15            else
16            stack.push(Integer.parseInt(a));
17        }
18        int op=0;
19        for(int b:stack)
20        op+=b;
21        return op;
22    }
23}