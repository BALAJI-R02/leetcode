// Last updated: 2/11/2026, 2:01:01 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }else{
        char[]arr=s.toCharArray();
        char[]arr1=t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr1[i]){
                count++;
            }else{
                count=0;
            }
        }
        if(count==arr.length)
        return true;
        else
        return false;
    }}
}