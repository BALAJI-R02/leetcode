// Last updated: 2/11/2026, 1:59:48 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
       ArrayList<Integer> list=new ArrayList<>();
       String empty=""+x;
       for(int i=0;i<words.length;i++){
        if(words[i].contains(empty)){
            list.add(i);
        }
       } 
       return list;
    }
}