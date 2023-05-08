// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string

class Solution {
    public int strStr(String haystack, String needle) {
        
        if(haystack.contains(needle)){
            for(int i=0;i<haystack.length()-needle.length()+1;i++){
                if(haystack.charAt(i)==needle.charAt(0)){
                    int count=0;
                    int k=i;
                    int j=0;
                    while(haystack.charAt(k)==needle.charAt(j)){
                        k++;
                        j++;
                        count++;
                        if(count==needle.length()){
                        return i;
                        }
                    }
                    
                }
            }
        }
        else{
            return -1;
        }

        return -1;
    }
}