// Last updated: 2/11/2026, 2:00:34 PM
class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character>[] bucket = new ArrayList[s.length() + 1];
        for(char c : map.keySet()){
            int freq = map.get(c);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(c);
        }
        StringBuilder res = new StringBuilder();
        for(int i = bucket.length - 1; i >= 0; i--){
            if(bucket[i] != null){
                for(char c : bucket[i]){
                    for(int j = 0; j < i; j++){
                        res.append(c);
                    }
                }
            }
        }
        return res.toString();
    }
}