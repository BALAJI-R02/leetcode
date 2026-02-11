// Last updated: 2/11/2026, 2:00:17 PM
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int oc=0;
        if(arr.length<3) return false;
        for(int i=0;i<3;i++){
            if(arr[i]%2!=0) oc++;
        }
        if(oc==3) return true;
        for(int i=1;i<arr.length-3+1;i++){
            if(arr[i-1]%2!=0) oc--;
            if(arr[i+3-1]%2!=0) oc++;
            if(oc==3) return true;
        }
        return false;

    }
}