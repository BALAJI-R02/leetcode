// Last updated: 2/11/2026, 1:59:51 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target)
            c++;
        }
        return c;
    }
}