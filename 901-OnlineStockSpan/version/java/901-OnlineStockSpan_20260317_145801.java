// Last updated: 3/17/2026, 2:58:01 PM
1class StockSpanner {
2    Stack<int[]> st = new Stack<>();
3    public int next(int price) {
4        int d=1;
5        while(!st.isEmpty() && st.peek()[0]<=price){
6            d+=st.pop()[1];
7        }
8        st.push(new int[]{price,d});
9        return d;
10    }
11}