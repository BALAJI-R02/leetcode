// Last updated: 9/11/2026, 11:43:07 AM
1class Solution {
2    public int totalNumbers(int[] digits) {
3        Set<Integer> hs=new HashSet<>();
4        int a=digits.length;
5        for(int i=0;i<a;i++){
6            if(digits[i]==0)
7            continue;
8            for(int j=0;j<a;j++){
9                if(i==j)
10                continue;
11                for(int k=0;k<a;k++){
12                    if(k==i || k==j)
13                    continue;
14                    if(digits[k]%2!=0)
15                    continue;
16                    int n=digits[i]*100+digits[j]*10+digits[k]*1;
17                    hs.add(n);
18                }
19            }
20        }
21        return hs.size();
22    }
23}