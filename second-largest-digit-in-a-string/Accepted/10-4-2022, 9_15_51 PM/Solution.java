// https://leetcode.com/problems/second-largest-digit-in-a-string

class Solution {
    public int secondHighest(String s) {
        // Integer map for storing digits
        int map = 0;
        // For keeping count of digits processed
        int bCount = 0;
        for(char c : s.toCharArray()){
            // If current character is a digit and is not stored
            // in the map
            if(Character.isDigit(c) && (map&(1<<(c-'0'))) == 0){
                // Turn the bit on at respective digit position in map
                map|=(1<<(c-'0'));
                bCount++;
                // Since we need second largest, after 2 unique digits
                // we need to discard smallest digit in the map
                if(bCount > 2) map&=(map-1);
            }
        }
        if(bCount < 2) return -1;
        for(int i = 0; i < 32; i++,map>>=1) if((map&1) == 1) return i;
        
        return -1;
    }
}