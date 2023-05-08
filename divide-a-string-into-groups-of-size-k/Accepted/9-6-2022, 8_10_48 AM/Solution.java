// https://leetcode.com/problems/divide-a-string-into-groups-of-size-k

class Solution {
    public String[] divideString(String s, int k, char fill) {
          List<String>str=new ArrayList<>();
         int len=s.length();
        while (len%k!=0){
             s+=fill;
              len++;
        }
        for (int i=0;i<len;i+=k){
            String sub=s.substring(i,Math.min(k+i,s.length()));
            str.add(sub);
        }
        return str.toArray(new String[0]);
        
    }
}