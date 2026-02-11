// Last updated: 2/11/2026, 2:01:13 PM
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String a=s.replaceAll(" +"," ");
        String[]arr=a.split(" ");
        String arr1[]=new String[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            arr1[i]=arr[arr.length-1-i];
        }
        return String.join(" ",arr1);
        //for(int i=0;i<arr1.length;i++)

        // StringBuilder str=new StringBuilder(a);
        // str.reverse();
        // return str.toString();
    }
}