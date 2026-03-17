// Last updated: 3/17/2026, 11:23:54 AM
class Solution{
    public int getSum(int a,int b){
        while(b!=0){
            int carry=(a & b)<<1;
            a=a ^ b;
            b=carry;
        }
        return a;
    }
}