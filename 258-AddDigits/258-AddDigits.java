// Last updated: 2/11/2026, 2:00:59 PM
class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int s=num;
            int a=0;
            while(s!=0){
                int d=s%10;
                a=a+d;
                s=s/10;
            }
            num=a;
        }
        return num;
    }
}