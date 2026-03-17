// Last updated: 3/17/2026, 12:13:48 PM
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack<Integer> st=new Stack<>();
4        for(String x:tokens){
5            if(x.equals("+")){
6                int a=st.pop();
7                int b=st.pop();
8                st.push(a+b);
9            }
10            else if(x.equals("-")){
11                int a=st.pop();
12                int b=st.pop();
13                st.push(b-a);
14            }
15            else if(x.equals("*")){
16                int a=st.pop();
17                int b=st.pop();
18                st.push(a*b);
19            }
20            else if(x.equals("/")){
21                int a=st.pop();
22                int b=st.pop();
23                st.push(b/a);
24            }
25            else
26            st.push(Integer.parseInt(x));
27        }
28        return st.pop();
29    }
30}