// Last updated: 3/26/2026, 9:25:10 AM
1class Solution {
2    public int countStudents(int[] students, int[] sandwiches) {
3        Stack<Integer> st=new Stack<>();
4        Queue<Integer> q=new LinkedList<>();
5        for(int i=0;i<students.length;i++)
6        q.add(students[i]);
7        for(int i=sandwiches.length-1;i>=0;i--)
8        st.push(sandwiches[i]);
9        int rej=0;
10        while(!st.isEmpty() && !q.isEmpty()){
11            if(st.peek().equals(q.peek())){
12                st.pop();
13                q.remove();
14                rej=0;
15            }
16            else
17            {
18                q.add(q.remove());
19                rej+=1;
20                if(rej==q.size())
21                return q.size();
22            }
23        }
24        return 0;
25    }
26}