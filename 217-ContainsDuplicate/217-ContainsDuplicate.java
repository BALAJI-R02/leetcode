// Last updated: 2/11/2026, 2:01:03 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new LinkedHashSet();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}