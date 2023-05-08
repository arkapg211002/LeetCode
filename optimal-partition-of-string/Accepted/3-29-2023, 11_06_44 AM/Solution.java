// https://leetcode.com/problems/optimal-partition-of-string

class Solution {
    public int partitionString(String s) {
        int count=0;
        HashSet<Character> hs1=new HashSet<>();
        String str="";
        for(int i=0;i<s.length();i++){
            if(!hs1.contains(s.charAt(i))){
                str=str+s.charAt(i);
                hs1.add(s.charAt(i));
            }
            else{
                count++;
                str="";
                hs1.clear();
                i--;
            }
        }
        return count+1;
    }
}