// Last updated: 2/11/2026, 2:00:02 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        int re=0;
        int num1=num;
        while(num!=0){
            int d=num%10;
            re=re*10+d;
            num=num/10;
        }
        int re1=0;
        while(re!=0){
            int d1=re%10;
            re1=re1*10+d1;
            re=re/10;
        }
        if(re1==num1){
            return true;
        }
        else
        return false;
    }
}