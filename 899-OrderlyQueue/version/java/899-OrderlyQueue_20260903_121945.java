// Last updated: 9/3/2026, 12:19:45 PM
1class Solution {
2    public String orderlyQueue(String s, int k) {
3        if(k==1){
4            String ans=s;
5            for(int i=1;i<s.length();i++){
6                String temp=s.substring(i)+s.substring(0,i);
7                if(temp.compareTo(ans)<0)
8                ans=temp;
9            }
10            return ans;
11        }
12        
13        char arr[]=s.toCharArray();
14        Arrays.sort(arr);
15        return new String(arr);
16    }
17}