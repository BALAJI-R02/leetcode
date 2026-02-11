// Last updated: 2/11/2026, 2:01:45 PM
class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int digit;
        int n=0;
        if(x<0 || (x%10==0 && x!=0)){
            return false;
        }
        while(x!=0){
            digit=x%10;
            n=n*10+digit;
            x=x/10;

        }
        if(temp==n){
            return true;
        }
        else{
            return false;
        }
    }
}