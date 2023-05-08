// https://leetcode.com/problems/jewels-and-stones

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        for(int i=0;i<stones.length();i++)
        {
            if(jewels.indexOf(stones.charAt(i))!=-1)c+=1;
        }
        return c;
    }
}