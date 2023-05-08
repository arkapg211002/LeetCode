// https://leetcode.com/problems/1-bit-and-2-bit-characters

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        for(int i = 0; i < bits.length; i++){
            if(bits[i] == 0 && i == bits.length - 1) return true;  // The bit string ends with a zero that is not part of another character (10)
            else if(bits[i] == 1) i++; // That means a start of a character (10 or 11) so skip it 
        }
        return false;
    }
}