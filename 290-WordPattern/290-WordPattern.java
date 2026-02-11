// Last updated: 2/11/2026, 2:00:54 PM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> a=new HashMap<>();
        String arr[]=s.trim().split("\\s+");
        if(pattern.length()!=arr.length) 
        return false;
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(a.containsKey(ch)){
                if(!a.get(ch).equals(arr[i])){
                    return false;
                }
            }
            else
            {
                if(a.containsValue(arr[i]))
                return false;
                a.put(ch,arr[i]);
            }
        }
        return true;
    }
}